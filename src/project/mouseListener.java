package project;

import java.awt.event.*;
import javax.swing.*;
/**
 * Listenes to the mouse and deels with mouse click's.
 * we decided to comment out the 'else' part of mouseClicked since we din't wanted the user 
 * to delete classes by rightClick
 * 
 * @author stk4, ivc
 *
 */
public class mouseListener implements MouseListener{
	
	public vectorOfRects vor;
	private MouseEventPanel mousePane;
	private NewClass newClass;

	
	public mouseListener(MouseEventPanel mp){
		mousePane = mp;
		
	}
	
	
	public void mouseClicked(MouseEvent e) {	
		if(SwingUtilities.isLeftMouseButton(e)) {
			newClass = new NewClass();
			newClass.actionPerformed(e);
			mousePane.addRectangle(e.getX(),e.getY());
			
		}
		else {
		//	mousePane.removeNaerestRect(e.getX(),e.getY());
		}
	}

	
	public void mouseEntered(MouseEvent arg0) {
		//does Nothing
	}


	public void mouseExited(MouseEvent arg0) {
		//does Nothing
	}

	
	public void mousePressed(MouseEvent arg0) {
		//does Nothing	
	}

	
	public void mouseReleased(MouseEvent arg0) {
		//does Nothing
	}
	
}
