package Lesson1;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Years {
    public static void main(String[] args) {


        System.out.println(((GregorianCalendar) Calendar.getInstance()).isLeapYear(new Scanner(System.in).nextInt()));

    }
}
