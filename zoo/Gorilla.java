package com.stefanie.zoo;

public class Gorilla extends Mammal {

	public Gorilla(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// Methods
	public void throwSomething() {
		int newenergy = (this.getEnergyLevel() - 5);
		System.out.println("The gorilla has thrown something as well as decrease the energy level by 5");
		System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
		return ;
	}

	public void eatBananas() {
		System.out.println("the gorilla's satisfaction and increase its energy by 10");
		int newenergy = (this.getEnergyLevel() + 10);
		System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
	}

	public void climb() {
		System.out.println("he gorilla has climbed a tree and decrease its energy by 10");
		int newenergy = (this.getEnergyLevel() - 10);
		System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
	}

}
