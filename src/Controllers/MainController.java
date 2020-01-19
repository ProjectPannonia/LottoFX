package Controllers;

import DesignLoaders.GiveNewWindow;
import DesignLoaders.NewWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class MainController {

    @FXML
    Button SixLottery_bt, SevenLottery_bt, FiveLottery_bt;
    @FXML
    AnchorPane split_left_ahp;

    public void sixOnAction(ActionEvent e) throws IOException {
        split_left_ahp.getChildren().clear();
        split_left_ahp.getChildren().add(FXMLLoader.load(getClass().getClassLoader().getResource("DesignFiles/SixStyle.fxml")));
    }

    public void sevenOnAction(ActionEvent e) throws IOException {
        split_left_ahp.getChildren().clear();
        split_left_ahp.getChildren().add(FXMLLoader.load(getClass().getClassLoader().getResource("DesignFiles/SevenStyle.fxml")));
    }

    public void fiveOnAction(ActionEvent e) throws IOException {
        split_left_ahp.getChildren().clear();
        split_left_ahp.getChildren().add(FXMLLoader.load(getClass().getClassLoader().getResource("DesignFiles/FiveStyle.fxml")));
    }

}
