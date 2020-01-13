package Lotterys;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    int[] numbers;

    protected int[] generateWinningNumbers(int[] emptyArray,int fields){
        int[] arrOfNumbers = emptyArray;
        int arrLength = arrOfNumbers.length;

        for (int i = 0; i < arrLength; i++) {
            int lottoNumber = generateRandomNumber(fields+1);
            if (!duplicateCheck(arrOfNumbers, lottoNumber)) {
                i--;
                continue;
            } else {
                arrOfNumbers[i] = lottoNumber;
            }
        }

        Arrays.sort(arrOfNumbers);

        return arrOfNumbers;
    }
    private int generateRandomNumber(int fields) {
        Random random = new Random();
        int number = random.nextInt(fields + 1);
        while (number == 0) {
            number = random.nextInt(fields + 1);
        }
        return number;
    }
    private boolean duplicateCheck(int[] array, int newGenerated) {
        boolean flag = true;
        int[] numbers = array;
        int newNumber = newGenerated;

        for (int i = 0; i < array.length; i++) {
            if (numbers[i] == newNumber) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
