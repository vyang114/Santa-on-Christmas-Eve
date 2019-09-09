package house;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import main.Panel;
import others.Util;

public class LightDecorator {
	
	private ArrayList<TreeLights> lights = new ArrayList<TreeLights>();
	private int lightNum = 13;
	
	public LightDecorator(){
		
		
		for (int i = 0; i < 5; i++){
			double lightbulbX = Util.random(Panel.WIN_X + 740, Panel.WIN_X + 870);
			double lightbulbY = Util.random(Panel.WIN_Y + 380, Panel.WIN_Y + 460);
			
			lights.add(new TreeLights (lightbulbX, lightbulbY, new Color(255, (int) Util.random(0, 255), (int) Util.random(0, 255))));
		}
		
		for (int i = 5; i < 9; i++){
			double lightbulbX = Util.random(Panel.WIN_X + 780, Panel.WIN_X + 830);
			double lightbulbY = Util.random(Panel.WIN_Y + 300, Panel.WIN_Y + 360);
			
			lights.add(new TreeLights (lightbulbX, lightbulbY, new Color((int) Util.random(0, 255), 255, (int) Util.random(0, 255))));
		}
		
		for (int i = 9; i < lightNum; i++){
			double lightbulbX = Util.random(Panel.WIN_X + 800, Panel.WIN_X + 820);
			double lightbulbY = Util.random(Panel.WIN_Y + 260, Panel.WIN_Y + 300);
			
			lights.add(new TreeLights (lightbulbX, lightbulbY, new Color((int) Util.random(0, 255), (int) Util.random(0, 255), 255)));
		}
	
		
		
	}
	
	
	
	public void turnOn(Graphics2D g2){
		
		if (Panel.state == Panel.TREE_LIGHT){ 
		
			for (int i = 0; i < lights.size(); i++){
				
				if (Panel.lightsOff == false){
					lights.get(i).drawBeam(g2);
					lights.get(i).display(g2);
	
				}
				
			}
		}
		
		
	}

}
