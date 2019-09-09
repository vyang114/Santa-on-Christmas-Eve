package street;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import main.Panel;
import others.Util;
import processing.core.PApplet;

public class Smoke {
	
	private float xstart;
	private float xnoise;
	private float ynoise;
	private PApplet pa;

	public  Smoke() {
		xstart = Util.random(10);
		xnoise = xstart;
		ynoise = Util.random(10);
		pa = new PApplet();
	}

	public void drawCloud(Graphics2D g2) {
		float noiseFactor;
		for (int y = 0; y <= 120; y += 5) {
			ynoise += 0.1;
			xnoise = xstart;
			for (int x = 0; x <= 10; x += 5) {
				xnoise += 0.1;
				noiseFactor = pa.noise(xnoise, ynoise);
				
				AffineTransform at = g2.getTransform();
				g2.translate(x, y);
				g2.rotate(noiseFactor * Math.toRadians(540.0));
				float edgeSize = noiseFactor * 35;
				int grey = (int) (150 + (noiseFactor * 105));
				int alph = (int) (150 + (noiseFactor * 105));
				g2.setColor(new Color(grey, grey, grey, alph));
				g2.fill(new Ellipse2D.Float(-edgeSize/2, -edgeSize/4, edgeSize, edgeSize/2));
				g2.setTransform(at);
			}
		}
	}
}
