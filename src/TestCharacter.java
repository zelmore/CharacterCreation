//CharacterCreator.java
//Zachary Elmore
//10/31/16
//Create a character for a Fantasy RPG

import java.util.Scanner;
public class TestCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;		//initialized count
		int rCount = 0;		//initialized count for Rogue
		int warCount = 0;	//initialized count for Warrior
		int wizCount = 0;	//initialized count for Wizard
		int pCount = 0;		//initialized count for Prisoner(Default Character)
		String NC ="";		//initialized a choice for a new character
				
		do{  //while user enters y or Y, it will continue looping
			
			//prompts for a name for the character
			System.out.print("\nPlease enter a name for your character: ");
			// user enters the name
			String name = input.next();
			
			//prompts the user to choose a class for their character
			System.out.print("\nPlease choose a class for your character "
					+ "[0-Default, 1-Rogue, 2-Warrior, 3-Wizard]: ");
			//user enters choice
			int role = input.nextInt();
			
			try{
				if(role < 0 || role > 3)      //if user chooses outside choice
					throw new Exception();	  //exception is created
			}
			catch(Exception ex){
				do{
					//displays error message and asks user to enter a valid prompt
					System.out.print("\nERROR: Please enter a valid integer!: ");
					//user enters another choice
					role = input.nextInt();
					}
					while(role < 0 || role > 3);
			}
				
			if(role == 0){							//if user chooses the default
				Character ch = new Character();
				System.out.println("\nNAME: " + name);
				System.out.println(ch.toString());
				pCount += 1;
			}			
			else if(role == 1){						//if use chooses the Rogue
				Rogue rogue = new Rogue(true);
				System.out.println("\nNAME: " + name);
				rogue.printRogue();
				rCount += 1;		//adds 1 to Rogue count
			}
			else if(role == 2){						//if user chooses the Warrior
				Warrior warrior = new Warrior(true);
				System.out.println("\nNAME: " + name);
				warrior.printWarrior();
				warCount += 1;		//adds 1 to Warrior count
			}
			else if(role == 3){						//if user chooses the Wizard
				Wizard wizard = new Wizard(false);
				System.out.println("\nNAME: " + name);
				wizard.printWizard();
				wizCount += 1;		//adds 1 to Wizard count
			}
				
			count += 1;		//adds 1 to Character count
			//prompts user if they want to make another character 
			System.out.print("\nWould you like to create another character? [Y/N]: ");
			//user enters choice
			NC = input.next();
		}
		while(NC.equals("y") || NC.equals("Y"));
		
		//prints out how many characters, Rogues, Warriors, and Wizards were created
		System.out.println("\nYou have created " + count + " character(s).");
		System.out.println("You have created " + rCount + " rogue(s).");
		System.out.println("You have created " + warCount + " warrior(s).");
		System.out.println("You have created " + wizCount + " wizard(s).");
		System.out.println("You have created " + pCount + " Prisoner(s).");
		input.close();
	}


}
