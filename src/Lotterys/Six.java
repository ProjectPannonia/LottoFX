package Lotterys;

public class Six extends Lotto implements Ticket {
    @Override
    public int[] winingNumbers() {
        int[] nums = new int[6];
        return super.generateWinningNumbers(nums,45);
    }
}
