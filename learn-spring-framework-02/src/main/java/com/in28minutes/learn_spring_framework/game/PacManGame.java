package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	
	public void left() {
		System.out.println("Pacman goes left");
	}
	public void right() {
		System.out.println("Pacman goes right");
	}
	public void up() {
		System.out.println("Pacman goes up");
	}
	public void down() {
		System.out.println("Pacman goes down");
	}
}
