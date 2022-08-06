package com.course.pokemongame.main;

public class Pokemon {
	private String name;
	private int power;
	
	public Pokemon(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void hit(Player enemy) {
		enemy.setHealth(enemy.getHealth() - this.power);
	}
	
	public void printAttackDetail() {
		System.out.println(this.name + " attacked with power of: " + this.power);
	}
}
