package Lesson1;

import java.util.Scanner;


public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 strings");
        String text1 = scanner.next();
        String text2 = scanner.next();


        if (text1.equals(text2)) {
            System.out.println(" Супер! Слова одинаковы");
        }
        if (text1.equalsIgnoreCase(text2)) {
            System.out.println(" отличаються регистром но почти одинаковы");
        }

        if (!text1.equals(text2)) {
            System.out.println(" Слова не одинаковы");
        }
        if ((!text1.equals(text2)) && text1.length() == text2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        }


    }}

