package project;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * button Listener that listens to the Java API button in the 'Help' Menu.
 * when clicked it opens the systems standart web browser and leeds 
 * to the newest version of the Java API
 * 
 * @author stk4
 *
 */
public class JavaLibrariesListener implements ActionListener {
			
         public void actionPerformed(ActionEvent e){
        	 
			try {
			URI uri = new URI("http://docs.oracle.com/javase/7/docs/api/");
			
                 if (Desktop.isDesktopSupported()) {
                         Desktop desktop = Desktop.getDesktop();
                         try {
                                 desktop.browse(uri);
                         } catch (Exception ex) {
                        	 ex.printStackTrace();
                         }
                 } else {
                 }
         
         } catch (URISyntaxException e1) {
        	 e1.printStackTrace();
         }

}
}

