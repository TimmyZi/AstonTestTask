package programfiles.algorithms;

import static framework.helpers.ScannerHelper.inputScanner;
import static programfiles.Menu.returnToStartMenuQuestion;
import static programfiles.constants.Constants.*;

public class TextAlgorithm {

    public void inputNameIsEqualToExpectedName(String expectedName) {
        System.out.println("Введите любое имя, если введете '" + expectedName + "', консоль попривествует Вас. " +
                "Других имен программа не знает.\nВведите любое имя: ");
        String name = inputScanner().next();
        if (name.equals(expectedName)) {
            System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Привет, " + name));
        } else {
            System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Нет такого имени"));
        }
        System.out.println(END);
        returnToStartMenuQuestion();
    }
}
