package homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        nPrint("a", 4);

    }



    public static void nPrint(String message, int n) {

        while (n > 0) {

            System.out.print(message);

            n--;

        }

    }
}
