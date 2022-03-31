package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Enter a number.");
		int number = Integer.parseInt(num);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Your number is not prime.");
				System.exit(0);
			}
		}
		System.out.println("Your number is prime.");
	}
	
}
