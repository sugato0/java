package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class windowDochDoing {
    @FXML
    private AnchorPane BGAnchor;
    @FXML
    private Button BUT_H;
    @FXML
    private Button BUT_HE;
    @FXML
    private Button BUT_LI;
    @FXML
    private Button BUT_NA;
    @FXML
    private Button BUT_NE;
    @FXML
    private Button BUT_C;
    @FXML
    private Button BUT_B;
    @FXML
    private Button BUT_BE;



    @FXML
    void initialize() {

        BUT_H.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_H.setLayoutX(mouseEvent.getX() + 50);
                BUT_H.setLayoutY(mouseEvent.getY() + 50);

            }
        });


        BUT_HE.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_HE.setLayoutX(mouseEvent.getX() + 50);
                BUT_HE.setLayoutY(mouseEvent.getY() + 50);

            }
        });


        BUT_LI.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_LI.setLayoutX(mouseEvent.getX() + 50);
                BUT_LI.setLayoutY(mouseEvent.getY() + 50);

            }


        });
        BUT_NA.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_NA.setLayoutX(mouseEvent.getX() + 50);
                BUT_NA.setLayoutY(mouseEvent.getY() + 50);

            }


        });
        BUT_NE.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_NE.setLayoutX(mouseEvent.getX() + 50);
                BUT_NE.setLayoutY(mouseEvent.getY() + 50);

            }


        });
        BUT_C.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_C.setLayoutX(mouseEvent.getX() + 50);
                BUT_C.setLayoutY(mouseEvent.getY() + 50);

            }


        });
        BUT_B.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_B.setLayoutX(mouseEvent.getX() + 50);
                BUT_B.setLayoutY(mouseEvent.getY() + 50);

            }


        });
        BUT_BE.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                BUT_BE.setLayoutX(mouseEvent.getX() + 50);
                BUT_BE.setLayoutY(mouseEvent.getY() + 50);

            }


        });

    }

}