package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		isWeekday = false;
		isVacation = false;
		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 */
		int day = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (day == JOptionPane.YES_OPTION) {
			isWeekday = true;
		}
		if(day==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Sleep in?");
			System.exit(0);
		}

		else if (day == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Sleep in?");
			System.exit(0);
		}
		int vac = JOptionPane.showConfirmDialog(null, "Is it vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		 if (vac == JOptionPane.YES_OPTION) {
			isVacation = true;
			JOptionPane.showMessageDialog(null, "Sleep in?");

		}
 
		if (isWeekday == true && isVacation == false) {
			JOptionPane.showMessageDialog(null, "Get up sleepyhead!!");
			System.exit(0);

		}
		else if (vac == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Get up lazybones!!");
			System.exit(0);
		}

		
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */

	}
}
