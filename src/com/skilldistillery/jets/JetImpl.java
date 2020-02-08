package com.skilldistillery.jets;

public class JetImpl extends Jet{
	private double passengerCapacity;

	public JetImpl(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	

	public JetImpl(String model, double speed, double range, double price, double passengerCapacity) {
		super(model, speed, range, price);
		this.passengerCapacity = passengerCapacity;
	}


	@Override
	public void fly() {
		System.out.println("I fly passengers all around the world!");
		// TODO Auto-generated method stub
		
	}


	public double getPassengerCapacity() {
		return passengerCapacity;
	}


	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(passengerCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JetImpl other = (JetImpl) obj;
		if (Double.doubleToLongBits(passengerCapacity) != Double.doubleToLongBits(other.passengerCapacity))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "JetImpl [passengerCapacity=" + passengerCapacity + ", toString()=" + super.toString() + "]";
	}
	

}
