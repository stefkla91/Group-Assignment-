package project;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

/**
 * intialialy used in combination with the 'New Class' button on the main frame and the menu,
 * but due our last minute resedign just used when the mouse is clicked.
 * creates a new Frame with a tabbedPane, and has a number of innerClasses
 * 
 * @author stk4
 * 
 *
 */
 
@SuppressWarnings("serial")
public class NewClass extends JFrame implements ActionListener {
		
		private JFrame frame;
		private JTabbedPane tabbedPane;
		private JPanel nameTab, namePanel, instantTab, instantPanel, methodTab, methodPanel;
		private JLabel nameLabel;
		private GridLayout nameGrid, instantGrid, methodGrid;
		private JTextField nameInput, instantInput, methodInput, methodParameter;
		private JComboBox fieldModifier, fieldType, methodModifier, methodType;
		private JButton addName, addInstant, addMethod, doneButton;
		private JTextArea instantArea, methodArea;
		private InstantTabListener instantListener;
		private DoneButtonListener doneButtonListener;
		private MethodTabListener methodListener;
		private NameTabListener nameListener;
		ArrayList<String> instantArray, methodArray;
		ArrayList<String> nameArray;
		private ArrayList<ArrayList<String>> classArray; // at the end not used
		public frame mainFrame;
		public rectangles rec;
		
		boolean clicked;
		int x = 200;
		int y = 200;
		
		
		
