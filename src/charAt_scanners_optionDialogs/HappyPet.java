package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class HappyPet {

	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;

	// this will be used to store the happiness of your pet
	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String Pet = JOptionPane.showInputDialog("what pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?",
					"Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Groom", "Give it food", "Hug it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 1) {
				feedAnimal();

			} else if (task == 2) {
			petAnimal();
			} else {
				groomAnimal();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 10) {
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void groomAnimal() {
		JOptionPane.showMessageDialog(null, "Your pet loved the grooming");
		happinessLevel = happinessLevel + 2;

	}

	static void petAnimal() {
		JOptionPane.showMessageDialog(null, "Your pet liked that but didn't really feel like being hugged");
		happinessLevel = happinessLevel + 1 / 2;
	}

	static void feedAnimal() {
		JOptionPane.showMessageDialog(null, "Your pet was very hungry and loved the food");
		happinessLevel = happinessLevel + 4;
	}
}