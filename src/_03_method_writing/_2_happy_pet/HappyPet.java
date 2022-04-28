package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet would you like?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for (happinessLevel = 0; happinessLevel < 10; happinessLevel++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet + "?", "Pet Fun!", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "feed", "play", "groom", "pet" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				feed(pet);
			}
			if (task == 1) {
				play(pet);
			}
			if (task == 2) {
				groom(pet);
			}
			if (task == 3) {
				pet(pet);
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

			}
		JOptionPane.showMessageDialog(null, "Your pet is happy!");
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void feed(String pet) {
		JOptionPane.showMessageDialog(null, "You fed your " + pet + " and it licks you!");
		}
	public static void play(String pet) {
		JOptionPane.showMessageDialog(null, "You played with your " + pet + " and it jumps on you!");
		}
	public static void groom(String pet) {
		JOptionPane.showMessageDialog(null, "You groom your " + pet + " and it sits in your lap!");
		}
	public static void pet(String pet) {
		JOptionPane.showMessageDialog(null, "You pet your " + pet + " and it makes friendly noises!");
		}
}