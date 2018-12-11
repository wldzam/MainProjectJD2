package Lesson1;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter year");
        int year = scanner.nextInt();

        scanner.close();


        System.out.println("Enter date " + day + month + year);
        boolean validDate;
        validDate = false;

        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
            if ((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 30)) {
                validDate = true;
            }
            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day <= 31)) {
                validDate = true;
            }
            if ((month == 2) && (day < 30)) {
                boolean validLeapYear = false;
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    validLeapYear = true;
                }
                if (validLeapYear  && day <= 29) {
                    validDate = true;
                } else if (!validLeapYear && day <= 28) {
                    validDate = true;
                }
            }
        }
        if (validDate) {
            System.out.println("Data valid.");
        } else {
            System.out.println("Date is wrong");
        }
    }
}




