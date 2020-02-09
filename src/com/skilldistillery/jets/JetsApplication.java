package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		AirField airFieldTest = new AirField();
//		airFieldTest.buildAirField();
//		airFieldTest.printJets();
//		airFieldTest.flyJets();
//		airFieldTest.addJetMenu(keyboard);
//		airFieldTest.printJets();
//		airFieldTest.addJetMenu();
		JetsApplication runJetApplication = new JetsApplication();
		runJetApplication.menuOptions(keyboard, airFieldTest);

	}

	public void menuOptions(Scanner keyboard, AirField airfield) {
		boolean menuContinue = true;
		airfield.buildAirField();
		while (menuContinue) {
			System.out.println(("\n\tThis is the automated jets application.").toUpperCase());
			System.out.println(("\tPlease choose from the following menu.\n").toUpperCase());
			System.out.println("1: List all jets.");
			System.out.println("2: Fly all jets.");
			System.out.println("3. View fastest jet.");
			System.out.println("4. View jet with longest range.");
			System.out.println("5. Load all cargo jets.");
			System.out.println("6. Dogfight (All fighters must fight).");
			System.out.println("7. Add a jet to the fleet.");
			System.out.println("8. Remove a jet from the fleet.");
			System.out.println("9. Quit Jets Application.");
			System.out.print("\nYour Selection: ");

			int selection = keyboard.nextInt();
			switch (selection) {
			case 1: {
				airfield.printJets();
				break;
			}
			case 2: {
				airfield.flyJets();
				break;
			}
			case 3: {
				airfield.viewFastJet();
				break;
			}
			case 4: {
				airfield.viewLongestRange();
				break;
			}
			case 5: {
				airfield.loadAllCargo();
				break;
			}
			case 6: {
				airfield.dogFight();
				break;
			}
			case 7: {
				airfield.addJetMenu(keyboard);
				break;
			}
			case 8: {
				airfield.removeJet(keyboard);
				break;
			}
			case 9: {
				menuContinue = false;
				break;
				
			}
			default: {
				System.out.println("Invalid selection.");
			}
			}
		}
		
		
		
	}

}
