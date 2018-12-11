package Lesson2arrays.domzad;

//3. Определить сумму элементов целочисленного массива,
// расположенных между минимальным и максимальным значениями.

public class Zad3_arrayMinMaxSumm {

    public static void main(String[] args) throws Exception {


        // массив из нескольких  чисел
        int myArray[] = {2, 1, 8, 6, 9, 7};

        // минимальный и максимальный элементы
        int minElement = myArray[0];
        int maxElement = minElement;
        int index_min = 0;
        int index_max = 0;
        int count;
        for (count = 0; count < myArray.length; count++) {
            if (myArray[count] < minElement) {
                minElement = myArray[count];
                index_min = count;
            }
            if (myArray[count] > maxElement) {
                maxElement = myArray[count];
                index_max = count;
            }
        } //for

        // сумма элементов
        int result = 1;
        int y;
        for (y = (index_min + 1); y != index_max; y++) {
            result = result + myArray[y];
        }
        System.out.println(result);
    }
}





