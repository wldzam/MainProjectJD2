package Lesson2arrays.domzad;
//Написать метод equals, который определяет,
// равны ли между собой соответствующие элементы 
       // 2-х двумерных массивов.



import java.util.Arrays;

public class Zad6_arrayEquals {
    public static void main(String[] args) {


        String[][] rows1 = {new String[]{"a", "a"}};

        String[][] rows2 = {new String[]{"a", "a"}};

        System.out.println("Arrays.equals() = " + Arrays.deepEquals(rows1, rows2));
    }
}