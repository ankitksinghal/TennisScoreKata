package com.tennis.kata.game.player;

import org.springframework.stereotype.Component;

/**
 * 
 * This player class which keeps track of player name and score
 * 
 * @author AKS1405
 *
 */
@Component
public class Player {
	
	private String playerName;
	
	private int playerScore;

	/**
	 * Getter method to get player name
	 * 
	 * @return String
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * Setter method to set player name
	 * 
	 * @param playerName
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	/**
	 * Getter method to get player score
	 * 
	 * @return 
	 */
	public int getPlayerScore() {
		return playerScore;
	}
	
	/**
	 * Setter method to set player score
	 * 
	 * @param playerScore
	 */
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerScore=" + playerScore + "]";
	}
}
