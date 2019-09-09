package opening;

import static others.ImageLoader.loadImage;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import main.Panel;
import others.ImageLoader;
import others.Text;
import others.Util;
import sound.Sound;
import street.Buildings;

public class Opening {
	
	private Text txt;
	private Buildings buildings;
	
	
	private Rectangle2D.Double streetBg;
	private Rectangle2D.Double introSquare;

	private BufferedImage ribbon;
	
	
	public Opening(){
		txt = new Text();
		
		streetBg = new Rectangle2D.Double();
		
		ribbon = ImageLoader.loadImage("assets/ribbon.png");
		
		introSquare = new Rectangle2D.Double();
	}

	
	
	
	public void openingScene(Graphics2D g2){
		
	//	Sound.play("assets/christmas.wav");
		drawStreetBackground(g2);
		
		g2.drawImage(ribbon, 0, 50, null);

	
	}
	
	
	
	
	public void setStreetAttribute(){
		
		streetBg.setFrame(Panel.WIN_X, Panel.WIN_Y, Panel.WIN_W, Panel.WIN_H);
		introSquare.setFrame(Panel.WIN_X + 100, Panel.WIN_Y + 200, 150, 250);
	}

	
	
	public void drawStreetBackground(Graphics2D g2){
		
		
		setStreetAttribute();
		g2.setColor(new Color(199, 213, 214));
		g2.fill(streetBg);

		g2.setColor(Color.white);
//		g2.fill(introSquare);
		
		txt.writeIntro(g2);
		
	}
}


