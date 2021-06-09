package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class windowDochInformation {
    public TextArea YourTextArea;
    int count = 0;
    @FXML
    private Button H_VOD;
    @FXML
    public void initialize(){
        H_VOD.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Stage modalStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("sampleTable.fxml"));
                    modalStage.setScene(new Scene(root));
                    modalStage.setTitle("H - information");
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
