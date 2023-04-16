package helpers;

import java.util.Random;

public class RandomHelper {
    private static final Random random = new Random();

    public static int[] generateRandomArray(int arraySize) {
        int randomArrayLength = random.nextInt(arraySize);
        int[] randomArray = new int[randomArrayLength];
        for(int i = 0; i < randomArrayLength; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}
