import Model.*;
import ModelInterpreter.HelpfulMethods;
import ModelInterpreter.PokemonDataReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainController {



    public MainController() throws IOException, InterruptedException {
        runMain();
    }

    private void runMain() throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine ID ein");
        int id = scan.nextInt();

        System.out.println("Fetching Data...");
        PokemonDataReader pr = new PokemonDataReader(RequestHandler.getPokemonResultByID(id));
        BegegnungDataReader br = new BegegnungDataReader(pr.getName());

        System.out.println("Pokemon Name: "+ HelpfulMethods.capitalizeFirst(pr.getName()));
        System.out.println("First Appearance in Generation "+pr.firstGeneration());
        System.out.println("Pokemon National-Dex ID: "+pr.getID());
        System.out.println("Types: ");
        for(String s: pr.getTypes()){

            System.out.println(HelpfulMethods.capitalizeFirst(s));
        }
        System.out.println("For further information choose a generation:");
        int generation = scan.nextInt();
        System.out.println("Fetching Data...");
        System.out.println("In this Generation "+HelpfulMethods.capitalizeFirst(pr.getName())+ " has the Pokedex ID "+((pr.getIDInRegion(HelpfulMethods.intRegionToEnum(generation)) != -1) ? pr.getIDInRegion(HelpfulMethods.intRegionToEnum(generation)) : pr.getID()));
        System.out.println("In this Generation "+HelpfulMethods.capitalizeFirst(pr.getName())+ " learns the following moves:");
        Thread x =new Thread(new Runnable() {
            @Override
            public void run() {

                ArrayList<Fahigkeit> fahigkeiten = pr.getAbilitiesWithLvlGeneration(HelpfulMethods.intGenerationToEnum(generation));
                fahigkeiten.sort((o1, o2) -> Integer.compare(o1.getLevel(),o2.getLevel()));
                for (Fahigkeit s:fahigkeiten) {

                    System.out.println( HelpfulMethods.capitalizeFirst(s.getName())+ " at Level "+s.getLevel());
                }
            }
        });
        x.start();
        ArrayList<BegegnungsDaten> daten = new ArrayList<>();
       Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    daten.addAll(br.getBegegnungen(generation));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t.start();
        x.join();
        System.out.println("You can find this Pokemon in these Locations: ");
        t.join(5000);

        for(BegegnungsDaten d: daten){


            System.out.println(HelpfulMethods.capitalizeFirst(d.getRegion().getName())+ " in "+HelpfulMethods.capitalizeFirst(d.getLocation().getName())+ " in "+ d.getBegegnung().getName());




        }



        /*PokemonDataReader pr = new PokemonDataReader(RequestHandler.getPokemonResultByID(id));

        System.out.println(pr.getID() + " "+ pr.getName());
        for (String s: pr.getVersions()) {
           // System.out.println(s);
        }
        String[] split;
        ArrayList<Fahigkeit> fahigkeiten = pr.getAbilitiesWithLvlGeneration(GenerationsEnum.EIGHT);
        fahigkeiten.sort((o1, o2) -> Integer.compare(o1.getLevel(),o2.getLevel()));
        for (Fahigkeit s:fahigkeiten) {

            System.out.println(pr.getName()+ " lernt "+ s.getName()+ " bei Level "+s.getLevel()+ " in Version: "+s.getSpiel() );
        }

        for (String s: pr.getTypes()){

            System.out.println(s);


        }

        System.out.println("FIRST TIME: "+pr.firstGeneration());

        System.out.println("ID IN GEN 1: "+((pr.getIDInRegion(Regions.KANTO) != -1) ? pr.getIDInRegion(Regions.KANTO) : pr.getID()));

        */







    }


}
