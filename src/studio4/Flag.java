package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.rectangle(0.5, 0.5, 0.375, 0.25);
		
		Color PURPLE = new Color(255, 0, 255);
		
		StdDraw.setPenColor(PURPLE);
		
		StdDraw.filledRectangle(0.375, 0.5, 0.125, 0.125);
		
		StdDraw.setPenColor(Color.GREEN);
		
		StdDraw.filledRectangle(0.625, 0.5, 0.125, 0.125);
		
		StdDraw.setPenColor(Color.RED);
		
		StdDraw.filledCircle(0.5, 0.5, 0.05);
	}
}