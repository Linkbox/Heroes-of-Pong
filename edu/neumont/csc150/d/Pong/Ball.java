package edu.neumont.csc150.d.Pong;

public class Ball {
	private int ballX, ballY, ballXV, ballYV;
	
	public final int BALL_HEIGHT = 24, BALL_WIDTH = 24;

	public Ball() {
	}
	public Ball(int x, int y, int xv, int yv) {
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
	public int getBallXV() {
		return ballXV;
	}

	/**
	 * @param ballXV the ballXV to set
	 */
	public void setBallXV(int ballXV) {
		this.ballXV = ballXV;
	}

	/**
	 * @return the ballYV
	 */
	public int getBallYV() {
		return ballYV;
	}

	/**
	 * @param ballYV the ballYV to set
	 */
	public void setBallYV(int ballYV) {
		this.ballYV = ballYV;
	}

}
