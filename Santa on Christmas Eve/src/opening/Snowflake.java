package opening;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import main.Panel;
import others.Util;

public class Snowflake extends Opening{

	
	public Snowflake(){
		super();
	}
	
	
	public void openingScene(Graphics2D g2){		
		super.openingScene(g2);
		
		AffineTransform a = g2.getTransform();
		
		g2.scale(0.4, 0.4);
		g2.translate(Panel.WIN_W/2 - 70, Panel.WIN_H/2 + 148);
		drawSnowflake(g2, 80);
		g2.setTransform(a);
		
		a = g2.getTransform();
		g2.scale(0.4, 0.4);
		g2.translate(Panel.WIN_W/2 - 70, Panel.WIN_H/2 + 70);
		g2.rotate(Math.PI);
		drawSnowflake(g2, 80);
		g2.setTransform(a);
}

	
	
	public void drawSnowflake(Graphics2D g2, float len) {
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.white);
		g2.draw(new Line2D.Float(0, 0, 0, -len)); // Draw the branch itself
		g2.translate(0, -len/2); // Move to the end of that line
		len *= 0.5; // Shrink the length of the branch
		
		if (len > 10) { // Base case: exit when the length of the branch is 2 pixels or less
			AffineTransform at = g2.getTransform();
			g2.rotate(Math.PI / 4); // Rotate to the right
			drawSnowflake(g2, len); // Call itself to draw a shorter branch!!
			g2.setTransform(at);
			
			// Repeat the same thing, only branch off to the "left" this time!
			at = g2.getTransform();
			g2.rotate(-Math.PI / 4);
			drawSnowflake(g2, len);
			g2.setTransform(at);
			
			at = g2.getTransform();
			g2.rotate(5*Math.PI/4);
			
			g2.setTransform(at);
		}
	}
	
	
	
}
