package Lesson2arrays.domzad;


//2. Напишите программу, заносящую
// в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.


public class Zad2_array2_divide {

    public static void main(String[] args) {



        int[] myArray = new int[100];

        for (int i = 0, j = 0; i < myArray.length; j++) {
            if (j % 13 == 0 || j % 17 == 0) {
                myArray[i] = j;
                i++;
            }
        }



        for (int i : myArray) {
            System.out.println(i);
        }
    }
}

