package Lesson2arrays.dopzad;

import java.util.Arrays;

public class TestArrayShift {

    public static int[] shift(int arr[]) {
        int b[] = new int[arr.length];
        b[0] = arr[arr.length - 1];
        System.arraycopy(arr, 0, b, 1, arr.length - 1);
        return b;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9999};
        int arrayResult[] = shift(array);
        System.out.println("Before " + Arrays.toString(array));
        System.out.println("After " + Arrays.toString(arrayResult));
    }


}
