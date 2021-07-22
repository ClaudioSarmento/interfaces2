package model.entities;

import model.enums.Color;
import model.service.Shape;

public abstract class AbstractShape implements Shape{
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public AbstractShape(Color color) {
		this.color = color;
	}
	
	
}
