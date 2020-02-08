package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> moreJets = new ArrayList<>();

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
					System.out.println("Adding Cargo");
				} else if (line.contains("Passenger")) {
					String[] classLine = line.split(",");
					moreJets.add(new JetImpl(classLine[1], Double.parseDouble(classLine[2]),
							Double.parseDouble(classLine[3]), Double.parseDouble(classLine[4]),
							Double.parseDouble(classLine[5])));
					System.out.println("Adding Passenger");
				} else if (line.contains("Fighter")) {
					String[] classLine = line.split(",");
					for (String string : classLine) {
						System.out.println(string);
					}
					moreJets.add(new FighterJet
							(classLine[1], 
							Double.parseDouble(classLine[2]),
							Double.parseDouble(classLine[3]), Double.parseDouble(classLine[4])));
					System.out.println("Adding Fighter");
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	public void printJets() {
		for (Jet jet : moreJets) {
			System.out.println(jet.toString());
		}
	}
	public void flyJeys() {
		for (Jet jet : moreJets) {
			jet.fly();
		}
	}

}
