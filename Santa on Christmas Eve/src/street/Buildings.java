package street;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import main.Panel;
import others.Util;

public class Buildings {
	
	public int buildingX, buildingY;
	public int buildingW, buildingH;
	
	protected Color buildingC, buildingC2, buildingC3, buildingC4, buildingC5;
	
	private Rectangle2D.Double building, building2, building3, building4, building5;
	public Rectangle2D.Double window, window2, window3, window4, window5, window6, window7, window8;
	
	
	public Buildings(){
		
		buildingX = Panel.WIN_X + 250;
		buildingY = Panel.WIN_H - 280;
		buildingW = 90;
		buildingH = 100;
		buildingC = new Color(142, 58, 58);
		buildingC2 = new Color(67, 76, 83);
		buildingC3 = new Color(222, 159, 90);
		buildingC4 = new Color(99, 53, 89);
		buildingC5 = new Color(115, 130, 125);
		
		building = new Rectangle2D.Double();
		building2 = new Rectangle2D.Double();
		building3 = new Rectangle2D.Double();
		building4 = new Rectangle2D.Double();
		building5 = new Rectangle2D.Double();
		
		window = new Rectangle2D.Double();
		window2 = new Rectangle2D.Double();
		window3 = new Rectangle2D.Double();
		window4 = new Rectangle2D.Double();
		window5 = new Rectangle2D.Double();
		window6 = new Rectangle2D.Double();
		window7 = new Rectangle2D.Double();
		window8 = new Rectangle2D.Double();
		
	}
	

