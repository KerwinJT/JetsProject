package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier{
	private double cargoCapacity;

	public CargoPlane(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	

	public CargoPlane(String model, double speed, double range, double price, double cargoCapacity) {
		super(model, speed, range, price);
		this.cargoCapacity = cargoCapacity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cargoCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public String toString() {
		return "CargoPlane [cargoCapacity=" + cargoCapacity + ", toString()=" + super.toString() + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoPlane other = (CargoPlane) obj;
		if (Double.doubleToLongBits(cargoCapacity) != Double.doubleToLongBits(other.cargoCapacity))
			return false;
		return true;
	}


	public double getCargoCapacity() {
		return cargoCapacity;
	}


	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}


	@Override
	public void fly() {
		System.out.println("I'm loud but can carry a lot of cargo!");
		// TODO Auto-generated method stub
		
	}

}
