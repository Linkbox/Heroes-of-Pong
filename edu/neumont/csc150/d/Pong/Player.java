package edu.neumont.csc150.d.Pong;

public class Player {

	private String name;
	private int score;
	
	public Player() {
		score = 0;
		name = " ";
	}
	
	public Player(String Name, int Score) {
		this.setName(Name);
		this.setScore(Score);
	}
	
	/**
	 * @return the score set for each player
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * @param score the score to set for each player
	 */
	
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * @return the name that is set to each player
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set to each player
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Player " + this.getName() + "Score " + this.getScore();
	}
	
}
