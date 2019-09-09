package street;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import main.Panel;
import others.Util;

public class Snow {
	
	private Ellipse2D.Double snowflake;
	public double snowX, snowY;
	public double diameter;
	
	private double wave, waveSpeed, waveAmplify;
	
	public Snow(double d){
		snowX = Util.random(diameter, Panel.WIN_W - diameter);
		snowY = Util.random(diameter, Panel.WIN_H - diameter);
		
		diameter = d;
		
		wave = 0;
		waveSpeed = Util.random(0.05, 0.20);
		waveAmplify = Util.random(1.2, 1.8);
		
		snowflake = new Ellipse2D.Double();
	}
	
	
	public void drawMe(Graphics2D g2){
		
		snowflake.setFrame(snowX, snowY, diameter, diameter);
		
		g2.setColor(Color.white);
		g2.fill(snowflake);
		
	}
	
	
	public void move (){
		wave += waveSpeed;
		
		snowX += Math.sin(wave) * waveAmplify;
		snowY += 1.5;
	}

}
