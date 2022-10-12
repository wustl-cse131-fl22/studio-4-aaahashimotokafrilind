package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5, 0.6, 0.35, 0.1);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, 0.4, 0.35, 0.1);
		
	}
}