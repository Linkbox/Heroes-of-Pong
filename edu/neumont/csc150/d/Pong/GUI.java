package edu.neumont.csc150.d.Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel implements MouseMotionListener, KeyListener {
	
	
	Paddle p1 = new Paddle(20, 0);
	Paddle p2 = new Paddle(598, 0);
	
	Ball ball = new Ball(75, 75, 5, 0);
	
	private final int MAXIMUM_VELOCITY = 25;
	
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
	
	public void initGUI() {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame.getContentPane().add(this);
		frame.setVisible(true);
	}

	
	private void moveBall() {
		ball.setBallX((int) (ball.getBallX() + ball.getBallXV()));
		this.repaint();
	}
	
	private void detectBallCollision() {
		if (ball.getBallX() + ball.BALL_WIDTH < p2.getPaddleX()  + Math.abs(ball.getBallXV()) && 
				ball.getBallX() + ball.BALL_WIDTH > p2.getPaddleX() - Math.abs(ball.getBallXV())  &&
				ball.getBallY() + ball.BALL_HEIGHT > p2.getPaddleY()||
				ball.getBallX() < (p1.getPaddleX() + p1.PADDLE_WIDTH) - Math.abs(ball.getBallXV())) {
			if (ball.getBallXV() > Math.abs(MAXIMUM_VELOCITY)) {				
				ball.setBallXV(ball.getBallXV() * -0.5);
			} else {
				ball.setBallXV(ball.getBallXV() * -1.25);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.get) {
			p1.setPaddleY(p1.getPaddleY() + 1);
		}
		this.repaint();
		
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
