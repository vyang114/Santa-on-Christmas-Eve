package house;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.xml.soap.Text;

import main.Panel;
import others.Util;

public class TreeLights extends Decoration{
	
	private Ellipse2D.Double lightbulb;
	private Ellipse2D.Double lightbulbBeam;
	private double lightbulbX, lightbulbY;
	
	private Ellipse2D.Double topLight;

	private Color lightColor;
	
	public TreeLights(double x, double y, Color lc){
		
		lightbulb = new Ellipse2D.Double();
		lightbulbBeam = new Ellipse2D.Double();
		topLight = new Ellipse2D.Double();

		lightbulbX = x;
		lightbulbY = y;
		lightColor = lc;
	}
	
	
	
	public void display(Graphics2D g2){
		
		lightbulb.setFrame(lightbulbX, lightbulbY, 10, 10);
		topLight.setFrame(Panel.WIN_X + 805 - 15, Panel.WIN_Y + 180 - 15, 30, 30);

		g2.setColor(lightColor);
		g2.fill(lightbulb);	

		g2.setColor(Color.yellow);
		g2.fill(topLight);
		
		txt.inRoomText(g2);
	}

	
	
	public void drawBeam(Graphics2D g2){
		lightbulbBeam.setFrame(lightbulbX - 5, lightbulbY - 5, 20, 20);
		g2.setColor(new Color((int) 255, (int) Util.random(0, 255), (int) Util.random(0, 255), 60));
		g2.fill(lightbulbBeam);
	}

}
