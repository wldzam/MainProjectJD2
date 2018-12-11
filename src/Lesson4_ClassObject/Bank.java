package Lesson4_ClassObject;


/*
2. Создать класс, описывающий банкомат. 
	Набор купюр, находящихся в банкомате должен задаваться тремя свойствами: 
	количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат. 
	Сделать функцию, снимающую деньги, которая принимает сумму денег,
	 а возвращает булевое значение - успешность выполнения операции.
	При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма. 
	Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
*/


import java.util.Scanner;

public class Bank {


		public static void main(String[] args) {


			/*	System.out.println(" Вас приветствует супер банкомат");
				System.out.println();

				System.out.println("Вы хотите внести деньги ???  нажмите 1");

*/
				Scanner scanner = new Scanner(System.in);

			/*	int yes = scanner.nextInt();

				while (yes != 1) {
						System.out.println("если денег не положить - их не будет!!!!");
						yes = scanner.nextInt();

				}*/


				System.out.println(" положите купюры номиналом 100 долларов");
				int banknote100 = scanner.nextInt();
				//System.out.println();
				//System.out.println("Спасибо, вы положили " + banknote100 * 100 + "  долларов");

				System.out.println(" положите купюры номиналом 50 долларов");
				int banknote50 = scanner.nextInt();
				//System.out.println();
				//System.out.println("Спасибо, вы положили " + banknote50 * 50 + "  долларов");

				System.out.println(" положите купюры номиналом 20 долларов");
				int banknote20 = scanner.nextInt();
				//System.out.println();
				//System.out.println("Спасибо, вы положили  " + banknote20 * 20 + " долларов");

				//сумма купюр
				int amounthOf100 = banknote100 * 100;
				int amounthOf50 = banknote50 * 50;
				int amounthOf20 = banknote20 * 20;

				//тотал
				int totalCash = amounthOf100 + amounthOf50 + amounthOf20;
				System.out.println("Внесенная сумма = " + totalCash + " долларов");

				//сьем
				System.out.println(" теперь давайте снимем любую сумму кратную 20 - 50 - 100 долларов");
				int withdraw = scanner.nextInt();
				System.out.println();

				// условие правильности суммы
				while( (withdraw % 20 != 0) || (withdraw % 50 != 0) || (withdraw % 100 != 0) ) {
						System.out.println("Можно вводить только  сумму кратную 20 50 или 100 долларов");
						withdraw = scanner.nextInt();
				}

				//System.out.println("Спасибо, сейчас посмотрим есть ли столько денег");


				// условие на сумму
				while (withdraw > totalCash) {
						System.out.println("Введите сумму поменьше, у нас столько нет долларов");
						withdraw = scanner.nextInt();

				}



				/*System.out.println(" думаю думаю ");
				System.out.println();
				System.out.println(" Такое количество денег в банкомате денег есть");
				System.out.println();*/


				int bank100 = withdraw / 100;

				int bank50 = (withdraw % 100) / 50;

				int bank20 = (withdraw % 100) % 50 / 20;


				System.out.println(" банкнот по 100 - " + bank100 + "  " + "банкнот по 50 - " + bank50 + "банкнот по 20 - "+ bank20);



			/*	int last = balance(totalCash, withdraw);
				System.out.println("Осталось денег в банкомате  " + last);

*/


		}


		/*private static int balance(int total, int withdrawSumm) {


				return total - withdrawSumm;
		}
*/


}