	public void drawMe(Graphics2D g2){
		
		drawBuilding1(g2);
		drawBuilding2(g2);
		drawBuilding3(g2);
		drawBuilding4(g2);
		drawBuilding5(g2);
	}

	
	public void drawBuilding1(Graphics2D g2){
		building.setFrame(buildingX, buildingY, buildingW, buildingH);
		
		g2.setColor(buildingC);
		g2.fill(building);
		
		window.setFrame(buildingX + 15, buildingY + 40, 15, 30);
		window2.setFrame(buildingX + 55, buildingY + 40, 15, 30);
		g2.setColor(Color.white);
		g2.fill(window);
		g2.fill(window2);		
		
		Line2D.Double line, line2, line3;
		line = new Line2D.Double(buildingX + 22, buildingY + 40, buildingX + 22, buildingY + 70);
		line2 = new Line2D.Double(buildingX + 62, buildingY + 40, buildingX + 62, buildingY + 70);
		line3 = new Line2D.Double(buildingX + 15, buildingY + buildingH/2 + 5, buildingX + 84, buildingY + buildingH/2 + 5);
		
		g2.setColor(buildingC);
		g2.draw(line);
		g2.draw(line2);
		g2.draw(line3);
		
		g2.setColor(Color.white);
		g2.fillPolygon(new int[] {(int) (buildingX - 25), (int) (buildingX + buildingW/2), (int) (buildingX + buildingW + 25)}, 
				   new int[] {buildingY + 30, buildingY - 60, buildingY + 30}, 3);
		
	}
	
	
	public void drawBuilding2(Graphics2D g2){
		building2.setFrame(buildingX + 130, buildingY - 80, buildingW - 30, buildingH + 80);
		
		g2.setColor(buildingC2);
		g2.fill(building2);
		
		window3.setFrame(buildingX + 140, buildingY, 40, 50);
		g2.setColor(Color.white);
		g2.fill(window3);
		
		Line2D.Double line4, line5;		
		line4 = new Line2D.Double(buildingX + 140, buildingY + 25, buildingX + 180, buildingY + 25);
		line5 = new Line2D.Double(buildingX + 160, buildingY, buildingX + 160, buildingY + 50);
		
		g2.setColor(buildingC2);
		g2.draw(line4);
		g2.draw(line5);
		
		g2.setColor(Color.white);
		g2.fillPolygon(new int[] {(int) (buildingX + buildingW + 20), (int) (buildingX + buildingW/2 + 115), (int) (buildingX + buildingW + 120)}, 
				   new int[] {buildingY - 50, buildingY - 130, buildingY - 50}, 3);
		
	}
	
	
	public void drawBuilding3(Graphics2D g2){
		building3.setFrame(buildingX + 230, buildingY + 30, buildingW - 50, buildingH - 50);
		
		g2.setColor(buildingC3);
		g2.fill(building3);
		
		window4.setFrame(buildingX + 240, buildingY + 50, 20, 20);
		g2.setColor(Color.white);
		g2.fill(window4);
		
		Line2D.Double line6, line7;
		
		line6 = new Line2D.Double(buildingX + 240, buildingY + 60, buildingX + 260, buildingY + 60);
		line7 = new Line2D.Double(buildingX + 250, buildingY + 50, buildingX + 250, buildingY + 70);
		
		g2.setColor(buildingC3);
		g2.draw(line6);
		g2.draw(line7);
		
		g2.setColor(Color.white);
		g2.fillPolygon(new int[] {(int) (buildingX + buildingW + 120), (int) (buildingX + buildingW/2 + 205), (int) (buildingX + buildingW + 195)}, 
				   new int[] {buildingY + 30, buildingY - 30, buildingY + 30}, 3);
		
	}
	
	
	public void drawBuilding4(Graphics2D g2){
		building4.setFrame(buildingX + 300, buildingY - 30, buildingW + 30, buildingH + 20);
		
		g2.setColor(buildingC4);
		g2.fill(building4);
		
		window5.setFrame(buildingX + 320, buildingY + 30, 15, 30);
		window6.setFrame(buildingX + 353, buildingY + 30, 15, 30);
		window7.setFrame(buildingX + 385, buildingY + 30, 15, 30);
		g2.setColor(Color.white);
		g2.fill(window5);
		g2.fill(window6);
		g2.fill(window7);
		
		Line2D.Double line8, line9, line10, line11;

		line8 = new Line2D.Double(buildingX + 327, buildingY + 30, buildingX + 327, buildingY + 60);
		line9 = new Line2D.Double(buildingX + 360, buildingY + 30, buildingX + 360, buildingY + 60);
		line10 = new Line2D.Double(buildingX + 393, buildingY + 30, buildingX + 393, buildingY + 60);
		line11 = new Line2D.Double(buildingX + 320, buildingY + 45, buildingX + 400, buildingY + 45);
		
		g2.setColor(buildingC4);
		g2.draw(line8);
		g2.draw(line9);
		g2.draw(line10);
		g2.draw(line11);
		
		g2.setColor(Color.white);
		g2.fillPolygon(new int[] {(int) (buildingX + buildingW + 183), (int) (buildingX + buildingW/2 + 315), (int) (buildingX + buildingW + 360)}, 
				   new int[] {buildingY + 5, buildingY - 110, buildingY + 5}, 3);
		
		
	}
	
	public void drawBuilding5(Graphics2D g2){
		building5.setFrame(buildingX + 480, buildingY, buildingW - 10, buildingH + 20);
		
		g2.setColor(buildingC5);
		g2.fill(building5);
		
		window8.setFrame(buildingX + 505, buildingY + 40, 30, 30);
		g2.setColor(Color.white);
		g2.fill(window8);
		
		Line2D.Double line12, line13;
		
		line12 = new Line2D.Double(buildingX + 520, buildingY + 40, buildingX + 520, buildingY + 70);
		line13 = new Line2D.Double(buildingX + 505, buildingY + 55, buildingX + 535, buildingY + 55);
		
		g2.setColor(buildingC5);
		g2.draw(line12);
		g2.draw(line13);		
		
		g2.setColor(Color.white);
		g2.fillPolygon(new int[] {(int) (buildingX + buildingW + 370), (int) (buildingX + buildingW/2 + 470), (int) (buildingX + buildingW + 490)}, 
				   new int[] {buildingY + 20, buildingY - 90, buildingY + 20}, 3);
				
		
	}


	
}
