package com.stefanie.zoo;

public class Mammal {
	protected int energyLevel;
	private String name;

	

	// CONSTRUCTOR
	public Mammal( String name) {
		setName(name);
		this.energyLevel = 100;
	}

	// METHODS
	public int displayEnergy() {
		
		System.out.println(this.getName()+ "have " + this.getEnergyLevel() + " energy");
		return this.getEnergyLevel();
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
