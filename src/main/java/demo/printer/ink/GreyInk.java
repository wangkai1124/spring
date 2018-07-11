package demo.printer.ink;

import java.awt.Color;

import demo.printer.printer.Ink;

public class GreyInk implements Ink{

	@Override
	public String getColor(int r, int g, int b) {
		int c = (r + g + b) / 3;
		Color color = new Color(c, c, c);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
	
}
