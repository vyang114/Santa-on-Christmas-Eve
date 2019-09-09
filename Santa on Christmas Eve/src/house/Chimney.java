package house;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import main.Panel;
import others.Text;

public class Chimney {
	
	private Text txt;
	public int pupilX, pupilY;
	
	
	private Rectangle2D.Double lightSwitch;
	private Rectangle2D.Double switchOn;

	
	public Chimney(){
		
		txt = new Text();
		
		pupilX = Panel.WIN_W/2;
		pupilY = Panel.WIN_H/2;
		
		lightSwitch = new Rectangle2D.Double();
		switchOn = new Rectangle2D.Double();
		
	}

	
	public void drawMe (Graphics2D g2){
		
		Rectangle2D.Double chimney;
		chimney = new Rectangle2D.Double(Panel.WIN_X, Panel.WIN_Y, Panel.WIN_W, Panel.WIN_H);
		

		g2.setColor(Color.black);
		g2.fill(chimney);
		
		drawEyes(g2);

		
		drawLightSwitch(g2);
		
		txt.treelightText(g2);

	}

	
	
	public void drawEyes(Graphics2D g2){
		
		Ellipse2D.Double rightEye, leftEye, rightPupil, leftPupil;
		rightEye = new Ellipse2D.Double(Panel.WIN_W/2 - 30, Panel.WIN_H/2, 30, 50);
		leftEye = new Ellipse2D.Double(Panel.WIN_W/2 + 15, Panel.WIN_H/2, 30, 50);
		rightPupil = new Ellipse2D.Double(pupilX - 20, pupilY + 25, 20, 20);
		leftPupil = new Ellipse2D.Double(pupilX + 25, pupilY + 25, 20, 20);
		
		g2.setColor(Color.white);
		g2.fill(rightEye);
		g2.fill(leftEye);
		
		g2.setColor(Color.black);
		g2.fill(rightPupil);
		g2.fill(leftPupil);
	}
	
	
	public void drawLightSwitch(Graphics2D g2){

		lightSwitch.setFrame(Panel.lightX, Panel.lightY, 10, 20);
		
		g2.setColor(Color.white);
		g2.fill(lightSwitch);
	}
	
	
	public void drawSwitchOn(Graphics2D g2){
		
		switchOn.setFrame(Panel.WIN_X + 810, Panel.WIN_Y + 520, 10, 10);
		
		g2.setColor(Color.red);
		g2.fill(switchOn);
	}
	
	
	
	public void tobecon(Graphics2D g2){
		Rectangle2D.Double a;
		a = new Rectangle2D.Double(Panel.WIN_X, Panel.WIN_Y, Panel.WIN_W, Panel.WIN_H);
		
		g2.setColor(Color.black);
		g2.fill(a);
		txt.tbc(g2);
	}
	
	
	
	
	
	

}
