package _02_loop_variables._4_99_bottles.bottles;

public class NinetyNineBottles {
	/**
	 * 99 bottles of beer on the wall, 99 bottles of beer. Take one down and pass it
	 * around, 98 bottles of beer on the wall. 98 bottles of beer on the wall, 98
	 * bottles of beer. Take one down and pass it around, 97 bottles of beer on the
	 * wall. ... 1 bottle of beer on the wall, 1 bottle of beer. Take one down and
	 * pass it around, no more bottles of beer on the wall. No more bottles of beer
	 * on the wall, no more bottles of beer. Go to the store and buy some more, 99
	 * bottles of beer on the wall.
	 */

	public static void main(String[] args) {
		for (int i = 99; i > 0; i--) {
			System.out.println(
					i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down pass it around, ");
		}
		System.out.println("no more bottles of beer on the wall.  No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}
