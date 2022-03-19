package nummerraten;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NummerRaten {
    public static void main(String[] args) {
        int input;
            int randomNumer = new Random().nextInt(10);

            input = -1;
            Scanner scanner = new Scanner(System.in);

            while (input != randomNumer) {
                // Das Try muss immer im dem Teil des Codes definiert sein, wo die Exception erwartet wird.
                try {
                    System.out.println("Bitte eine Zahl eingeben");
                    input = scanner.nextInt();
                }  catch (InputMismatchException e) {
                    System.out.println("Das Eingabeformat muss eine Zahl sein");
                    scanner = new Scanner(System.in);
                }
            }
        System.out.println("Super. Die Zahl wurde erraten");
        //Zahl dann in der Konsole eingeben und Enter :)

    }
}
