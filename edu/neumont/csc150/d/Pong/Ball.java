package edu.neumont.csc150.d.Pong;

public class Ball {
	private int ballX, ballY;
	
	private double ballXV, ballYV;
	
	public final int BALL_HEIGHT = 30, BALL_WIDTH = 30;

	public Ball() {
	}
	public Ball(int x, int y, double xv, double yv) {
		this.setBallX(x);
		this.setBallY(y);
		this.setBallXV(xv);
		this.setBallYV(yv);
	}
	
	/**
	 * @return the ballX
	 */
	public int getBallX() {
		return ballX;
	}

	/**
	 * @param ballX the ballX to set
	 */
	public void setBallX(int ballX) {
		this.ballX = ballX;
	}

	/**
	 * @return the ballY
	 */
	public int getBallY() {
		return ballY;
	}

	/**
	 * @param ballY the ballY to set
	 */
	public void setBallY(int ballY) {
		this.ballY = ballY;
	}

	/**
	 * @return the ballXV
	 */
	public double getBallXV() {
		return ballXV;
	}

	/**
	 * @param xv the ballXV to set
	 */
	public void setBallXV(double xv) {
		this.ballXV = xv;
	}

	/**
	 * @return the ballYV
	 */
	public double getBallYV() {
		return ballYV;
	}

	/**
	 * @param yv the ballYV to set
	 */
	public void setBallYV(double yv) {
		this.ballYV = yv;
	}

}
