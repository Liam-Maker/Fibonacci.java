package week2;

import java.awt.Color;
import acm.util.*;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class RandomCircles extends GraphicsProgram {
	
	private static final int CIRCLES = 10;
	private static final double MIN_RADIUS = 5;
	private static final double MAX_RADIUS = 50;
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	//create circles here
	
	public void run() {
		for(int i = 0; i < CIRCLES; i++) {
			double radius = rgen.nextDouble(MIN_RADIUS,MAX_RADIUS);
			double positionX = rgen.nextDouble(0,getWidth());
			double positionY = rgen.nextDouble(0,getHeight());
			GOval circle = new GOval(positionX, positionY, radius, radius); 
			circle.setColor(rgen.nextColor());
			circle.setFillColor(rgen.nextColor());
			circle.setFilled(true);
			add(circle);
		}
		
	}
}
