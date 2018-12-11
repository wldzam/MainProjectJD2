package Lesson2arrays.dopzad;

import java.util.Scanner;

public class TestMatrix2Array {

    int numberOfRow, numberOfColumns;
    int array[];
    int matrix[][];

    public TestMatrix2Array() {


        //сканнер
        Scanner input = new Scanner(System.in);
        System.out.println("This program convert Matrix(2D)  to (1D)array");
        System.out.println("Enter  row =");
        numberOfRow = input.nextInt();
        System.out.println("Enter  colums =");
        numberOfColumns = input.nextInt();
        array = new int[numberOfRow * numberOfColumns];
        matrix = new int[numberOfRow][numberOfColumns];
    }




    public void put(int i, int j, int e) {
        array[(i) * numberOfColumns + j] = e;
    }

    public int get(int i, int j) {
        return array[(i) * numberOfColumns + j];
    }

    public void StoreMatrix() {
        for (int rr = 0; rr < numberOfRow; rr++) {
            for (int cc = 0; cc < numberOfColumns; cc++) {
                int ee=(int) Math.round(Math.random()*89+10);
                matrix[rr][cc] =ee ;
                put(rr, cc, ee);
            }
        }
    }

    public void PrintMatrix() {
        System.out.println("Element are Store in "
                + "Matrix in row " + numberOfRow + " Columns " + numberOfColumns);
        for (int rr = 0; rr < numberOfRow; rr++) {
            for (int cc = 0; cc < numberOfColumns; cc++) {
                System.out.print(matrix[rr][cc] + "\t ");
            }
            System.out.println();
        }
    }

    public void PrintArray() {
        System.out.println("Element converted to array &"
                + " Array length=" + array.length);
        for (int rr = 0; rr < numberOfRow; rr++) {
            for (int cc = 0; cc < numberOfColumns; cc++) {
                System.out.print(get(rr, cc) + " ");
            }
        }
    }

    public static void main(String args[]) {
        TestMatrix2Array M = new TestMatrix2Array();
        M.StoreMatrix();
        M.PrintMatrix();
        M.PrintArray();
    }
}
