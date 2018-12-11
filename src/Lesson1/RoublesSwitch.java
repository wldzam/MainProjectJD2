package Lesson1;

import java.util.Scanner;

public class RoublesSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in rubles");
        int money = scanner.nextInt();

        scanner.close();

        if (money >= 0) {
            switch (money % 10) {
                case 1:
                    if (money%100 == 11) {
                        System.out.println(money + " рублей");
                    } else {
                        System.out.println(money + " рубль");
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    if (money%100 == 12 || money == 13 || money == 14) {
                        System.out.println(money + " рублей");
                    } else {
                        System.out.println(money + " рубля");
                    }
                    break;
                default:
                    System.out.println(money + " рублей");


            }
        }









      /*  int x = money % 100;
        int y = money % 10;


        switch (money) {

            case 1:
                if (x == 1 || y == 1)

                System.out.println(money + " рубль");
                break;
            case 2:
                if (5 > x && x > 1 || y > 1 && y < 5)
                    System.out.println(money + " рубля");

                break;
            case 3:
                if (20 > x && x > 10 || y > 5 && y < 10)
                    System.out.println(money + " рублей");


                break;*/
    }
}







