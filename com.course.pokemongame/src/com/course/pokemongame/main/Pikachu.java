package com.course.pokemongame.main;

public class Pikachu extends Pokemon implements Boostable {
	
	public static final String NAME = "Pikachu";
	public static final int POWER = 10;
	
	public Pikachu() {
		super(Pikachu.NAME, Pikachu.POWER);
	}

	@Override
	public void boost() {
		
		this.setPower(this.getPower() * 2);
		
	}

}
