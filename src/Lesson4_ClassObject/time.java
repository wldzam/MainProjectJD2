package Lesson4_ClassObject;

import java.util.Scanner;

/*1. Создать класс, описывающий промежуток времени.
	Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
	Создать метод для получения полного количества секунд в объекте
	Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
	Создать метод для вывода данных. 
	Написать программу для тестирования возможностей класса.*/
public class time {


		public static void main(String[] args) {


				Scanner scanner = new Scanner(System.in);
				System.out.println(" enter hours");
				int hours = scanner.nextInt();

				System.out.println("enter minuts");
				int minutes = scanner.nextInt();

				System.out.println(" enter seconds");
				int seconds = scanner.nextInt();

				scanner.close();


				int time = seconds + (minutes * 60) + (hours * 3600);

				//System.out.println("количество секунд = " + time + " штук");
				//System.out.println("Итог - " + hours + " час(ов)" + minutes + "минут(а) " + seconds + " секунд");

				showTime(hours, minutes, seconds);
				showTimeOneVariable(time);
		}

		//метод для вычисления всех секунд
		static void showTime(int h, int m, int s) {


				int fullTimeInSecond = (h * 3600) + (m * 60) + s;
				System.out.println("Итого секунд в методе " + fullTimeInSecond);


		}

		static void showTimeOneVariable(int secondQuantity) {


				//int separateTime = secondQuantity;
				System.out.println("приняли только секунды -- Итого секунд в методе " + secondQuantity);


		}


}



