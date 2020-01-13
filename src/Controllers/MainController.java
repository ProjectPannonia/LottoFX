package Controllers;

import DesignLoaders.GiveNewWindow;
import DesignLoaders.NewWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    Button SixLottery_bt, SevenLottery_bt,FiveLottery_bt;

    public void sixOnAction(ActionEvent e){
        NewWindow sixLotteryWindow = new GiveNewWindow("DesignFiles/lotterySix.fxml","Six lottery");
        sixLotteryWindow.createNewWindow();
    }
    public void sevenOnAction(ActionEvent e){
        NewWindow sevenLotteryWindow = new GiveNewWindow("DesignFiles/SevenStyle.fxml","Scandinavian lottery");
        sevenLotteryWindow.createNewWindow();
    }
    public void fiveOnAction(ActionEvent e){
        NewWindow fiveLotteryWindow = new GiveNewWindow("DesignFiles/FiveStyle.fxml","Five lottery");
        fiveLotteryWindow.createNewWindow();
    }

}
