package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			// 1. Get 2 numbers from the user and convert them to integer.
			String NumbaUno = JOptionPane.showInputDialog("Give me a number");
			String NumbaDos = JOptionPane.showInputDialog("Give me another number");
			int One = Integer.parseInt(NumbaUno);
			int Two = Integer.parseInt(NumbaDos);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 0) {
				additionSolve(One, Two);
			} else if (operation == 1) {
				subtractionSolve(One, Two);
			} else if (operation == 2) {
				multiplicationSolve(One, Two);
			} else if (operation == 3) {
				divisionSolve(One, Two);
			}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void additionSolve(int One, int Two) {
		int Idk = One + Two;
		JOptionPane.showMessageDialog(null, One + " + " + Two + " = " + Idk);

	}

	static void multiplicationSolve(int One, int Two) {
		int Idk = One * Two;
		JOptionPane.showMessageDialog(null, One + " x " + Two + " = " + Idk);

	}

	static void divisionSolve(int One, int Two) {
		int Idk = One / Two;
		JOptionPane.showMessageDialog(null, One + " ÷ " + Two + " = " + Idk);

	}

	static void subtractionSolve(int One, int Two) {
		int Idk = One - Two;
		JOptionPane.showMessageDialog(null, One + " - " + Two + " = " + Idk);

	}
	// 4. Create similar methods for subtraction, multiplication and division.
}