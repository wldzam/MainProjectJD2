package Lesson2arrays.domzad;
//10. Написать алгоритм расчета факториала ,
// используя циклы (for и while).



public class Zad10_factorial {

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(4));
    }
}



