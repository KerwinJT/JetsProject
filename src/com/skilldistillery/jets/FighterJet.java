package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FighterJet [toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public void fly() {
		System.out.println("Pew Pew, I have a gun");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		System.out.println(this.getModel() + ": Popping flares, doing turns, staring at the sun. OMG I'M LOST!");
		// TODO Auto-generated method stub
		
	}

}
