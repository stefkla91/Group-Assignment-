package project;

import java.awt.*;
import javax.swing.*;
/**
 * creating the frame Main frame
 * @author stk4, ivc
 *
 */

@SuppressWarnings("serial")
public class frame extends JFrame{
	
	
	
	public static int width = 800;
	public static int height = 600;
	
	public buttons b;
	public menu m;
	public rectangles r;
	public frame(){
		m = new menu(this);
		b = new buttons();
		
		
		setSize(width, height);
		setTitle("Blue-j-ish");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(b, BorderLayout.NORTH);
		
		
	
	}	
	
	public void showIt(){
		this.setVisible(true);
	}

}
