package demo.printer.ink;

import java.awt.Color;

import demo.printer.printer.Ink;

public class ColorInk implements Ink{

	@Override
	public String getColor(int r, int g, int b) {
		Color color = new Color(r, g, b);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
	
}
