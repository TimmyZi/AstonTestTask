package programfiles.algorithms;

import static helpers.ScannerHelper.inputScanner;
import static programfiles.Menu.returnToStartMenuQuestion;
import static constants.Constants.*;

public class TextAlgorithm {

    public void textAlgorithm() {
        System.out.println("Введите любое имя, если введете 'Вячеслав', консоль попривествует Вас. " +
                "Других имен программа не знает.\nВведите любое имя: ");
        String name = inputScanner().next();
        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Привет, Вячеслав"));
        } else {
            System.out.println(String.format(SYSTEM_OUT_SIMPLE, "Нет такого имени"));
        }
        System.out.println(END);
        returnToStartMenuQuestion();
    }
}
