import Model.BegegnungsDaten;
import Model.Fahigkeit;
import Model.GenerationsEnum;
import Model.Regions;
import ModelInterpreter.HelpfulMethods;
import ModelInterpreter.PokemonDataReader;
import ModelInterpreter.RemindTask;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class PokemonController implements Initializable {


    private PokemonDataReader pr;
    private BegegnungDataReader br;

    private GenerationsEnum e = GenerationsEnum.ONE;

    @FXML
    Label name,id,first,types;

    @FXML
    ImageView image;

    @FXML
    ListView<BegegnungsDaten> encounters;

    @FXML
    ListView<Fahigkeit> moves;


    @FXML
    ChoiceBox<GenerationsEnum> generation;


    ArrayList<Fahigkeit> fahigkeiten;
    ArrayList<BegegnungsDaten> begegnungen;

    @FXML
    ProgressIndicator indicator;


    public void reload() throws InterruptedException {
        indicator.setVisible(true);
        moves.getItems().removeAll(fahigkeiten);
        encounters.getItems().removeAll(begegnungen);
        fahigkeiten.removeAll(fahigkeiten);
        begegnungen.removeAll(begegnungen);
        indicator.setVisible(true);


        Thread x =new Thread(new Runnable() {
            @Override
            public void run() {

                fahigkeiten.addAll(pr.getAbilitiesWithLvlGeneration(e));
                fahigkeiten.sort((o1, o2) -> Integer.compare(o1.getLevel(),o2.getLevel()));
                for (Fahigkeit s:fahigkeiten) {

                    //System.out.println( HelpfulMethods.capitalizeFirst(s.getName())+ " at Level "+s.getLevel());
                }
            }
        });
        x.start();

        x.join();
        moves.getItems().addAll(fahigkeiten);


        Task<Void> task = new Task<Void>() {
            @Override
            public Void call() throws Exception {
                try {
                    System.out.println("try "+e);
                    begegnungen.addAll(br.getBegegnungen(HelpfulMethods.enumGenerationToIntRegion(e)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return null ;
            }
        };
        task.setOnSucceeded(e -> {
            encounters.getItems().addAll(begegnungen);
            System.out.println("success");
            indicator.setVisible(false);
        }); task.setOnCancelled(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                System.out.println("cancelled");
                indicator.setVisible(false);
            }
        });
        new Thread(task).start();

        Reminder timer = new Reminder(20,new RemindTask(){

            @Override
            public void run(){
                task.cancel();
                indicator.setVisible(false);
            }
        });



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fahigkeiten = new ArrayList<>();
        begegnungen = new ArrayList<>();
        indicator.setVisible(true);

        generation.getItems().addAll(List.of(GenerationsEnum.ONE,GenerationsEnum.TWO,GenerationsEnum.THREE,GenerationsEnum.FOUR,GenerationsEnum.FIVE,GenerationsEnum.SIX,GenerationsEnum.SEVEN,GenerationsEnum.EIGHT));
        generation.setValue(GenerationsEnum.ONE);

        generation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(generation.getValue() != e){
                    e = generation.getValue();
                    try {
                        indicator.setVisible(true);
                        reload();

                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
        try {
            pr = new PokemonDataReader(RequestHandler.getPokemonResultByID(MainController.pokemonID));
            br = new BegegnungDataReader(pr.getName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        name.setText(HelpfulMethods.capitalizeFirst(pr.getName()));
        id.setText(Integer.toString(pr.getID()));
        first.setText(Integer.toString(pr.firstGeneration()));
        for(String s: pr.getTypes()){
            if(!types.getText().isEmpty())
            types.setText(types.getText()+", "+HelpfulMethods.capitalizeFirst(s));
            else
            types.setText(HelpfulMethods.capitalizeFirst(s));
        }

        System.out.println(pr.pokemon.getSprites().getFrontDefault());

        try {


            image.setFitHeight(300);
            image.setFitWidth(300);

            image.setImage(RequestHandler.getImage(pr.getID()));
            image.setX(-75);
            image.setY(-50);



            Thread x =new Thread(new Runnable() {
                @Override
                public void run() {

                    fahigkeiten.addAll(pr.getAbilitiesWithLvlGeneration(GenerationsEnum.ONE));
                    fahigkeiten.sort((o1, o2) -> Integer.compare(o1.getLevel(),o2.getLevel()));
                    for (Fahigkeit s:fahigkeiten) {

                        System.out.println( HelpfulMethods.capitalizeFirst(s.getName())+ " at Level "+s.getLevel());
                    }
                }
            });
            x.start();

            x.join();
            moves.getItems().addAll(fahigkeiten);


            Task<Void> task = new Task<Void>() {
                @Override
                public Void call() throws Exception {
                    try {
                        begegnungen.addAll(br.getBegegnungen(HelpfulMethods.enumRegionToInt(Regions.KANTO)));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return null ;
                }
            };
            task.setOnSucceeded(e -> {
                encounters.getItems().addAll(begegnungen);

                indicator.setVisible(false);
            }); task.setOnCancelled(new EventHandler<WorkerStateEvent>() {
                @Override
                public void handle(WorkerStateEvent event) {
                    indicator.setVisible(false);
                }
            });
            Thread t = new Thread(task);
            t.start();

            Reminder timer = new Reminder(20,new RemindTask(){

                @Override
                public void run(){
                    task.cancel();
                    indicator.setVisible(false);
                }
            });





        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public void backPressed() throws IOException {

        switchToScene();

    }

    public void switchToScene() throws IOException {

        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("select.fxml"))));
        MainController.stage.setTitle("PokeAPI Implementation by Cüneyd");
        MainController.stage.setScene(scene);



    }
}
