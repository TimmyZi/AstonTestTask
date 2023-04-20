package framework.helpers;

import java.util.Random;

public class RandomHelper {
    private static final Random random = new Random();

    public static double[] generateRandomArrayDouble(int arraySize) {
        int randomArrayLength = random.nextInt(arraySize);
        double[] randomArray = new double[randomArrayLength];
        for(int i = 0; i < randomArrayLength; i++) {
            randomArray[i] = random.nextInt() + random.nextDouble();
        }
        return randomArray;
    }
}
