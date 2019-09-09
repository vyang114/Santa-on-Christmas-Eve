package house;

import java.awt.Graphics2D;

import others.Text;

public abstract class Decoration {
	
	public Text txt;
	
	public Decoration(){
		
		txt = new Text();
		
	}

	
	public abstract void display(Graphics2D g2);
}

