package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aplication {

	static void menu() {
		System.out.println("Натисніть 1 якщо хочете вивести дані елементу масиву");
		System.out.println("Натисність 2 щоб змінити об'єкти масиву");
	}

	public static void main(String[] args) {

		Car[][] car = new Car[getRandomValueFromRange(1, 5)][5];

		for (int i = 0; i < car.length; i++) {
			for (int j = 0; j < car[i].length; j++) {
				car[i][j] = new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1999, 2020),
						new Helm(getRandomValueFromRange(20, 30), "leather"),
						new Engine(getRandomValueFromRange(2, 10)));
			}
		}

		while (true) {
			menu();

			Scanner sc = new Scanner(System.in);

			switch (sc.next()) {
			case "1": {
				System.out.println(Arrays.deepToString(car));
				break;
			}
			case "2": {
				for (int i = 0; i < car.length; i++) {
					Arrays.fill(car[i], new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1999, 2020),
							new Helm(getRandomValueFromRange(20, 30), "leather"),
							new Engine(getRandomValueFromRange(2, 10))));
				}
				System.out.println(Arrays.deepToString(car));
			}
			}
		}

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}

}
