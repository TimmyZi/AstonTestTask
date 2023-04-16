package programfiles.algorithms;

import java.util.Arrays;

import static constants.Constants.*;
import static programfiles.Menu.returnToStartMenuQuestion;

public class IntArrayAlgorithm {

    public void multipleOfThreeAlgorithm(int[] array) {
        System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Представлен масссив: " + Arrays.toString(array) +
                ", в нем без остатка на 3 делятся числа:"));
        for (int number : array) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
        System.out.println(END);
        returnToStartMenuQuestion();
    }
}
