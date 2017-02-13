package edu.neumont.csc150.d.Pong;

public class Paddle {

	private int paddleX, paddleY;
	
	public final int PADDLE_HEIGHT = 200, PADDLE_WIDTH = 50;

	public Paddle() {
	}
	public Paddle(int pX, int pY) {
		this.setPaddleX(pX);
		this.setPaddleY(pY);
	}
	
	/**
	 * @return the paddleX
	 */
	public int getPaddleX() {
		return paddleX;
	}

	/**
	 * @param paddleX the paddleX to set
	 */
	public void setPaddleX(int paddleX) {
		this.paddleX = paddleX;
	}

	/**
	 * @return the paddleY
	 */
	public int getPaddleY() {
		return paddleY;
	}

	/**
	 * @param paddleY the paddleY to set
	 */
	public void setPaddleY(int paddleY) {
		this.paddleY = paddleY;
	}

}
