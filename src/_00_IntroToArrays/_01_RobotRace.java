package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
		}
		for (int i = 0; i < 5; i++) {
			robots[i].moveTo((i + 1) * 150, 600);
		}
		for (int i = 0; i < 5; i++) {
			robots[i].setSpeed(100);
		}
		Random rando = new Random();
		while (robots[0].getY() >= 0 && robots[1].getY() >= 0 && robots[2].getY() >= 0 && robots[3].getY() >= 0	&& robots[4].getY() >= 0) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(rando.nextInt(50));
				System.out.println(robots[i].getY());
			}
		}
		int roboNum = 0;
		for (int i = 0; i < robots.length; i++) {
			if(robots[i].getY()<=0) {
			roboNum = i+1;
			}
		}
		JOptionPane.showMessageDialog(null, "Robot "+roboNum+" wins!");
		for (int i = 0; i < 5; i++) {
			robots[i].moveTo(0, 400);
		}
		//work on this
//		while (robots[0].getX()) {
//			for (int i = 0; i < robots.length; i++) {
//				
//				for(int x = 0;x<rando.nextInt(50);x++) {
//					robots[i].move(1);
//					robots[i].turn(1);
//				}
//				System.out.println(robots[i].getY());
//			}
//		}
//		for (int i = 0; i < robots.length; i++) {
//			if(robots[i].getY()<=0) {
//			roboNum = i+1;
//			}
//		}
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
