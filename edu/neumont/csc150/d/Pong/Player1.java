package edu.neumont.csc150.d.Pong;

public class Player1 extends Player{
	
	public Player1() {
		
	}
	
	public Player1(String Name, int Score) {
		super(Name, Score);
	}
	
	public String toString() {
		return "Player 1: " + super.toString();
	}
}
