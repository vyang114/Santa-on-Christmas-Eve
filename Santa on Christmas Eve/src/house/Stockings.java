package house;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import main.Panel;
import others.Text;

public class Stockings {
	
	private Text txt;
	
	public int stockingX1, stockingY1, stockingW, stockingH;
	public int stockingX2, stockingY2;
	public int stockingX3, stockingY3;
	public int stockingX4, stockingY4;
	
	public boolean stocking1Hung, stocking2Hung, stocking3Hung, stocking4Hung = false;
	
	private boolean hook1None = true;
	private boolean hook2None = true;
	private boolean hook3None = true;
	private boolean hook4None = true;

	private int hookX, hookY;
	private Line2D.Double hook1, hook2, hook3, hook4;
	
	public Rectangle2D.Double stockingTop, stockingBody, stockingTop2, stockingBody2, stockingTop3, stockingBody3, stockingTop4, stockingBody4;
	private Arc2D.Double stockingBottom, stockingBottom2, stockingBottom3, stockingBottom4;


	public Stockings(){
		
		txt = new Text();
		
		stockingX1 = 820;
		stockingY1 = 420;
		stockingW = 15;
		stockingH = 35;
		
		stockingX2 = 165;
		stockingY2 = 165;
		
		stockingX3 = 465;
		stockingY3 = 200;
		
		stockingX4 = 250;
		stockingY4 = 505;
		
		hookX = Panel.WIN_W/2 - 80;
		hookY = Panel.WIN_H - 340;
	
	}
	
	
	public void drawStockings(Graphics2D g2){
	
		drawHooks(g2);
		
		drawStocking1(g2);
		drawStocking2(g2);
		drawStocking3(g2);
		drawStocking4(g2);
		
		
		hangStocking1(g2);
		hangStocking2(g2);
		hangStocking3(g2);
		hangStocking4(g2);
	}
	

	private void drawStocking1(Graphics2D g2) {
		// TODO Auto-generated method stub

		stockingTop = new Rectangle2D.Double(stockingX1, stockingY1, 30, 10);
		stockingBody = new Rectangle2D.Double(stockingX1 + 9, stockingY1 + 10, stockingW, stockingH);
		stockingBottom = new Arc2D.Double(stockingX1 - 10, stockingY1 + 30, 40, 15, 90, 180, Arc2D.CHORD);
		
		
		g2.setColor(Color.white);
		g2.fill(stockingTop);	
		
		g2.setColor(new Color(203, 51, 38));
		g2.fill(stockingBody);
		g2.fill(stockingBottom);

	}
	
	
	private void drawStocking2(Graphics2D g2){
		
		stockingTop2 = new Rectangle2D.Double(stockingX2, stockingY2, 30, 10);
		stockingBody2 = new Rectangle2D.Double(stockingX2 + 9, stockingY2 + 10, stockingW, stockingH);
		stockingBottom2 = new Arc2D.Double(stockingX2 - 10, stockingY2 + 30, 40, 15, 90, 180, Arc2D.CHORD);
		
		
		g2.setColor(Color.white);
		g2.fill(stockingTop2);	
		
		g2.setColor(new Color(203, 51, 38));
		g2.fill(stockingBody2);
		g2.fill(stockingBottom2);
	}
	
	
	private void drawStocking3(Graphics2D g2){
		
		stockingTop3 = new Rectangle2D.Double(stockingX3, stockingY3, 30, 10);
		stockingBody3 = new Rectangle2D.Double(stockingX3 + 9, stockingY3 + 10, stockingW, stockingH);
		stockingBottom3 = new Arc2D.Double(stockingX3 - 10, stockingY3 + 30, 40, 15, 90, 180, Arc2D.CHORD);
		
		
		g2.setColor(Color.white);
		g2.fill(stockingTop3);	
		
		g2.setColor(new Color(203, 51, 38));
		g2.fill(stockingBody3);
		g2.fill(stockingBottom3);
	}
	
	
	
	private void drawStocking4(Graphics2D g2){
			
			stockingTop4 = new Rectangle2D.Double(stockingX4, stockingY4, 30, 10);
			stockingBody4 = new Rectangle2D.Double(stockingX4 + 9, stockingY4 + 10, stockingW, stockingH);
			stockingBottom4 = new Arc2D.Double(stockingX4 - 10, stockingY4 + 30, 40, 15, 90, 180, Arc2D.CHORD);
			
			
			g2.setColor(Color.white);
			g2.fill(stockingTop4);	
			
			g2.setColor(new Color(203, 51, 38));
			g2.fill(stockingBody4);
			g2.fill(stockingBottom4);
		}
		
	
	
