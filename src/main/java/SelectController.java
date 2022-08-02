import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;

public class SelectController implements Initializable {

    @FXML
    TextField text;

    @FXML
    Button submit;

    String value;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        value = "";

        text.setTextFormatter(new TextFormatter<>(new IntegerStringConverter()));
        text.textProperty().addListener((obs,oldv,newv) -> {
            try {
                text.getTextFormatter().getValueConverter().fromString(newv);
                // no exception above means valid
                if(!(Integer.parseInt(text.getText())>905)) {
                    text.setBorder(null);
                    submit.setDisable(false);
                }else{
                    throw new Exception();
                }
            } catch (Exception e) {
                text.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2), new Insets(-2))));
                submit.setDisable(true);
            }
        });
    }


    public void keyEntered(KeyEvent e){




    }

    public void submitClicked() throws IOException {

        MainController.pokemonID = Integer.parseInt(text.getText());
        switchToScene();

    }



    public void switchToScene() throws IOException {

        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pokemon.fxml"))));
        MainController.stage.setScene(scene);
        MainController.stage.setTitle("Pokemon View");


    }
}
