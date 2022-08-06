package com.course.pokemongame.main;

public class Application {

	public static void main(String[] args) {
		
		Player player1 = new Player("qwe");
		

		Pokemon[] player1Characters = new Pokemon[2];
		Pokemon[] player2Characters = new Pokemon[2];

		player1Characters[0] = new Misty();
		player1Characters[1] = new Pikachu();

		player2Characters[0] = new Pikachu();
		player2Characters[1] = new Charizard();

		player1.setPokemons(player1Characters);
		
		Player player2 = new Player("asd", player2Characters);
		//player2.setPokemons(player2Characters);

		Game game = new Game(player1, player2);
		game.start();
	}

}
