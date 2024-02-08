package com.stefanie.zoo;

public class Bat extends Mammal {


	public Bat(String name) {
		super(name);
		this.energyLevel = 300;
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		if(this.getEnergyLevel() < 50) {
			System.out.println(this.getName() +" die ");
		}else {
		int newenergy = (this.getEnergyLevel() - 50);
		System.out.println("kiggg kiggg kiggg");
		//System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
		return ;
		}
	}

	public void eatHumans() {
		if(this.getEnergyLevel() < 50) {
			System.out.println(this.getName() +" die ");
		}else {
		int newenergy = (this.getEnergyLevel() + 25);
		System.out.println("so- well, never mind");
		//System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
		return ;}
	}

	public void attackTown() {
		if(this.getEnergyLevel() < 50) {
			System.out.println(this.getName() +" die ");
		}else {
		int newenergy = (this.getEnergyLevel() - 100);
		System.out.println("fggggggggggggg");
		//System.out.println("the new energy is " + newenergy);
		setEnergyLevel(newenergy);
		return ;}
	}

}
