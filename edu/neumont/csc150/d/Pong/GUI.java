package edu.neumont.csc150.d.Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GUI extends JPanel implements MouseMotionListener, KeyListener {
	
	
	Paddle p1 = new Paddle(20, 0);
	Paddle p2 = new Paddle(598, 0);
	
	Ball ball = new Ball(50, 50, 4, 0);
	
	public GUI() {
		this.setBackground(Color.BLACK);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(p1.getPaddleX(), p1.getPaddleY(), p1.PADDLE_WIDTH, p1.PADDLE_HEIGHT);
		g.fillRect(p2.getPaddleX(), p2.getPaddleY(), p2.PADDLE_WIDTH, p2.PADDLE_HEIGHT);
		g.fillRect(ball.getBallX(), ball.getBallY(), ball.BALL_WIDTH, ball.BALL_HEIGHT);
		moveBall();
		this.addMouseMotionListener(this);
		detectBallCollision();
	}
	
	private void moveBall() {
		ball.setBallX(ball.getBallX() + ball.getBallXV());
		this.repaint();
	}
	
	private void detectBallCollision() {
		if (ball.getBallX() == p2.getPaddleX() && ball.getBallY() == p2.getPaddleY() ||
				ball.getBallX() == p1.getPaddleX()) {
			ball.setBallXV((int) (ball.getBallXV() * -1.5));
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.p2.setPaddleY(e.getY() - (p2.PADDLE_HEIGHT / 2));
		this.repaint();
	}

}
