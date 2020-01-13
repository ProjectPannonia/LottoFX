package Controllers;

import Lotterys.Skandinav;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SevenController {

    @FXML
    Label first_lb,second_lb,third_lb,fourth_lb,fifth_lb,sixth_lb,seventh_lb;
    @FXML
    Button generate_bt;

    @FXML
    public void generateButton(ActionEvent e){
        Skandinav skandinav = new Skandinav();
        int[] numbers = skandinav.winingNumbers();
        first_lb.setText(String.valueOf(numbers[0]));
        second_lb.setText(String.valueOf(numbers[1]));
        third_lb.setText(String.valueOf(numbers[2]));
        fourth_lb.setText(String.valueOf(numbers[3]));
        fifth_lb.setText(String.valueOf(numbers[4]));
        sixth_lb.setText(String.valueOf(numbers[5]));
        seventh_lb.setText(String.valueOf(numbers[6]));
    }



}
