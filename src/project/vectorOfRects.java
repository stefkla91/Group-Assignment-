package project;

import java.awt.*;
import java.util.*;

/**
 * deels with information from the MouseEventPanel and draws the rectangles on the screen,
 * also finds the nearest rectangle to the mouse(used for mouseDragged) and deels with deleting rectangles
 * which we at the end din't implement
 * 
 * @author stk4, ivc
 *
 */

public class vectorOfRects {
	
	public Vector<rectangles> rects;
	public vectorOfRects(){
		rects = new Vector<rectangles>();
	}
	
	/**
	 * adding a new rectangle to the screen
	 * @param r
	 */
	public void addingRects(rectangles r){
		rects.add(r);
	}
	
	/**
	 * finding the nearest rectangle to the mouse
	 * @param x
	 * @param y
	 * @return
	 */
	public rectangles findNearestRect(int x, int y) {
		rectangles r;
		double minDist = Double.MAX_VALUE;
		int minDistIndex = -1;

		for(int i=0; i < rects.size(); i++) {
			r = (rectangles)(rects.get(i));
			if(r.distanceTo(x,y) < minDist) {
				minDist = r.distanceTo(x,y);
				minDistIndex = i;
			}
		}

		return rects.get(minDistIndex);
	}
	/**
	 * draw's a rectangle on the screen 
	 * @param g
	 */
	public void drawAll(Graphics g){
		rectangles currentRect;
	
			for(int i=0; i< rects.size(); i++){
				currentRect = (rectangles)(rects.get(i));
				currentRect.draw(g);
		}
	}
	/**
	 * removes the naerest rectangle to the mouse
	 * @param x
	 * @param y
	 */
	public void removeNaerestRect(int x, int y){
		rectangles r;
		double minDist = Double.MAX_VALUE;
		int minDistIndex = -1;
		
		for(int i=0; i<rects.size(); i++){
			r = (rectangles)(rects.get(i));
			if(r.distanceTo(x, y) < minDist){
				minDist = r.distanceTo(x, y);
				minDistIndex = i;
			}
		}
		if((minDistIndex >=0)&&(minDist < 30)){
			rects.remove(minDistIndex);
		}
	}
}
