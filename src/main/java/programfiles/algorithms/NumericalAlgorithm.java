package programfiles.algorithms;

import java.util.InputMismatchException;

import static helpers.ScannerHelper.inputScanner;
import static programfiles.Menu.returnToStartMenuQuestion;
import static constants.Constants.*;

public class NumericalAlgorithm {

    public void numericalAlgorithm() {
        System.out.println("Если Вы введете любое целочисленное значение больше 7, консоль отобразит 'Привет'" +
                "\nВведите любое целочисленное значение (число): ");
        try {
            int number = inputScanner().nextInt();
            if (number > 7) {
                System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Привет"));
            }
            System.out.println(END);
            returnToStartMenuQuestion();
        } catch (InputMismatchException e) {
            System.out.println(INCORRECT_INPUT_DATA_TYPE);
            numericalAlgorithm();
        }
    }
}
