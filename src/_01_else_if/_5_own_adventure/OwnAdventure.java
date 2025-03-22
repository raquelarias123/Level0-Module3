package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String qOne = JOptionPane.showInputDialog("Do you want to adopt a pet?");

		if (qOne.equals("yes")) {
			String qTwo = JOptionPane.showInputDialog("Do you want to adopt a hamster or a dog?");
			if (qTwo.equals("hamster")) {
				String qThree = JOptionPane.showInputDialog("Do you want a spotted hamster or a golden hamster?");
				if (qThree.equals("spotted")) {
					JOptionPane.showMessageDialog(null, "You decided to adopt a spotted hamster named George!");
				} else if (qThree.equals("golden")) {
					JOptionPane.showMessageDialog(null, "You decided to adopt a golden hamster named Sprinkles!");
				}

			} else if (qTwo.equals("dog")) {
				JOptionPane.showMessageDialog(null,
						"You decided to adopt a dog! There is only one left and it is a german shepherd.");
			}
		} else if (qOne.equals("no")) {
			JOptionPane.showMessageDialog(null, "You decide to stay home and watch a movie");
		}
	}
}
