package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * creating the MenuBar with the menuItems and actionListeners
 * 
 * @author stk4, ivc
 *
 */
public class menu {	
	private NewClass newClass;
	
	private JavaLibrariesListener javaLibrariListener;
	
	public menu(frame f){
		JMenuBar menubar = new JMenuBar();
		f.setJMenuBar(menubar);
		//setting the menus.
		JMenu file = new JMenu("Project");
		menubar.add(file);
		JMenu e = new JMenu("Edit");
		menubar.add(e);
		JMenu v = new JMenu("View");
		menubar.add(v);
		JMenu h = new JMenu("Help");
		menubar.add(h);
		
		//actionListener
		newClass = new NewClass();
		javaLibrariListener = new JavaLibrariesListener();
		
		//menu items.
		
		//Project menu
		JMenuItem np = new JMenuItem("New Project");
		file.add(np);
		JMenuItem op = new JMenuItem("Open Project");
		file.add(op);
		JMenuItem c = new JMenuItem("Close");
		file.add(c);
		JMenuItem s = new JMenuItem("Save");
		file.add(s);
		JMenuItem q = new JMenuItem("Quit");
		file.add(q);
		q.addActionListener(new quit());
		
		//Edit items.
		JMenuItem nc = new JMenuItem("New Class");
		e.add(nc);
		nc.addActionListener(newClass);
		JMenuItem np1 = new JMenuItem("New Package");
		e.add(np1);
		JMenuItem r = new JMenuItem("Remove");
		e.add(r);
		JMenuItem nua = new JMenuItem("New Uses Arrow");
		e.add(nua);
		JMenuItem nia = new JMenuItem("New Inheritance arrow");
		e.add(nia);
		
		//view items
		JMenuItem su= new JMenuItem("Show Uses");
		v.add(su);
		JMenuItem si= new JMenuItem("Show Inheritance");
		v.add(si);		
		JMenuItem scp = new JMenuItem("Show Code Pad");
		v.add(scp);
		
		//help Items
		JMenuItem api = new JMenuItem("Java API");
		h.add(api);
		api.addActionListener(javaLibrariListener);
	}	
		class quit implements ActionListener{

			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
		
		}
}
