package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("How many nickels do you have?");

		// Convert their answer to an int using Integer.parseInt()
		int nickel = Integer.parseInt(nick);
		nickel = nickel * 5;
		// Ask the user how many dimes they have, and convert their answer
		String dim = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int dime = Integer.parseInt(dim);
		dime = dime * 10;
		// Ask the user how many quarters they have, and convert their answer
		String quart = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int quarter = Integer.parseInt(quart);
		quarter = quarter * 25;
		// Calculate how much money the user has and save it in a double variable
		int Money = quarter + dime + nickel;
		System.out.println(Money);

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + Money + " cents");
	}
}
