import java.util.Arrays;
import java.util.Random;

public class Skandinav implements Ticket {
    //int[] numbers = winingNumbers();

    @Override
    public int[] winingNumbers() {
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++){
            int lottoNumber = generateRandomNumber();
            if (!duplicateCheck(nums,lottoNumber)){
                i--;
                continue;
            }else {
                nums[i] = lottoNumber;
            }
        }

        Arrays.sort(nums);
        return nums;
    }
    private int generateRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(36);
        while (number == 0){
            number = random.nextInt(36);
        }
        return number;
    }
    private boolean duplicateCheck(int[] array, int newGenerated){
        boolean flag = true;
        int[] numbers = array;
        int newNumber = newGenerated;

        for(int i = 0; i < array.length; i++){
            if(numbers[i] == newNumber){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
