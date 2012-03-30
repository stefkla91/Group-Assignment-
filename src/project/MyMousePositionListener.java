package project;


import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * implements the mouseMotionListener and deels with the mouseDragged event 
 * 
 * @author stk4
 */


public class MyMousePositionListener implements MouseMotionListener {

	private MouseEventPanel mousePane;
	
	public MyMousePositionListener(MouseEventPanel mousePane){
		this.mousePane = mousePane;
	}
	

	public void mouseDragged(MouseEvent e) {
		try{
		rectangles rec = mousePane.findNearestCircle(e.getX(),e.getY());
		if (rec!= null){
			rec.update(e.getX(),e.getY());
		}
		mousePane.repaint();
		}catch(ArrayIndexOutOfBoundsException error){}
	}
	

	
	public void mouseMoved(MouseEvent e) {
		
		
	}

}
