package opening;

import java.awt.*;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import java.awt.Image;

import others.ImageLoader;
import others.Util;
import main.Panel.*;


public class Santa extends Opening{

	private Image[] santaImgs = new Image[8]; // array for images of fisherman
	private int indexSanta = 0; // index used for animate fisherman reeling fish line
	
	
	public Santa(){
		super();
		
		// Create image sequence for animation of fisherman
		for (int i = 0; i < santaImgs.length; i++) {
			santaImgs[i] = ImageLoader.loadImage("assets/santa" + (i + 1) + ".gif");
		}
	}
	
	
	public void openingScene(Graphics2D g2) {
		super.openingScene(g2);		
		
		AffineTransform at1 = g2.getTransform();
		g2.drawImage(santaImgs[indexSanta], 350, 400, null);

		indexSanta++; 		// plays each image
		indexSanta %= 8;	//make sure index won't go over the length
		
		g2.setTransform(at1);
	}
}
