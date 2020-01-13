package Controllers;

import Lotterys.Six;
import Lotterys.Ticket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SixController implements Gear{

    @FXML
    Button generate_bt;
    @FXML
    Label first_lb,second_lb,third_lb,fourth_lb,fifth_lb,sixth_lb;

    @Override
    public void generateNumbers(ActionEvent e) {
        Ticket sixLottery = new Six();
        int[] numbers = sixLottery.winingNumbers();
        first_lb.setText(String.valueOf(numbers[0]));
        second_lb.setText(String.valueOf(numbers[1]));
        third_lb.setText(String.valueOf(numbers[2]));
        fourth_lb.setText(String.valueOf(numbers[3]));
        fifth_lb.setText(String.valueOf(numbers[4]));
        sixth_lb.setText(String.valueOf(numbers[5]));
    }
}
