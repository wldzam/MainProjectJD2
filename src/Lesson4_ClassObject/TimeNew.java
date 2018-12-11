package Lesson4_ClassObject;

import java.util.Scanner;

public class TimeNew {


	public static void main(String[] args) {

		//scanner
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter hour");
		int h = scanner.nextInt();
		System.out.println("Enter minutes");
		int min = scanner.nextInt();
		System.out.println("Enter seconds");
		int sec = scanner.nextInt();

		Time timeInterval = new Time(sec, min, h);
		timeInterval.printTime();
	}

}

class Time {

	//variables
	private int second;
	private int minute;
	private int hour;
	//private int timeInSecond;

	//constructor
	Time(int sec, int min, int h) {

		this.second = sec;
		this.minute = min;
		this.hour = h;
	}


	private int getTimeInSecond() {

		int timeInSecond = (hour * 3600) + (minute * 60) + second;
		return (timeInSecond);
	}

	void printTime() {

		System.out.println(hour + " Hour('s) " + minute + " minute('s) " + second + " second('s)");
		System.out.println("Time in seconds: " + getTimeInSecond());
	}


}