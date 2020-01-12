package com.tennis.kata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tennis.kata.game.player.Player;

/**
 * This config class creates two instances of player class
 * 
 * @author AKS1405
 *
 */
@Configuration
public class TennisKataConfig {
	
	@Bean("Player1")
	public Player playerOneConfig() {
		return new Player();
	}
	
	@Bean("Player2")
	public Player playerSecondConfig() {
		return new Player();
	}
}
