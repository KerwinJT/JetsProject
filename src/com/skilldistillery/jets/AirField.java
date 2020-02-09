package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AirField {
	Scanner keyboard = new Scanner(System.in);
	private List<Jet> moreJets = new ArrayList<Jet>();

	public AirField() { // Foreach Jet - InstanceOf - Casting class type to call class specific methods

	}

	public void buildAirField() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				if (line.contains("Cargo")) {
					String[] classLine = line.split(",");
					moreJets.add(new CargoPlane(classLine[1], Double.parseDouble(classLine[2]),
							Double.parseDouble(classLine[3]), Double.parseDouble(classLine[4]),
							Double.parseDouble(classLine[5])));
//					System.out.println("Adding Cargo");
				} else if (line.contains("Passenger")) {
					String[] classLine = line.split(",");
					moreJets.add(new PassengerPlane(classLine[1], Double.parseDouble(classLine[2]),
							Double.parseDouble(classLine[3]), Double.parseDouble(classLine[4]),
							Double.parseDouble(classLine[5])));
//					System.out.println("Adding Passenger");
				} else if (line.contains("Fighter")) {
					String[] classLine = line.split(",");
//					for (String string : classLine) {
////						System.out.println(string);
//					}
					moreJets.add(new FighterJet(classLine[1], Double.parseDouble(classLine[2]),
							Double.parseDouble(classLine[3]), Double.parseDouble(classLine[4])));
//					System.out.println("Adding Fighter");
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void printJets() { //List Fleet
		for (Jet jet : moreJets) {
			System.out.println(jet.toString());
		}
	}

	public void flyJets() { //Fly all jets
		for (Jet jet : moreJets) {
			jet.fly();
		}
	}

	public void addJetMenu(Scanner keyboard) { //Add jet to fleet

		String keepGoing = "Y";
		while (keepGoing.toUpperCase().equals("Y")) {
			System.out.println(("\n\tTo add an airplane to the air field, \n\tplease choose from the following:\n ")
					.toUpperCase());
			System.out.println("1.) Add Fighter.");
			System.out.println("2.) Add Passenger.");
			System.out.println("3.) Add Cargo Jet.");
			System.out.print("Your selection: ");

			try {
				int number = keyboard.nextInt();
				if (number == 1) {
					addFIghter();
				} else if (number == 2) {
					addPassenger();
				} else if (number == 3) {
					addCargoPlane();
				}

			} catch (InputMismatchException e) {
				System.err.println("Input Error.");
				keyboard.nextLine();
			}
			System.out.print("Keep going? (Y/N)");
			keepGoing = keyboard.next();
		}

	}

	public void addFIghter() {

		System.out.println(
				"\tTo add a fighter to the airfield, \n\tplease provide the following information".toUpperCase());
		String model;
		Double speed = null;
		Double range = null;
		Double price = null;

		System.out.print("Model: ");
		model = keyboard.nextLine();
		System.out.print("Speed: ");
		try {
			speed = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}

		System.out.print("Range: ");
		try {
			range = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}

		System.out.print("Unit Price: ");
		try {
			price = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
			System.out.print("Please press 'enter' to continue.");
		}
		keyboard.nextLine();
		
		if (speed != null && range != null && range != null) {
			moreJets.add(new FighterJet(model, speed, range, price));
		} else System.out.println("Error during input found. Jet not added.");

	}

	public void addPassenger() {
		System.out.println(
				"\tTo add a passenger jet to the airfield, \n\tplease provide the following information".toUpperCase());
		String model;
		Double speed = null;
		Double range = null;
		Double price = null;
		int passenger = 0;

		System.out.print("Model: ");
		model = keyboard.nextLine();
		System.out.print("Speed: ");
		try {
			speed = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		
		System.out.print("Range: ");
		try {
			range = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		
		System.out.print("Unit Price: ");
		try {
			price = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		System.out.print("Passenger capacity: ");
		try {
			passenger = keyboard.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		if (speed != null && range != null && range != null) {
			moreJets.add(new PassengerPlane(model, speed, range, price, passenger));
		} else {
			System.out.println("Error during input found. Jet not added.");
		}
		System.out.print("Please press 'enter' to continue.");
		keyboard.nextLine();

	}

	public void addCargoPlane() {
		System.out.println(
				"\tTo add a cargo plane to the airfield, \n\tplease provide the following information".toUpperCase());
		String model;
		Double speed = null;
		Double range = null;
		Double price = null;
		Double cargoCapacity = null;;

		System.out.print("Model: ");
		model = keyboard.nextLine();
		System.out.print("Speed: ");
		try {
			speed = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		
		System.out.print("Range: ");
		try {
			range = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		
		System.out.print("Unit Price: ");
		try {
			price = keyboard.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		System.out.print("Cargo capacity: ");
		try {
			cargoCapacity = keyboard.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Input Error.");
			keyboard.nextLine();
		}
		if (speed != null && range != null && range != null) {
			moreJets.add(new CargoPlane(model, speed, range, price, cargoCapacity));
		} else {
			System.out.println("Jet not added.");
		}
		System.out.print("Please press 'enter' to continue.");
		keyboard.nextLine();
	}

	public void viewFastJet() { //Prints fastest jet in Fleet
		double fastest = 0;
		Jet fastestJet = null;
//		double compareFaster = 0;
		for (Jet jet : moreJets) {
			if (jet.getSpeed() > fastest) {
				fastest = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println("Fastest jet: " + fastestJet.getModel() + ", with a top speed of " + fastestJet.getSpeed() + " MPH");
	}
	
	public void viewLongestRange() { //Prints jet with the longest range
		double longestRange = 0;
		Jet jetLongestrange = null;
		for (Jet jet : moreJets) {
			if (jet.getRange() > longestRange) {
				longestRange = jet.getRange();
				jetLongestrange = jet;
			}
		}
		System.out.println("Jet with the longest range: " + jetLongestrange.getModel() + ", with a max range of " + jetLongestrange.getRange() + " miles.");
	}
	
	public void loadAllCargo() { //Loads all cargo planes.
		for (Jet jet : moreJets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}
	
	public void dogFight() { //Sends all fighters to fight.
		for (Jet jet : moreJets) {
			if (jet instanceof FighterJet) {
				((FighterJet)jet).fight();
			}
		}
	}
	
	public void removeJet(Scanner keyboard) { //A loop to remove a jet.
		
		int removePlane = 0;
		String continuing = "Y";
		while (continuing.contains("Y")) {
			int elementOf = 0;
			
			System.out.println("Please indicate by index number which jet you would like to remove.");
			for (Jet jet : moreJets) {
				System.out.println("Jet at index " + elementOf + ": " + jet.getModel());
				elementOf++;
			}
			System.out.print("Remove jet at index: ");
			try {
				removePlane = keyboard.nextInt();
				if (removePlane >= 0 && removePlane < moreJets.size()) {
					moreJets.remove(removePlane);
				} else {
					System.out.println("No plane to remove at element: " + removePlane);
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid entry detected");
				// TODO: handle exception
			}
			keyboard.nextLine();
			System.out.print("Would you like to continue ('y' or 'n')? ");
			continuing = keyboard.nextLine().toUpperCase();
			
		}
		
	}
	
}
