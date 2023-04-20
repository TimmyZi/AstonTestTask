package programfiles.algorithms;

import java.util.Arrays;

import static programfiles.constants.Constants.*;
import static programfiles.Menu.returnToStartMenuQuestion;

public class ArrayAlgorithm {

    public void divisionWithoutRemainder(double[] array, double divisor) {
        System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Представлен масссив: " + Arrays.toString(array) +
                ", в нем без остатка на " + divisor + " делятся числа:"));
        for (double number : array) {
            if (number % divisor == 0) {
                System.out.println(number);
            }
        }
        System.out.println(END);
        returnToStartMenuQuestion();
    }
}
