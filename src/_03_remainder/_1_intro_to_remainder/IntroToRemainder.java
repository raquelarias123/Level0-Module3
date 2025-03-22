package _03_remainder._1_intro_to_remainder;

import java.util.Random;

public class IntroToRemainder {
	public static void main(String[] args) {

		
		int number = new Random().nextInt(100);
		System.out.println(number);
		if (number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
