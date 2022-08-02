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

        for(LocationsItem i: region.getLocations()){

            int locID = Integer.parseInt(i.getUrl().replaceFirst("https://pokeapi.co/api/v2/location/","").replace("/",""));

            LocationErgebnis location = RequestHandler.getLocationByID(locID);

            for(AreasItem j: location.getAreas()){

                int areaID = Integer.parseInt(j.getUrl().replaceFirst("https://pokeapi.co/api/v2/location-area/","").replace("/",""));

                BegegnungResult begegnungResult = RequestHandler.getEncounterResultByID(areaID);
                for(PokemonEncountersItem k : begegnungResult.getPokemonEncounters()){

                    if (k.getPokemon().getName().equals(pokemonName)){
                        //System.out.println("Pokemon "+pokemonName+ " kann man in der Region "+region.getName()+" hier finden: "+i.getName()+ " in der Area "+j.getName());
                        daten.add(new BegegnungsDaten(region,location,begegnungResult));
                    }
                }


            }

        }
        return daten;
}}
