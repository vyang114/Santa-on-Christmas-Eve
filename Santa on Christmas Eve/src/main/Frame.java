// Coded by Vera Yang

package main;

import processing.core.PApplet;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame{
	
	public Frame(String title) {
		super(title);
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel(this);
		this.add(panel);
		this.pack();
		this.setVisible(true);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Frame app = new Frame("Santa on Christmas Eve"); 
			}
		}
		);
	}

}
