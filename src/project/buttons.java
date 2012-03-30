package project;

import java.awt.*;
import javax.swing.*;

/**
 * this class i responsible for the button Panel on the mainFrame, 
 * creating the buttons and adding them
 * 
 * @author stk4, ivc
 *
 */
@SuppressWarnings("serial")
public class buttons extends JPanel{
	public vectorOfRects vor;
	public rectangles r;
	public frame f;
	public NewClass n;
	
	
	private JButton nc, remove;
	
	public buttons(){
	
		n = new NewClass();
		
		 
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Buttons.
		nc = new JButton("New Class");	
		gbc.gridx = 0;
		gbc.gridy = 0;
		nc.addActionListener(n);
		gbc.insets = new Insets(10,10,10,10);
		add(nc, gbc);
		JButton nua = new JButton("New Uses Arrow");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,10,10,10);
		add(nua,gbc);
		JButton nia = new JButton("New Inheritence Arrow");
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,10,10,10);
		add(nia,gbc);
		remove = new JButton("Remove");
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,10,10,10);
		add(remove, gbc);
		
	
	}
		

}

	

