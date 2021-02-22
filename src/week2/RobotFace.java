package week2;

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	private static final double EYE_RADIUS = 78;
	private static final double HEAD_HEIGHT = 500;
	private static final double HEAD_WIDTH = 345;
	private static final double MOUTH_WIDTH = 200;
	private static final double MOUTH_HEIGHT = 80;
	
	public void run(){
	
		GRect head = new GRect(800, 200, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.BLACK);
		head.setFillColor(Color.GRAY);
		head.setFilled(true);
		add(head);
		
		GOval lefteye = new GOval(855, 287, EYE_RADIUS, EYE_RADIUS);
		lefteye.setColor(Color.YELLOW);
		lefteye.setFillColor(Color.YELLOW);
		lefteye.setFilled(true);
		add(lefteye);
		
		GOval righteye = new GOval(1015, 287, EYE_RADIUS, EYE_RADIUS);
		righteye.setColor(Color.YELLOW);
		righteye.setFillColor(Color.YELLOW);
		righteye.setFilled(true);
		add(righteye);
		
		GRect mouth = new GRect(870, 550, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.GRAY);
		mouth.setFillColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);
	}
}
