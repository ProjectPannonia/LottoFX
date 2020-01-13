package Lotterys;

public class Five extends Lotto implements Ticket{
    @Override
    public int[] winingNumbers() {
        int[] nums = new int[5];
        return super.generateWinningNumbers(nums,90);
    }
}
