package Lesson2arrays.dopzad;

public class TestTwoDimension {
    public static void main(String[] args) {
        int[][] table = {{5, 6, 7}, {3, 4, 2}};
        int[][] result;
        System.out.println("Matrix Before Transpose : ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++)
                System.out.print(table[i][j] + " ");
        }
        result = transpose(table);
        System.out.println("\nMatrix After Transpose :");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

    static int[][] transpose(int[][] a) {

        int[][] temp = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++)
                temp[i][j] = a[j][i];
        }
        return temp;
    }
}