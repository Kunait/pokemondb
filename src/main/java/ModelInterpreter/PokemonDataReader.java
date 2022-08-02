package ModelInterpreter;

import Model.*;
import ModelInterpreter.HelpfulMethods;

import java.util.ArrayList;
import java.util.List;

public class PokemonDataReader {

    public PokemonResult pokemon;


    public PokemonDataReader(PokemonResult pokemon) {
        this.pokemon = pokemon;
    }

    public String getName(){

        return pokemon.getName();

    }
    public int getID(){

        return pokemon.getId();

    }
    public ArrayList<String> getVersions(){

        ArrayList<String> versions = new ArrayList<>();

        for(GameIndicesItem i: pokemon.getGameIndices()){

            versions.add(i.getVersion().getName());

        }



        return versions;
    }



    public ArrayList<Fahigkeit> getAbilitiesWithLvlGeneration(GenerationsEnum e){

        ArrayList<Fahigkeit> abilities = new ArrayList<>();


        SubAbility sub = null;
        boolean checked = false;
        String[] checkStrings = HelpfulMethods.enumGenerationToString(e);

        for(MovesItem i: pokemon.getMoves()){
            sub = null;
            for(VersionGroupDetailsItem g : i.getVersionGroupDetails()){


                if(g.getLevelLearnedAt() != 0 && checked && sub!= null) {
                    boolean temp = false;
                    for (String s : checkStrings) {
                        if (g.getVersionGroup().getName().contains(s)) {
                            temp = true;
                        }
                    }
                    if(temp)
                    sub.setVersion(sub.getVersion() + ", " + g.getVersionGroup().getName());
                }else if(g.getLevelLearnedAt() !=0 && !checked) {
                    boolean temp = false;
                    for (String s : checkStrings) {
                        if (g.getVersionGroup().getName().contains(s)) {
                            temp = true;
                        }
                    }
                    if(temp) {
                        sub = new SubAbility(g.getVersionGroup().getName(), g.getLevelLearnedAt());
                        checked = true;
                    }
                }

            }

            if(sub!= null)
                abilities.add(new Fahigkeit(i.getMove().getName(),sub.getVersion(),sub.level));

            checked = false;

        }


        return abilities;

    }


        public ArrayList<String> getTypes(){

        ArrayList<String> types = new ArrayList<>();



            for(TypesItem s : pokemon.getTypes()){
                types.add(s.getType().getName());
            }


            return types;
        }

    public int firstGeneration(){
        int first = -1;
        String temp;
        String temp2;

        for (int i = 1; i <9 ; i++) {

            assert HelpfulMethods.enumGenerationGetLastGames(HelpfulMethods.intGenerationToEnum(i)) != null;

            for (int j = 0; j< pokemon.getGameIndices().size();j++) {
                 temp = pokemon.getGameIndices().get(j).getVersion().getName();
                 temp2 = HelpfulMethods.enumGenerationGetLastGames(HelpfulMethods.intGenerationToEnum(i));
                if (temp2.contains(temp)) { //pokemon.getMoves().get(0).getVersionGroupDetails().get(0).getVersionGroup().getName().contains(HelpfulMethods.enumGenerationGetLastGames(HelpfulMethods.intGenerationToEnum(i)))
                    first = i;
                    return first;
                }
            }

            first = i;
        }



        return first;
    }

    public int getIDInRegion(Regions r){

        int id = -1;
        int region = HelpfulMethods.enumRegionToInt(r);
        String temp = HelpfulMethods.enumGenerationGetLastGame(HelpfulMethods.intGenerationToEnum(region));
        List<GameIndicesItem> list = pokemon.getGameIndices();
        for(GameIndicesItem i: list ){


            if(i.getVersion().getName().contains(temp)) {
                id = i.getGameIndex();
                return id;
            }

        }




        return id;
    }


    public String getEncounterAreas(){


        return pokemon.getLocationAreaEncounters();
    }



}

