package Lesson1;

import java.util.Scanner;

public class Roubles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter amount in rubles");


        int money = scanner.nextInt();

        scanner.close();



        if (money % 10 == 1 && money % 100 != 11) {
            System.out.println(money+" рубль");
        } else if (money % 10 >= 2 && money % 10 <= 4 && (money % 100 < 10 || money % 100 >= 20)) {
            System.out.println(money+" рубля");
        } else {
            System.out.println(money+" рублей");
        }}}