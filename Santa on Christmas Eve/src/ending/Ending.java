package ending;

import others.Text;
import static others.ImageLoader.loadImage;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import main.Panel;
import others.ImageLoader;


public class Ending {
	
	private BufferedImage ribbon;	
	private Text txt;
	private Rectangle2D.Double streetBg;
	
	public Ending(){
		
		txt = new Text();
		ribbon = ImageLoader.loadImage("assets/ribbon.png");
		streetBg = new Rectangle2D.Double();
	}
	
	
	
	public void endingScene(Graphics2D g2){
		
	//	Sound.play("assets/christmas.wav");
		streetBg.setFrame(Panel.WIN_X, Panel.WIN_Y, Panel.WIN_W, Panel.WIN_H);
		g2.setColor(new Color(199, 213, 214));
		g2.fill(streetBg);
	
		g2.drawImage(ribbon, 0, 50, null);
		txt.writeEnd(g2);
		
		
	
	}
	
	
	
}
