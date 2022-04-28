package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	Robot rob = new Robot();
	
	public static void main(String[] args) {
		ObedientRobot rob = new ObedientRobot();
		rob.rob.penDown();
		rob.rob.setSpeed(100);
		//color
		String color = JOptionPane.showInputDialog("Which color would you like? Red, yellow, green, or blue?");
		if (color.equals("red")) {
			rob.rob.setPenColor(255, 0, 0);
		}
		else if (color.equals("yellow")) {
			rob.rob.setPenColor(255, 255, 0);
		}
		else if (color.equals("green")) {
			rob.rob.setPenColor(0, 255, 0);
		}
		else if (color.equals("blue")) {
			rob.rob.setPenColor(0, 0, 255);
		}
		//question
		String question = JOptionPane.showInputDialog("would you like a square, triangle, or circle?");
		//Square
		if (question.equals("square")) {
			rob.drawSquare();
		}
		//Triangle
		else if (question.equals("triangle")) {
			rob.drawTriangle();
		}
		//circle
		else if (question.equals("circle")) {
			rob.drawCircle();
		}
		rob.rob.hide();
	}
	
	public void drawSquare() {
		for (int i = 0; i <= 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	public void drawTriangle() {
		for (int i = 0; i <= 3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	
	public void drawCircle() {
		for (int i = 0; i <= 360; i++) {
			rob.move(2);
			rob.turn(1);
		}
	}
	
}
