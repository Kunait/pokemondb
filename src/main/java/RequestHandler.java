


import Model.*;
import com.google.gson.Gson;
import javafx.scene.image.Image;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestHandler {

    private static final HttpClient client = HttpClient.newHttpClient();


    public static Image getImage(int pokemonID) throws IOException, InterruptedException {

        //https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/600.png

        HttpResponse<byte[]> response = client.send(HttpRequest.newBuilder(URI.create("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+pokemonID+".png")).GET().build(),HttpResponse.BodyHandlers.ofByteArray());
        byte[] imageByte = response.body();
        Image image = new Image(new ByteArrayInputStream(imageByte));


        return image;
    }

    public static PokemonResult getPokemonResultByID(int pokemonID) throws IOException, InterruptedException {

        HttpResponse<String> response = client.send(HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/pokemon/"+pokemonID)).GET().build(),HttpResponse.BodyHandlers.ofString());

        PokemonResult result = new Gson().fromJson(response.body(), PokemonResult.class);

        return result;
    }
    public static PokemonResult getPokemonResultByName(String pokemonID) throws IOException, InterruptedException {

        HttpResponse<String> response = client.send(HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/pokemon/"+pokemonID)).GET().build(),HttpResponse.BodyHandlers.ofString());

        PokemonResult result = new Gson().fromJson(response.body(), PokemonResult.class);

        return result;
    }

    public static BegegnungResult getEncounterResultByID(int locID) throws IOException, InterruptedException {

        HttpResponse<String> response = client.send(HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/location-area/"+locID)).GET().build(),HttpResponse.BodyHandlers.ofString());

        BegegnungResult result = new Gson().fromJson(response.body(), BegegnungResult.class);

        return result;
    }

    public static RegionErgebnis getRegionByID(int regID) throws IOException, InterruptedException {

        HttpResponse<String> response = client.send(HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/region/"+regID)).GET().build(),HttpResponse.BodyHandlers.ofString());


        RegionErgebnis result = new Gson().fromJson(response.body(), RegionErgebnis.class);

        return result;
    }

    public static LocationErgebnis getLocationByID(int locationID) throws IOException, InterruptedException {

        HttpResponse<String> response = client.send(HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/location/"+locationID)).GET().build(),HttpResponse.BodyHandlers.ofString());


        LocationErgebnis result = new Gson().fromJson(response.body(),LocationErgebnis.class);

        return result;

    }




}