		public void actionPerformed(MouseEvent e) {
			instantArray = new ArrayList<String>();
			methodArray = new ArrayList<String>();
			clicked = false;
			
		//	rec = new rectangles();
			//mainFrame = new frame();
			
			
			//create the Frame
			frame = new JFrame();
			doneButton = new JButton("Done");
			frame.setSize(500, 400);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setTitle("Create a new Class");
			tabbedPane = new JTabbedPane();
			frame.add(tabbedPane, BorderLayout.CENTER);
			frame.add(doneButton, BorderLayout.SOUTH);
			
			//actionLitener
			doneButtonListener = new DoneButtonListener();
			doneButton.addActionListener(doneButtonListener);
		//##########################################################################################	
			//creating the namePanel
			nameTab = new JPanel();
			namePanel = new JPanel();
			nameGrid = new GridLayout(0, 2);
			nameLabel = new JLabel("Name of Class: ");
			nameInput = new JTextField();	
			addName = new JButton("Add");
			
			//Instant Listener
			nameListener = new NameTabListener();
			addName.addActionListener(nameListener);
			
			//add Stuff ti panel
			namePanel.add(nameLabel);
			namePanel.add(nameInput);
			namePanel.setLayout(nameGrid);
			
			nameTab.add(namePanel, BorderLayout.NORTH);
			nameTab.add(addName, BorderLayout.CENTER);
	//#########################################################################################################		
			//creating the InstantPanel
			instantTab = new JPanel();
			instantPanel = new JPanel();
			instantGrid = new GridLayout(1, 4);
			instantInput = new JTextField();
			addInstant = new JButton("Add");
			instantArea = new JTextArea(10, 30);
					
			instantInput.setToolTipText("Name of Instant Variable");
			instantPanel.setLayout(instantGrid);
			instantArea.setEditable(false);
			
			//Array of Strings for JComboBox
			String[] modifiers = {"private", "public", "protected"};
			fieldModifier = new JComboBox(modifiers);
			
			String[] types = {"int", "String", "double", "boolean", "char", "byte","short","long","float"};
			fieldType = new JComboBox(types);
			
			//actionListener
			instantListener = new InstantTabListener();
			addInstant.addActionListener(instantListener);
			
			
			//add stuff to panel
			instantPanel.add(fieldModifier);
			instantPanel.add(fieldType);
			instantPanel.add(instantInput);
			instantPanel.add(addInstant);
			
			instantTab.add(instantPanel, BorderLayout.NORTH);		
			instantTab.add(instantArea, BorderLayout.CENTER);
			
			//#########################################################################################
			//creating the method tab 
			methodTab = new JPanel();
			methodPanel = new JPanel();
			methodGrid = new GridLayout(1, 5);
			methodInput = new JTextField();
			methodParameter = new JTextField();
			methodArea = new JTextArea(10, 30);
			addMethod = new JButton("Add");
			
			methodInput.setToolTipText("Method Name");
			methodParameter.setToolTipText("Method Parameter");
			methodPanel.setLayout(methodGrid);
			methodArea.setEditable(false);
			
			//Array of Strings for JComboBox
			String[] methodmodifier = {"private", "public", "none"};
			methodModifier = new JComboBox(methodmodifier);
			
			String[] methodtype = {"void", "String", "int"};
			methodType = new JComboBox(methodtype);
			
			//ActionListener
			methodListener = new MethodTabListener();
			addMethod.addActionListener(methodListener);
			
			//add stuff to panel
			methodPanel.add(methodModifier);
			methodPanel.add(methodType);
			methodPanel.add(methodInput);
			methodPanel.add(methodParameter);
			methodPanel.add(addMethod);
			
			methodTab.add(methodPanel, BorderLayout.NORTH);
			methodTab.add(methodArea, BorderLayout.CENTER);
			//#######################################################################
			
			//adding panel's to the tabbedPane
			
			tabbedPane.add("Name", nameTab);
			tabbedPane.add("Fields", instantTab);
			tabbedPane.add("Methods", methodTab);
			tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);		
		}
		
		public void hideIt(){
			frame.setVisible(false);
		}
		
		public void isClicked(){
			clicked = true;
		}
		
		class InstantTabListener implements ActionListener{
				String modifier = null;
				String type = null;
				String instantName = null;
				String array = null;
			public void actionPerformed(ActionEvent e) {
			
				if(fieldModifier.getSelectedIndex() == 0){
					 modifier = "-";
				}else if(fieldModifier.getSelectedIndex() == 1){
					 modifier = "+";
				}else if(fieldModifier.getSelectedIndex() == 2){
					 modifier = "#";
				}
				//////////////////////////
				if(fieldType.getSelectedIndex() == 0){
					type = "int";
				}else if(fieldType.getSelectedIndex() == 1){
					type = "String";
				}else if(fieldType.getSelectedIndex() == 2){
					type = "double";
				}else if(fieldType.getSelectedIndex() == 3){
					type = "boolean";
				}else if(fieldType.getSelectedIndex() == 4){
					type = "char";
				}else if(fieldType.getSelectedIndex() == 5){
					type = "byte";
				}else if(fieldType.getSelectedIndex() == 6){
					type = "short";
				}else if(fieldType.getSelectedIndex() == 7){
					type = "long";
				}else if(fieldType.getSelectedIndex() == 8){
					type = "float";
				}
				/////////////////////
			
				instantName = instantInput.getText();
				array = modifier+" "+type+" " +instantName;
				instantArray.add(array);
				instantArea.append(array+"\n ");
				instantInput.setText("");
			
			}
		}
		//#############################################################################################
		class MethodTabListener implements ActionListener{
				String array = null;
				String type = null;
				String modifier = null;
				String methodName = null;
				String parameter = null;
			public void actionPerformed(ActionEvent arg0) {
				if(methodModifier.getSelectedIndex() == 0){
					modifier = "private";
				}else if(methodModifier.getSelectedIndex() == 1){
					modifier = "public";
				}else if(methodModifier.getSelectedIndex() == 2){
					modifier = " ";
				}
				/////////////////////
				if(methodType.getSelectedIndex() == 0){
					type = "void";
				}
				else if(methodType.getSelectedIndex() == 1){
					type = "String";
				}
				else if(methodType.getSelectedIndex() == 2){
					type = "int";
				}
				///////////////
				
				methodName = methodInput.getText();
				parameter = methodParameter.getText();
				array = modifier+" "+type+" "+methodName+"( "+parameter+" )";
				methodArray.add(array);
				methodArea.append(array+"\n");
				methodInput.setText("");
				methodParameter.setText("");
				
			}
	
		
		
			
			
		}
		//#################################################################################################
		class NameTabListener implements ActionListener{
				String className = null;
			public void actionPerformed(ActionEvent arg0) {
				
				className = nameInput.getText();
				nameArray = new ArrayList<String>();
				nameArray.add(className);
				nameInput.setText("Name Set!");
			}
			
		}
		//#################################################################################################
		class DoneButtonListener  implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				System.out.println("Name is: "+nameArray );
				System.out.println("Instants are: "+instantArray);
				System.out.println("Methods are: "+methodArray);
				
				classArray = new ArrayList<ArrayList<String>>();
				classArray.add(nameArray);
				classArray.add(instantArray);
				classArray.add(methodArray);
				
				hideIt();
			
			}
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// does nothing
			
		}
		
		

}



	

