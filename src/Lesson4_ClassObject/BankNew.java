package Lesson4_ClassObject;

import java.util.Scanner;

public class BankNew {

	public static void main(String[] args) {

		MyBank xMenu = new MyBank();
		xMenu.Menu();
	}

}

class MyBank {

	private int banknote20, banknote50, banknote100;
	private int y100, y50;
	private int choose;
	private int summ = 0;

	Scanner scanner = new Scanner(System.in);


	MyBank() {

		banknote20 = 0;
		banknote50 = 0;
		banknote100 = 0;
	}

	void Menu() {

		MyBank Menu = new MyBank();

		String mainMenuString = ("Bankomat\n1. Deposit money\n2. Withdraw money");
		System.out.println(mainMenuString);

		choose = scanner.nextInt();

		if (choose == 1) {
			Menu.depositMoney();
		}
		if (choose == 2) {
			Menu.withdraw();
		}
		//пока не выберешь не уйдет
		if (choose != 1 || choose != 2) {
			Menu();
		}
	}

	private void depositMoney() {

		MyBank Menu = new MyBank();

		String depositMoneyString = ("Bankomat\nChoose banknotes:\n1.20 dollars\n2.50 dollars\n3.100 dollars" +
		        "\n4.Check balance\n9.Return to main menu");

		do {
			System.out.println(depositMoneyString);
			choose = scanner.nextInt();
			switch (choose) {
				case 1:
					System.out.println("How much?");
					choose = scanner.nextInt();
					summ += choose * 20;
					System.out.println("You put " + choose * 20 + " dollars");
					break;
				case 2:
					System.out.println("How much?");
					choose = scanner.nextInt();
					summ += choose * 50;
					System.out.println("You put " + choose * 50 + " dollars");
					break;
				case 3:
					System.out.println("How much?");
					choose = scanner.nextInt();
					summ += choose * 100;
					System.out.println("You put " + choose * 100 + " dollars");
					break;
				case 4:
					System.out.println("balance is " + summ + " dollars");
					break;
				case 9:
					Menu.Menu();
			}
		} while (choose != 9);
	}


	private void withdraw() {

		System.out.println("Enter  amount of money");
		choose = scanner.nextInt();
		//MyBank xMenu = new MyBank();

		if ((choose % 100 % 50 % 20 == 0) || (choose % 100 % 20 == 0) ||
		        (choose % 50 % 20 == 0) || (choose % 50 == 0) || (choose % 20 == 0)) {
			System.out.println("we have so much money ");

			{

				if (choose % 100 == 0) {
					banknote100 = choose / 100;
				} else {
					banknote100 = choose / 100;
					y100 = choose % 100;

					if (y100 % 20 == 0) {
						banknote20 = y100 / 20;
					} else if (y100 % 50 == 0) {
						banknote50 = y100 / 50;
					} else {
						y50 = y100 / 50;
						banknote20 = y50 / 20;
					}

				}

				System.out.println("100 dollars: " + banknote100 + "\n\n50 dollars: "
				        + banknote50 + "\n\n20 dollars: " + banknote20);
			}
		}
	}

}