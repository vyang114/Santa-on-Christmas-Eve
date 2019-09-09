package main;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import ending.Ending;
import house.SimpleRoom;
import house.Chimney;
import house.ChristmasTree;
import house.Clock;
import house.LightDecorator;
import house.Room;
import house.Stockings;
import opening.Opening;
import opening.Santa;
import opening.Snowflake;
import sound.Sound;
import street.Buildings;
import street.StreetScene;

public class Panel extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	
	private JFrame frame;
	private JButton playButton;
	private JButton replayButton;
	private boolean replay = false;
	
	private Opening o;
	private StreetScene s;
	private Buildings b;
	private Chimney c;
	private Stockings st;
	private LightDecorator ld;
	private Clock cl;
	private Room room;
	private Snowflake sf;
	private Ending e;

	private Santa santa;
	
	public final static int WIN_X = 0;
	public final static int WIN_Y = 0;
	public final static int WIN_W = 1000;
	public final static int WIN_H = 700;
	
	public static int lightX = 810;
	public static int lightY = 520;
	public static boolean lightsOff = true;
	
	private Timer timer;
	
	
	private boolean stocking1Selected, stocking2Selected, stocking3Selected, stocking4Selected = false;
	private boolean clockSelected = false;
	
	public static int mouseX, mouseY;
	
	
	public static boolean mouseInHouse1, mouseInHouse2, mouseInHouse3, mouseInHouse4, mouseInHouse5 = false;
	
	
	private final static int START_SCREEN = -1;
	private final static int STREET = 0;
	public final static int DARK = 1;
	public final static int TREE_LIGHT = 2;
	public final static int END = 3;
	public static int state = START_SCREEN;
	
