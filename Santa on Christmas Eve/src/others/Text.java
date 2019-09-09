package others;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import main.Panel;

public class Text {
	
	private Font instructionFont;
	private Font toBeCon;
	
	public Text() {
		instructionFont = new Font("Trechubet MS", Font.ITALIC, 13);
		toBeCon = new Font("Trechubet MS", Font.ITALIC|Font.CENTER_BASELINE, 30);
	}
	
	
	public void writeIntro(Graphics2D g2){
//		g2.setColor(new Color(199, 213, 214));
		g2.setColor(Color.WHITE);
		g2.setFont(instructionFont.deriveFont(Font.PLAIN|Font.ITALIC, 15));
		g2.drawString("It's finally that time of the year!", 130, 300);
		g2.drawString("Santa has arrived the Far Far Away city in his led on Christmas Eve to deliver his presents.", 130, 320);
		g2.drawString("However, he cannot do it without your help.", 130, 340);
		g2.drawString("Help him deliver the presents before the night goes bright by following the instructions shown.", 130, 360);
		
	}
	
	
	public void writeEnd(Graphics2D g2){
		g2.setColor(Color.WHITE);
		g2.setFont(instructionFont.deriveFont(Font.PLAIN|Font.ITALIC, 15));
		g2.drawString("Thank you so much Santa for the presents!", 450, 280);
		g2.drawString("I will see you again next year!", 450, 300);
		
	}
	
	
	public void streetText(Graphics2D g2){
		g2.setColor(new Color (4, 59, 100));
		g2.setFont(instructionFont);
		g2.drawString("Wait till the night goes dark ...", Panel.WIN_X + 60, Panel.WIN_H - 60);
	}
	
	
	public void selectHouseText(Graphics2D g2){
		g2.setColor(new Color (4, 59, 100));
		g2.setFont(instructionFont);
		g2.drawString("Now the night has gone dark, select a house that you'd like to deliver the presents to.", Panel.WIN_X + 60, Panel.WIN_H - 60);
	}
	
	
	public void treelightText(Graphics2D g2){
		g2.setColor(new Color (243, 219, 206));
		g2.setFont(instructionFont);
		g2.drawString("The room is too dark... maybe try to turn on the Christmas lights", Panel.WIN_X + 60, Panel.WIN_H - 60);
	}
	
	
	public void inRoomText(Graphics2D g2){
		g2.setColor(new Color (243, 219, 206));
		g2.setFont(instructionFont);
		g2.drawString("Wow such a mess here! Help the family rehang all 4 stockings up the fireplace,", Panel.WIN_X + 60, Panel.WIN_H - 70);
		g2.drawString("so that they can get their presents the next day", Panel.WIN_X + 60, Panel.WIN_H - 50);
		g2.drawString("(Hint: they may be hiding somewhere!)", Panel.WIN_X + 60, Panel.WIN_H - 20);
	}
	
																										
	public void tbc(Graphics2D g2){
		g2.setColor(Color.white);
		g2.setFont(toBeCon);
		g2.drawString("TO BE CONTINUED", Panel.WIN_W/2 - 20, Panel.WIN_H/2);
	}

}
