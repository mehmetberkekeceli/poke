package com.course.pokemongame.main;

public class Player {
	
	public static final int POKEMON_COUNT = 2;
	public static final int MAX_HEALTH = 100;
	
	private String name;
	private int health = Player.MAX_HEALTH;
	private Pokemon[] pokemons = new Pokemon[Player.POKEMON_COUNT];
	private int currentPokemonIndise;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, Pokemon[] pokemons) {
		this(name);
		this.pokemons = pokemons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public int getCurrentPokemonIndise() {
		return currentPokemonIndise;
	}

	public static int getPokemonCount() {
		return POKEMON_COUNT;
	}

	public static int getMaxHealth() {
		return MAX_HEALTH;
	}
	
	@Override
	public String toString() {
		
		return this.name + " " + this.health;
	}
	
	public Pokemon getNextPokemon() {
		Pokemon p = this.pokemons[this.currentPokemonIndise];
		
		if(this.currentPokemonIndise == 0) {
			this.currentPokemonIndise = 1;
		}else {
			this.currentPokemonIndise = 0;
		}
		return p;
	}
	
	public boolean isAlive() {
		
		if(this.getHealth() <= 0) return false;
		
		return true;
	}

}
