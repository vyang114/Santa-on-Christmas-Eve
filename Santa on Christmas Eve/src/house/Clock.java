package house;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import main.Panel;

public class Clock extends Decoration {
	
	public int clockX, clockY;
	
	
	public Clock(){
		
		clockX = Panel.WIN_W/2 - 65;
		clockY= Panel.WIN_H/2 - 170;
		
	}

	
	@Override
	public void display(Graphics2D g2) {
		// TODO Auto-generated method stub
		
		addClock(g2);
	}
	
	
	private void addClock(Graphics2D g2){
		Ellipse2D.Double clock, clockInner, clockMiddle;
		Line2D.Double min, hour;
		
		clock = new Ellipse2D.Double(clockX, clockY, 130, 130);
		clockInner = new Ellipse2D.Double(clockX + 25, clockY + 25, 80, 80);
		clockMiddle = new Ellipse2D.Double(clockX + 60, clockY + 60, 10, 10);
		
		min = new Line2D.Double(clockX + 65, clockY + 65, clockX + 65, clockY + 35);
		hour = new Line2D.Double(clockX + 65, clockY + 65, clockX + 85, clockY + 75);
		
		
		g2.setColor(Color.black);
		g2.fill(clock);
		
		g2.setColor(Color.white);
		g2.fill(clockInner);
		
		g2.setColor(Color.black);
		g2.fill(clockMiddle);
		g2.draw(min);
		g2.draw(hour);
	}

}
