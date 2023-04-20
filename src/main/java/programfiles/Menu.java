package programfiles;

import framework.helpers.RandomHelper;
import programfiles.algorithms.ArrayAlgorithm;
import programfiles.algorithms.NumericalAlgorithm;
import programfiles.algorithms.TextAlgorithm;

import java.util.InputMismatchException;

import static framework.config.ConfigManager.SETTINGS;
import static programfiles.constants.Constants.*;
import static framework.helpers.ScannerHelper.inputScanner;

public class Menu {

    private static final String NOT_HAVE_MENU_ITEM = String.format(SYSTEM_OUT_SIMPLE, "Такого пункта меню нет, повторите попытку.");
    private static final String END_PROGRAM = String.format(SYSTEM_OUT_SIMPLE, "Завершаю работу программы, всего доброго!");

    public static void startMenu() {
        NumericalAlgorithm numericalAlgorithm = new NumericalAlgorithm();
        TextAlgorithm textAlgorithm = new TextAlgorithm();
        ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();
        System.out.print("Приветсвую Вас в меню программы" +
                "\nВведите пожалуйста номер меню для осуществления желаемого действия:" +
                "\n 1. Запуск задания на ввод целочисленного значения." +
                "\n 2. Запуск задания на ввод имени." +
                "\n 3. Запуск задания на обработку числового массива" +
                "\n 4. Завершить работу программы." +
                "\nВведите номер меню: ");
        try {
            int menuItem = inputScanner().nextInt();
            if (menuItem > 0 && menuItem < 5) {
                switch (menuItem) {
                    case 1:
                        numericalAlgorithm.inputValueFromConsoleIsHigherThanBaseValue(SETTINGS.get("baseValue").getAsDouble());
                        break;
                    case 2:
                        textAlgorithm.inputNameIsEqualToExpectedName(SETTINGS.get("expectedName").getAsString());
                        break;
                    case 3:
                        double[] array = RandomHelper.generateRandomArrayDouble(SETTINGS.get("maxLengthIntArray").getAsInt());
                        arrayAlgorithm.divisionWithoutRemainder(array, SETTINGS.get("divisor").getAsDouble());
                        break;
                    default:
                        System.out.println(END_PROGRAM);
                }
            } else {
                System.out.println(NOT_HAVE_MENU_ITEM);
                startMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println(INCORRECT_INPUT_DATA_TYPE);
            startMenu();
        }
    }

    public static void returnToStartMenuQuestion() {
        System.out.println("Хотите вернуться в стартовое меню?" +
                "\n 1. Вернуться в стартовое меню.\n 2. Завершить работу программы." +
                "\nВведите необходимый пункт меню: ");
        try {
            int menuItem = inputScanner().nextInt();
            if (menuItem > 0 && menuItem < 3) {
                if (menuItem == 1) {
                    startMenu();
                } else {
                    System.out.println(END_PROGRAM);
                }
            } else {
                System.out.println(NOT_HAVE_MENU_ITEM);
                returnToStartMenuQuestion();
            }
        } catch (InputMismatchException e) {
            System.out.println(INCORRECT_INPUT_DATA_TYPE);
            returnToStartMenuQuestion();
        }
    }
}