	private void drawHooks(Graphics2D g2){
		
		hook1 = new Line2D.Double(hookX, hookY, hookX, hookY + 20);
		hook2 = new Line2D.Double(hookX + 50, hookY, hookX + 50, hookY + 20);
		hook3 = new Line2D.Double(hookX + 100, hookY, hookX + 100, hookY + 20);
		hook4 = new Line2D.Double(hookX + 150, hookY, hookX + 150, hookY + 20);
		 
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(2));
		g2.draw(hook1);
		g2.draw(hook2);
		g2.draw(hook3);
		g2.draw(hook4);
		
	}
	
	
	public void hangStocking1(Graphics2D g2){
		if ((Panel.pointInRect(hookX, hookY + 10, stockingX1 + 9, stockingY1, 15, 35)) && hook1None == true) {
			System.out.println("hang");
			stockingX1 = hookX - 10;
			stockingY1 = hookY;
			stocking1Hung = true;
			hook1None = false;
			
		}else if ((Panel.pointInRect(hookX + 50, hookY + 10, stockingX1 + 9, stockingY1, 15, 35)) && hook2None == true){
			System.out.println("hang");
			stockingX1 = hookX + 40;
			stockingY1 = hookY;
			stocking1Hung = true;
			hook2None = false;
		
		}else if ((Panel.pointInRect(hookX + 100, hookY + 10, stockingX1 + 9, stockingY1, 15, 35)) && hook3None == true){
			System.out.println("hang");
			stockingX1 = hookX + 90;
			stockingY1 = hookY;
			stocking1Hung = true;
			hook3None = false;
			
		}else if ((Panel.pointInRect(hookX + 150, hookY + 10, stockingX1 + 9, stockingY1, 15, 35)) && hook4None == true){
			System.out.println("hang");
			stockingX1 = hookX + 140;
			stockingY1 = hookY;
			stocking1Hung = true;
			hook4None = false;
		}
	}
	
	
		
	public void hangStocking2(Graphics2D g2){
		if ((Panel.pointInRect(hookX, hookY + 10, stockingX2 + 9, stockingY2, 15, 35)) && hook1None == true) {
			System.out.println("hang");
			stockingX2 = hookX - 10;
			stockingY2 = hookY;
			stocking2Hung = true;
			hook1None = false;
			
		}else if ((Panel.pointInRect(hookX + 50, hookY + 10, stockingX2 + 9, stockingY2, 15, 35)) && hook2None == true){
			System.out.println("hang");
			stockingX2 = hookX + 40;
			stockingY2 = hookY;
			stocking2Hung = true;
			hook2None = false;
		
		}else if ((Panel.pointInRect(hookX + 100, hookY + 10, stockingX2 + 9, stockingY2, 15, 35)) && hook3None == true){
			System.out.println("hang");
			stockingX2 = hookX + 90;
			stockingY2 = hookY;
			stocking2Hung = true;
			hook3None = false;
			
		}else if ((Panel.pointInRect(hookX + 150, hookY + 10, stockingX2 + 9, stockingY2, 15, 35)) && hook4None == true){
			System.out.println("hang");
			stockingX2 = hookX + 140;
			stockingY2 = hookY;
			stocking2Hung = true;
			hook4None = false;
		}	
	}
	

	
	
	public void hangStocking3(Graphics2D g2){
		if ((Panel.pointInRect(hookX, hookY + 10, stockingX3 + 9, stockingY3, 15, 35)) && hook1None == true) {
			System.out.println("hang");
			stockingX3 = hookX - 10;
			stockingY3 = hookY;
			stocking3Hung = true;
			hook1None = false;
			
		}else if ((Panel.pointInRect(hookX + 50, hookY + 10, stockingX3 + 9, stockingY3, 15, 35)) && hook2None == true){
			System.out.println("hang");
			stockingX3 = hookX + 40;
			stockingY3 = hookY;
			stocking3Hung = true;
			hook2None = false;
		
		}else if ((Panel.pointInRect(hookX + 100, hookY + 10, stockingX3 + 9, stockingY3, 15, 35)) && hook3None == true){
			System.out.println("hang");
			stockingX3 = hookX + 90;
			stockingY3 = hookY;
			stocking3Hung = true;
			hook3None = false;
			
		}else if ((Panel.pointInRect(hookX + 150, hookY + 10, stockingX3 + 9, stockingY3, 15, 35)) && hook4None == true){
			System.out.println("hang");
			stockingX3 = hookX + 140;
			stockingY3 = hookY;
			stocking3Hung = true;
			hook4None = false;
		}	
	}
	
	
	
	

	public void hangStocking4(Graphics2D g2){
		if ((Panel.pointInRect(hookX, hookY + 10, stockingX4 + 9, stockingY4, 15, 35)) && hook1None == true) {
			System.out.println("hang");
			stockingX4 = hookX - 10;
			stockingY4 = hookY;
			stocking4Hung = true;
			hook1None = false;
			
		}else if ((Panel.pointInRect(hookX + 50, hookY + 10, stockingX4 + 9, stockingY4, 15, 35)) && hook2None == true){
			System.out.println("hang");
			stockingX4 = hookX + 40;
			stockingY4 = hookY;
			stocking4Hung = true;
			hook2None = false;
		
		}else if ((Panel.pointInRect(hookX + 100, hookY + 10, stockingX4 + 9, stockingY4, 15, 35)) && hook3None == true){
			System.out.println("hang");
			stockingX4 = hookX + 90;
			stockingY4 = hookY;
			stocking4Hung = true;
			hook3None = false;
			
		}else if ((Panel.pointInRect(hookX + 150, hookY + 10, stockingX4 + 9, stockingY4, 15, 35)) && hook4None == true){
			System.out.println("hang");
			stockingX4 = hookX + 140;
			stockingY4 = hookY;
			stocking4Hung = true;
			hook4None = false;
		}	
	}
	
	
	

}
