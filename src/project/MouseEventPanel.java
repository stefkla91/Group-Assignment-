package project;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * class responsible for deling with input from he mouseListeners
 * it redirects input to the vectorOfRects class
 * 
 * @author stk4
 *
 */

@SuppressWarnings("serial")
public class MouseEventPanel extends JPanel {

	private vectorOfRects vor = new vectorOfRects();
	
	public MouseEventPanel() {
		vor = new vectorOfRects();
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(300,300));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		vor.drawAll(g);
	}

	public void addRectangle(int x, int y) {
		vor.addingRects(new rectangles(x, y));
		repaint();
	}
	
	public void removeNaerestRect(int x, int y){
		vor.removeNaerestRect(x,y);
		repaint();
	}

	public rectangles findNearestCircle(int x, int y) {
		return vor.findNearestRect(x, y);
	}

}
