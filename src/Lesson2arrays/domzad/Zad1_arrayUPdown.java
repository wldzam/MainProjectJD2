package Lesson2arrays.domzad;
//1. Напишите программу, которая печатает массив
// сначала в обычном порядке, затем в обратном.



public class Zad1_arrayUPdown {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println("   ");
            for (int b = array.length-1; b >= 0; b--) {

                System.out.print(array[b] + " ");

                //System.out.println(Arrays.toString(array));

            }
        }
    }
