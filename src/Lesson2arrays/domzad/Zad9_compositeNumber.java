package Lesson2arrays.domzad;


//. Имеется целое число, определить
// является ли это число простым, т.е.
// делится без остатка только на 1 и себя.


import java.util.Scanner;

public class Zad9_compositeNumber {

    private static String isPrime(int n) {
        if (n < 2) return "False";
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return "Composite";
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc.nextInt()));
    }
}
