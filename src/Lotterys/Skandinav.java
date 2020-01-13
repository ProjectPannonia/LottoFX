package Lotterys;

import java.util.Arrays;

public class Skandinav extends Lotto implements Ticket {

    @Override
    public int[] winingNumbers() {
        int[] nums = new int[7];

        return super.generateWinningNumbers(nums,35);
    }

}
