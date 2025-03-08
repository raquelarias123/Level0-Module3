
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		/*
		 * // PEN. Put the robot's pen down so it can draw, Use this command:
		rob.penDown();

		// SPEED. Make the robot move quickly. Use this command:
		rob.setSpeed(100);

		for(int i = 0; i < 40; i++){
			rob.move(200);
			rob.turn(70);
		}
		
		
		 */
		rob.penDown();
		rob.setSpeed(70);
		rob.setPenWidth(10);
		
		/*boolean keepGoing = true;
	
		while (keepGoing) {
			String animal = JOptionPane.showInputDialog(null, "What animal do you want?");

			if (animal.equals("cow")) {
				moo();
			} else if (animal.equals("duck")) {
				quack();
			} else if(animal.equals("exit")){
				keepGoing=false;
			}
			else if (animal.equals("dog")) {
				woof();
			} else if (animal.equals("cat")) {
				meow();
			} else {
				llamaScream();
			}
			*/
		
		boolean keepGoing = true;
		
		while(keepGoing) {
			String penColor = JOptionPane.showInputDialog("What color pen would you like the robot to draw width?");
			if ("red".equals(penColor)) {
				rob.setPenColor(Color.red);
			} else if ("green".equals(penColor)) {
				rob.setPenColor(Color.green);
			} else if ("blue".equals(penColor)) {
				rob.setPenColor(Color.blue);
			} else if ("exit".equals(penColor)){
				keepGoing=false;
			} else {
				rob.setPenColor(Color.black);
			}
			
			for(int i=0; i<5; i++) {
				rob.move(50);
				rob.turn(90);
			}
			
			
		}
		
		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
