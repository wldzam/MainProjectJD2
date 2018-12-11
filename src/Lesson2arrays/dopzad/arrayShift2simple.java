package Lesson2arrays.dopzad;

import java.util.Scanner;

public class arrayShift2simple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int ArraySize = sc.nextInt();

        System.out.print("Введите размер сдвига: ");
        int arrayShift = sc.nextInt();

        int[] Array = new int[ArraySize];
        System.out.println("Заполните массив: ");
        for (int i = 0; i<ArraySize; i++){
            Array[i] = sc.nextInt();
        }

        System.out.print("Начальный массив: ");
        for (int i : Array){
            System.out.print(i + " | ");

        }
        //System.out.println("");

        if (arrayShift > ArraySize){
            arrayShift = arrayShift - ArraySize;
        }
        int[] NewArray = new int[ArraySize];
        for(int i = 0, k = arrayShift; k<ArraySize; i++, k++){
            NewArray[i] = Array[k];
        }
        for(int i = 0, k = ArraySize- arrayShift; k<ArraySize; i++, k++){
            NewArray[k] = Array[i];
        }

        System.out.print("Массив со сдвигом на " + arrayShift + " позицию(и): ");
        for (int i : NewArray){
            System.out.print(i + " | ");
        }

    }}
