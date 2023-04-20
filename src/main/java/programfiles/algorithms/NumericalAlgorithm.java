package programfiles.algorithms;

import java.util.InputMismatchException;

import static framework.helpers.ScannerHelper.inputScanner;
import static programfiles.Menu.returnToStartMenuQuestion;
import static programfiles.constants.Constants.*;

public class NumericalAlgorithm {

    public void inputValueFromConsoleIsHigherThanBaseValue(double baseValue) {
        System.out.println("Если Вы введете любое числовое значение больше " + baseValue + ", консоль отобразит 'Привет'" +
                "\nВведите любое числовое значение: ");
        try {
            double number = inputScanner().nextDouble();
            if (number > baseValue) {
                System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Привет"));
            }
            System.out.println(END);
            returnToStartMenuQuestion();
        } catch (InputMismatchException e) {
            System.out.println(INCORRECT_INPUT_DATA_TYPE);
            inputValueFromConsoleIsHigherThanBaseValue(baseValue);
        }
    }
}
