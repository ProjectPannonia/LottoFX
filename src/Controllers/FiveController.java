package Controllers;

import Lotterys.Five;
import Lotterys.Ticket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FiveController implements Gear{
    @FXML
    Button generate_bt;
    @FXML
    Label first_lb,second_lb,third_lb,fourth_lb,fifth_lb;

    @Override
    public void generateNumbers(ActionEvent e) {
        Ticket five = new Five();
        int[] winingNumbers = five.winingNumbers();
        first_lb.setText(String.valueOf(winingNumbers[0]));
        second_lb.setText(String.valueOf(winingNumbers[1]));
        third_lb.setText(String.valueOf(winingNumbers[2]));
        fourth_lb.setText(String.valueOf(winingNumbers[3]));
        fifth_lb.setText(String.valueOf(winingNumbers[4]));
    }
}
