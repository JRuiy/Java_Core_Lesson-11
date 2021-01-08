package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Random;

public class Aplication {

	public static void main(String[] args) {
		
		Integer [] array = new Integer[10];
		
		Random r = new Random();
		
		for (int i = 0; i<array.length;i++) {
			array[i] = r.nextInt(101)-0;
		}
		
		Arrays.sort(array);
		System.out.println(Arrays.deepToString(array));
	}
	
}
