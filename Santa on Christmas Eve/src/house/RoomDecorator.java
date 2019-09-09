package house;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import main.Panel;

public class RoomDecorator implements Room{
	
	protected Room baseRoom;
	

	public RoomDecorator(Room baseRoom){
		this.baseRoom = baseRoom;
		
	}
	

	@Override
	public void showRoom(Graphics2D g2) {
		// TODO Auto-generated method stub
		baseRoom.showRoom(g2);
	}
	
}
