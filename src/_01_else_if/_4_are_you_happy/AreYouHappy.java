package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");

		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
		} else if (happy.equals("no")) {
			String question = JOptionPane.showInputDialog("Do you want to be happy?");
			if (question.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else if (question.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
			}
		}
	}
}
