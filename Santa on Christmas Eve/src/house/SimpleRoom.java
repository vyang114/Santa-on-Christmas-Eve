
package house;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import main.Panel;

public class SimpleRoom implements Room{
	
	public SimpleRoom(){
		
	}
	

	@Override
	public void showRoom(Graphics2D g2) {
		// TODO Auto-generated method stub
		roomBg(g2);
		fireplace(g2);
	}
	
	
public void roomBg(Graphics2D g2){
		
		Rectangle2D.Double wall, floor, roomWindow1, roomWindow2;
		Line2D.Double topFrame1, middleFrame1, bottomFrame1, leftFrame1, middleFrame12, rightFrame1;
		Line2D.Double topFrame2, middleFrame2, bottomFrame2, leftFrame2, middleFrame22, rightFrame2;
		wall = new Rectangle2D.Double(0, 0, Panel.WIN_W, Panel.WIN_H);
		floor = new Rectangle2D.Double(0, Panel.WIN_H - 150, Panel.WIN_W, Panel.WIN_H);
		roomWindow1 = new Rectangle2D.Double(100, 100, 200, 230);
		roomWindow2 = new Rectangle2D.Double(Panel.WIN_W - 300, 100, 200, 230);
		
		topFrame1 = new Line2D.Double(100, 100, 300, 100);
		middleFrame1 = new Line2D.Double(100, 215, 300, 215);
		bottomFrame1 = new Line2D.Double(100, 330, 300, 330);
		leftFrame1 = new Line2D.Double(100, 100, 100, 330);
		middleFrame12 = new Line2D.Double(200, 100, 200, 330);
		rightFrame1 = new Line2D.Double(300, 100, 300, 330);
		
		topFrame2 = new Line2D.Double(Panel.WIN_W - 300, 100, Panel.WIN_W - 100, 100);
		middleFrame2 = new Line2D.Double(Panel.WIN_W - 300, 215, Panel.WIN_W - 100, 215);
		bottomFrame2 = new Line2D.Double(Panel.WIN_W - 300, 330, Panel.WIN_W - 100, 330);
		leftFrame2 = new Line2D.Double(Panel.WIN_W - 300, 100, Panel.WIN_W - 300, 330);
		middleFrame22 = new Line2D.Double(Panel.WIN_W - 200, 100, Panel.WIN_W - 200, 330);
		rightFrame2 = new Line2D.Double(Panel.WIN_W - 100, 100, Panel.WIN_W - 100, 330);
		
		
		g2.setColor(new Color(137, 65, 66));
		g2.fill(wall);
		
		g2.setColor(new Color(38, 52, 67));
		g2.fill(roomWindow1);
		g2.fill(roomWindow2);
		
		g2.setColor(new Color(218, 183, 174));
		g2.setStroke(new BasicStroke(8));
		g2.draw(topFrame1);
		g2.draw(middleFrame1);
		g2.draw(bottomFrame1);
		g2.draw(leftFrame1);
		g2.draw(middleFrame12);
		g2.draw(rightFrame1);
		
		g2.draw(topFrame2);
		g2.draw(middleFrame2);
		g2.draw(bottomFrame2);
		g2.draw(leftFrame2);
		g2.draw(middleFrame22);
		g2.draw(rightFrame2);
		
		
		g2.setColor(new Color(79, 59, 52));
		g2.fill(floor);
	
	}
	
	
	void fireplace(Graphics2D g2){ 
		
		Rectangle2D.Double back, top1, top2, top3, bottom, fireGlass, bottom2;
		back = new Rectangle2D.Double(Panel.WIN_W/2 - 85, 0, 170, Panel.WIN_H - 150);
		top1 = new Rectangle2D.Double(Panel.WIN_W/2 - 140, Panel.WIN_H - 370, 280, 15);
		top2 = new Rectangle2D.Double(Panel.WIN_W/2 - 130, Panel.WIN_H - 370 + 15, 260, 10);
		top3 = new Rectangle2D.Double(Panel.WIN_W/2 - 120, Panel.WIN_H - 370 + 25, 240, 5);
		bottom = new Rectangle2D.Double(Panel.WIN_W/2 - 120, Panel.WIN_H - 370 + 30, 240, 190);
		fireGlass = new Rectangle2D.Double(Panel.WIN_W/2 - 90, Panel.WIN_H - 310 + 30, 180, 130);
		bottom2 = new Rectangle2D.Double(Panel.WIN_W/2 - 135, Panel.WIN_H - 195 + 30, 270, 15);
		
		g2.setColor(new Color(103, 63, 53));
		g2.fill(back);
		g2.fill(bottom);
		
		g2.setColor(new Color(116, 72, 61));
		g2.fill(top1);
		g2.fill(top3);
		
		g2.setColor(new Color(96, 59, 47));
		g2.fill(top2);
		
		g2.setColor(new Color(89, 47, 33));
		g2.fill(fireGlass);
		
		g2.setColor(new Color(103, 63, 53));
		g2.fill(bottom2);
	
	}

	

}
