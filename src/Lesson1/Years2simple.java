package Lesson1;

import java.util.Scanner;

public class Years2simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        scanner.close();


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Answes is" + "\n" + "leap year");
        } else {
            System.out.println("Answer is " + "\n" + "not leap year");

        }
    }

}

