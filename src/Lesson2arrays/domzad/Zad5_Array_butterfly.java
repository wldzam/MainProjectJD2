package Lesson2arrays.domzad;

//5. Создать двухмерный квадратный массив,
// и заполнить его "бабочкой", т.е. таким образом:

public class Zad5_Array_butterfly {
    public static void main(String[] args) {


        int arr[][] = new int[7][7]; // размер массива
        int i, j;


        for (i = 0; i < arr.length / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;

            }

        }
        for (i = arr.length - 1; i >= arr.length / 2; i--) { ///
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {

                // меняем символы!!!!!
                if (arr[i][j] == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");

                }


            }
            //перевод строки
            System.out.println(" ");
        }
    }
}


