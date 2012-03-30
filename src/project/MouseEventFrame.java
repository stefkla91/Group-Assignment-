package project;

import java.awt.BorderLayout;
/**
 * extends the frame class and adds the mouse liseners to it.
 * this class is called in the main class 
 * 
 * @author stk4
 *
 */

@SuppressWarnings("serial")
public class MouseEventFrame extends frame {
	MouseEventPanel mousePanel = new MouseEventPanel();
	mouseListener mouseListener;
	MyMousePositionListener positionListener;
	
	MouseEventFrame(){
		
		add(mousePanel, BorderLayout.CENTER);
		pack();
		
		positionListener = new MyMousePositionListener(mousePanel);
		mousePanel.addMouseMotionListener(positionListener);
		
		mouseListener = new mouseListener(mousePanel);
		mousePanel.addMouseListener(mouseListener);
	}
}