//	public final static int state = -2;
	
	
	public Panel(JFrame frame) {
		super();
		
		this.setBackground(Color.white);
		setPreferredSize(new Dimension(WIN_W, WIN_H));
		
		o = new Opening();
		s = new StreetScene();
		b = new Buildings();
		c = new Chimney();
		st = new Stockings();
		ld = new LightDecorator();
		cl = new Clock();
		sf = new Snowflake();
		e = new Ending();
		
		santa = new Santa();
				
		timer = new Timer(30, this);
		timer.start();
		
		addMouseMotionListener(this);
		addMouseListener(this);

		this.frame = frame;
		
		playButton = new JButton("Deliver");
		this.add(playButton, BorderLayout.NORTH);
		playButton.setVisible(false);
		playButton.addActionListener(this);
		
	
		replayButton = new JButton("Replay");
		this.add(replayButton, BorderLayout.NORTH);
		replayButton.setVisible(false);
		replayButton.addActionListener(this);
	}
	
	
	public static boolean pointInRect(int a, int b, int x, int y, int w, int h) {
		  if ((a >= x && a <= x + w) && (b >= y && b <= y + h)) {
		    return true;
		  } else {
		    return false;
		  }
		}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		
		if (state == START_SCREEN){
			o.openingScene(g2);
			sf.openingScene(g2);			
			playButton.setVisible(true);
			replayButton.setVisible(false);
			santa.openingScene(g2);
			Sound.play("assets/christmas.wav");	//plays background music
			timer.setDelay(100);
			replay = false;

		}

		
		if (state == STREET){
			s.drawStreetBackground(g2);
			hi(g2);
			playButton.setVisible(false);
			replayButton.setVisible(false);
			timer.setDelay(30);
		}
		
		if (state == DARK)
			c.drawMe(g2);
		
		if (state == TREE_LIGHT){
			room = new ChristmasTree(new SimpleRoom());
			st.drawStockings(g2);
			c.drawLightSwitch(g2);
			ld.turnOn(g2);	
		}
		
		
		if (room != null && state != START_SCREEN){
			room.showRoom(g2);
			c.drawLightSwitch(g2);
			c.drawSwitchOn(g2);
			st.drawStockings(g2);
			ld.turnOn(g2);
			cl.display(g2);

			room = new ChristmasTree(new SimpleRoom());
		}


		
		if (state == END){
			e.endingScene(g2);
			playButton.setVisible(false);
			replayButton.setVisible(true);

		}
		

		if (st.stocking1Hung == true && st.stocking2Hung == true && st.stocking3Hung == true && st.stocking4Hung == true){
			state = Panel.END;
		}
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		if (state == STREET) s.snowfall();
		
		
		if (e.getActionCommand() == "Deliver" && state == START_SCREEN) 
			state = STREET;	
		
		if (e.getActionCommand() == "Replay") {
			replay = true;
			state = START_SCREEN;	

		}
		
		repaint();
		
		if (replay){
			frame.dispose();
			frame = new Frame("Santa On Christmas Eve");
		}
			
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		int x = e.getX();
		int y = e.getY();
		
		if (s.nightCountdown == 0 && state == STREET){
		
			if (pointInRect(mouseX, mouseY, b.buildingX, b.buildingY, b.buildingW, b.buildingH)){
				System.out.println("FIRST");
				mouseInHouse1 = true;
				state = DARK;
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 130, b.buildingY - 80, b.buildingW - 30, b.buildingH + 80)){
				System.out.println("SECOND");
				mouseInHouse2 = true;	
				state = DARK;
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 230, b.buildingY + 30, b.buildingW - 50, b.buildingH - 50)){
				System.out.println("THIRD");
				mouseInHouse3 = true;	
				state = DARK;
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 300, b.buildingY - 30, b.buildingW + 30, b.buildingH + 20)){
				System.out.println("FOURTH");
				mouseInHouse4 = true;	
				state = DARK;
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 480, b.buildingY, b.buildingW - 10, b.buildingH + 20)){
				System.out.println("FIFTH");
				mouseInHouse5 = true;	
				state = DARK;
			}		
			
		}

		
		if (state == DARK){
			
			if (Panel.pointInRect(Panel.mouseX, Panel.mouseY, lightX, lightY, 10, 20)){
				lightsOff = false;
				state = TREE_LIGHT;
			}
		}
		
		
		if (state == TREE_LIGHT){

			if ((pointInRect(e.getX(), e.getY(), st.stockingX1 + 9, st.stockingY1, 15, 35)) && st.stocking1Hung == false) {
				stocking1Selected = true;
			}
			
			
			if ((pointInRect(e.getX(), e.getY(), st.stockingX2 + 9, st.stockingY2, 15, 35)) && st.stocking2Hung == false){
				stocking2Selected = true;
			}
			
			if ((pointInRect(e.getX(), e.getY(), st.stockingX3 + 9, st.stockingY3, 15, 35)) && st.stocking3Hung == false && clockSelected == false){
				stocking3Selected = true;
			}
			
			
			if ((pointInRect(e.getX(), e.getY(), st.stockingX4 + 9, st.stockingY4, 15, 35)) && st.stocking4Hung == false){
				stocking4Selected = true;
			}
		
			
			if (pointInRect(e.getX(), e.getY(), cl.clockX, cl.clockY, 130, 130)){
				clockSelected = true;
			}
			
		}
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if (st.stocking1Hung == false){
			stocking1Selected = false;
			st.stockingX1 = 820;
			st.stockingY1 = 420;
		}
		
		
		if (st.stocking2Hung == false){
			stocking2Selected = false;
			st.stockingX2 = 165;
			st.stockingY2 = 165;
		}
		
		
		if (st.stocking3Hung == false){
			stocking3Selected = false;
			st.stockingX3 = 465;
			st.stockingY3 = 200;
		}
		
		
		
		if (st.stocking4Hung == false){
			stocking4Selected = false;
			st.stockingX4 = 250;
			st.stockingY4 = 505;
		}
		
		
		clockSelected = false;
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mouseX = e.getX();
		mouseY = e.getY();

	}
	
	
	public void hi (Graphics2D g2){
		

		if (s.nightCountdown == 0){

			if (pointInRect(mouseX, mouseY, b.buildingX, b.buildingY, b.buildingW, b.buildingH)){
				System.out.println("FIRST");
				mouseInHouse1 = true;
			}
			
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 130, b.buildingY - 80, b.buildingW - 30, b.buildingH + 80)){
				System.out.println("SECOND");
				mouseInHouse2 = true;	
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 230, b.buildingY + 30, b.buildingW - 50, b.buildingH - 50)){
				System.out.println("THIRD");
				mouseInHouse3 = true;	
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 300, b.buildingY - 30, b.buildingW + 30, b.buildingH + 20)){
				System.out.println("FOURTH");
				mouseInHouse4 = true;	
			}
			
			if (pointInRect(mouseX, mouseY, b.buildingX + 480, b.buildingY, b.buildingW - 10, b.buildingH + 20)){
				System.out.println("FIFTH");
				mouseInHouse5 = true;	
			}
		}
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		
		
		if(stocking1Selected && st.stocking1Hung == false) {
			st.stockingX1 = mouseX;
			st.stockingY1 = mouseY;
		}
		
		if(stocking2Selected && st.stocking2Hung == false) {
			st.stockingX2 = mouseX;
			st.stockingY2 = mouseY;
		}
		
		
		if(stocking3Selected && st.stocking3Hung == false) {
			st.stockingX3 = mouseX;
			st.stockingY3 = mouseY;
		}
		
		
		if(stocking4Selected && st.stocking4Hung == false) {
			st.stockingX4 = mouseX;
			st.stockingY4 = mouseY;
		}
		
		
		if (clockSelected){
			cl.clockX = mouseX;
		}
	}
	
}
