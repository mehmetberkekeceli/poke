package com.course.pokemongame.main;

import java.util.Scanner;

public class Game {
	private Player player1;
	private Player player2;
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	public void start() {
		System.out.println(player1);
		System.out.println(player2);
		Scanner s = new Scanner(System.in);
		while(true) {
			Pokemon pokemon1 = this.player1.getNextPokemon();
			Pokemon pokemon2 = this.player2.getNextPokemon();
			pokemon1.hit(player2);
			if(player2.getHealth() < 10 && pokemon2 instanceof Boostable) {
				System.out.println("Boost for " + player2.getName());
				Boostable b = (Boostable) pokemon2;
				b.boost();
			}
			if(!player2.isAlive()) {
				anonsWinner(player1);
				break;
			}
			pokemon2.hit(player1);
			if(player1.getHealth() < 10 && pokemon1 instanceof Boostable) {
				System.out.println("Boost for " + player1.getName());
				Boostable b = (Boostable) pokemon1;
				b.boost();
			} 
			if(!player1.isAlive()) {
				anonsWinner(player2);
				break;
			}	
			printTurnResult();
			s.nextLine();
		}	
	}
	private void printTurnResult() {
		System.out.println(player1);
		System.out.println(player2);	
	}
	private void anonsWinner(Player player) {
		System.out.println(player.getName().toUpperCase() + " HAS WON!");	
	}
}
