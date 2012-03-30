package project;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
/**
 * rectangle class which holds the basics information that every drawn rectangle has.
 * is called through vector of Rectangles
 * 
 * @author stk4, ivc
 *
 */
@SuppressWarnings("serial")
public class rectangles extends JPanel{
	public int x;
	public int y;
	
	public int sizex = 200;
	public int sizey = 200;
	

	
	public Vector<rectangles> rects;

	
	public rectangles(int x, int y){
		this.x = x;
		this.y = y;
		
	}	
	public void draw(Graphics g){
		g.setColor(new Color(211, 211, 211));//set's the colour for the background
		g.fill3DRect(x-sizex+sizex/2, y-sizey+sizey/2, 200, 200, true);
		g.setColor(new Color(0, 0, 0));//set's the colour for the text
		
		//prins out an "demo" layout with text since we din't managed to put the actuall data there
		g.drawLine(x+100, y -70, x-100, y-70);	
		g.drawString("New Class", x - 30 - sizex/3, y-80);
		g.drawString("text1", x - 30 - sizex/3, y-40);
		g.drawString("text2", x - 30 - sizex/3, y-20);
		g.drawString("text3", x - 30 - sizex/3, y);
	}

	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(Color.PINK);
		g.fillRect((int)x, (int)y, 170, 300);
	}
	
	
	
	public void update(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(double x, double y) {
		return (Math.abs(this.x-x) + Math.abs(this.y-y));
	}
	

	
}
