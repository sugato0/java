package sample;



import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    private Button H_VOD;
    @FXML
    private Button OPEN_TABLE;
    @FXML
    private Button INFORMATION;
    @FXML
    private Button DOING;




    @FXML
    public void initialize(){

        OPEN_TABLE.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {


                try {
                    Stage modalStage = new Stage();


                    Parent root = FXMLLoader.load(getClass().getResource("sampleOPEN_TABLE.fxml"));
                    modalStage.setScene(new Scene(root));
                    modalStage.setTitle("Periodic table");
                    modalStage.initModality(Modality.WINDOW_MODAL);
                    modalStage.initOwner(((Node)mouseEvent.getSource()).getScene().getWindow());
                    modalStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        INFORMATION.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {


                try {

                    Stage modalStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("sampleINFORMATION.fxml"));
                    modalStage.setScene(new Scene(root));
                    modalStage.setTitle("Information table");
                    modalStage.initModality(Modality.WINDOW_MODAL);
                    modalStage.initOwner(((Node)mouseEvent.getSource()).getScene().getWindow());
                    modalStage.show();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        });
        DOING.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {


                try {

                    Stage modalStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("windowDochDoing.fxml"));
                    modalStage.setScene(new Scene(root));
                    modalStage.setTitle("Periodic table with extra function");
                    modalStage.initModality(Modality.WINDOW_MODAL);
                    modalStage.initOwner(((Node)mouseEvent.getSource()).getScene().getWindow());
                    modalStage.show();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        });



    }
}
