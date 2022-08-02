import Model.*;

import java.io.IOException;
import java.util.ArrayList;

public class BegegnungDataReader {


    private String pokemonName;





    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public BegegnungDataReader( String pokemonName) {

        this.pokemonName = pokemonName;
    }


    public ArrayList<BegegnungsDaten> getBegegnungen(int regID) throws IOException, InterruptedException {

        RegionErgebnis region = RequestHandler.getRegionByID(regID);
        ArrayList<BegegnungsDaten> daten = new ArrayList<>();

        region.getLocations().forEach(locationsItem -> {
            int locID = Integer.parseInt(locationsItem.getUrl().replaceFirst("https://pokeapi.co/api/v2/location/","").replace("/",""));
            LocationErgebnis location;
            try {
                 location = RequestHandler.getLocationByID(locID);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            location.getAreas().forEach(areasItem -> {

                int areaID = Integer.parseInt(areasItem.getUrl().replaceFirst("https://pokeapi.co/api/v2/location-area/","").replace("/",""));
                BegegnungResult begegnungResult;
                try {
                     begegnungResult = RequestHandler.getEncounterResultByID(areaID);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                begegnungResult.getPokemonEncounters().forEach(pokemonEncountersItem -> {

                    if (pokemonEncountersItem.getPokemon().getName().equals(pokemonName)){
                        //System.out.println("Pokemon "+pokemonName+ " kann man in der Region "+region.getName()+" hier finden: "+i.getName()+ " in der Area "+j.getName());
                        daten.add(new BegegnungsDaten(region,location,begegnungResult));
                    }


                });


            });

        });

        return daten;
}}
