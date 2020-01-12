package com.tennis.kata;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tennis.kata.game.TennisGameScore;
import com.tennis.kata.game.player.Player;

/**
 * Class that allows user to input from command line for both player and outcome of game displayed on command line
 * 
 * @author AKS1405
 *
 */
@Component
public class TennisKataRunner implements CommandLineRunner {

	@Autowired
	@Qualifier("Player1")
	private Player player1;

	@Autowired
	@Qualifier("Player2")
	private Player player2;
	
	
	@Autowired
	private TennisGameScore tennisGame;

	@Override
	public void run(String... args) throws IOException {

		try (Scanner inputReader = new Scanner(System.in)) {
			do {
				System.out.println("Please enter first player name : ");
				String playerName1 = inputReader.next();
				player1.setPlayerName(playerName1);				

				System.out.println("Please enter second player name : ");
				String playerName2 = inputReader.next();
				player2.setPlayerName(playerName2);		
				
				if (playerName1.trim().equalsIgnoreCase(playerName2.trim())) {
					System.out.println("Both player names are same, please enter two different players!!!");
				}
				else {
					break;
				}			
				
			} while(true);
			
			System.out.println("Please enter first player score : ");
			int score = inputReader.nextInt();
			player1.setPlayerScore(score);
			
			System.out.println("Please enter second player score : ");
			score = inputReader.nextInt();
			player2.setPlayerScore(score);
			
			System.out.format("Game outcome : %s", tennisGame.getScore());
		} catch (InputMismatchException ex) {
			System.out.format("Required input for score is integer... %s", ex.getMessage());
		}
	}
}
