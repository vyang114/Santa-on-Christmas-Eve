package street;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import main.Panel;
import others.Util;

public class Trees {
	
	private double trunkX, trunkY;
	private int trunkW, trunkH;
	
	private Rectangle2D.Double trunk, trunk2, trunk3, trunk4, trunk5;
	
	public Trees(){
		
		trunkW = 7;
		trunkH = 25;
		
		trunk = new Rectangle2D.Double();
		trunk2 = new Rectangle2D.Double();
		trunk3 = new Rectangle2D.Double();
		trunk4 = new Rectangle2D.Double();
		trunk5 = new Rectangle2D.Double();
	}
	
	
	public void drawMe(Graphics2D g2){

		trunk.setFrame(Panel.WIN_X + 200, Panel.WIN_H - 210, trunkW, trunkH);
		trunk2.setFrame(Panel.WIN_X + 350, Panel.WIN_H - 130, trunkW, trunkH);
		trunk3.setFrame(Panel.WIN_X + 530, Panel.WIN_H - 225, trunkW, trunkH);
		trunk4.setFrame(Panel.WIN_X + 630, Panel.WIN_H - 185, trunkW, trunkH);
		trunk5.setFrame(Panel.WIN_X + 800, Panel.WIN_H - 120, trunkW, trunkH);
		
		//trunk
		g2.setColor(new Color(108, 82, 7));
		g2.fill(trunk);
		g2.fill(trunk2);
		g2.fill(trunk3);
		g2.fill(trunk4);
		g2.fill(trunk5);

		//leaves
		g2.setColor(new Color(59, 122, 147));
		g2.fillPolygon(new int[] {Panel.WIN_X + 190, Panel.WIN_X + 205, Panel.WIN_X + 220},
					new int[] {Panel.WIN_H - 195, Panel.WIN_H - 240, Panel.WIN_H - 195}, 3);
		
		g2.fillPolygon(new int[] {Panel.WIN_X + 343, Panel.WIN_X + 355, Panel.WIN_X + 365},
				new int[] {Panel.WIN_H - 115, Panel.WIN_H - 155, Panel.WIN_H - 115}, 3);
		
		g2.fillPolygon(new int[] {Panel.WIN_X + 620, Panel.WIN_X + 633, Panel.WIN_X + 648},
				new int[] {Panel.WIN_H - 175, Panel.WIN_H - 220, Panel.WIN_H - 175}, 3);
		
		g2.setColor(new Color(62, 166, 159));
		g2.fillPolygon(new int[] {Panel.WIN_X + 515, Panel.WIN_X + 535, Panel.WIN_X + 555},
				new int[] {Panel.WIN_H - 210, Panel.WIN_H - 280, Panel.WIN_H - 210}, 3);

		g2.fillPolygon(new int[] {Panel.WIN_X + 790, Panel.WIN_X + 805, Panel.WIN_X + 820},
				new int[] {Panel.WIN_H - 110, Panel.WIN_H - 150, Panel.WIN_H - 110}, 3);

		
	}

}
