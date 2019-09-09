package house;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import main.Panel;
import others.Util;
import street.Snow;


public class ChristmasTree extends RoomDecorator {

	private Rectangle2D.Double treeBottom;
	
	
	public ChristmasTree(Room baseRoom) {
		super(baseRoom);

		treeBottom = new Rectangle2D.Double(Panel.WIN_X + 785, Panel.WIN_Y + 480, 40, 70);
		
	}
	
	
	public void showRoom(Graphics2D g2){
		super.showRoom(g2);
		addTree(g2);
		
	}
	
	

	private void addTree(Graphics2D g2) {
		// TODO Auto-generated method stub
		
		g2.setColor(new Color(63, 108, 98));
		g2.fillPolygon(new int[] {Panel.WIN_X + 700, Panel.WIN_X + 805, Panel.WIN_X + 910},
				new int[] {Panel.WIN_Y + 480, Panel.WIN_Y + 180, Panel.WIN_Y + 480}, 3);
		
		g2.setColor(new Color(136, 90, 66));
		g2.fill(treeBottom);
	}
	
	
}
