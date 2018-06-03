package IntroToArrayLists;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	public static void main(String[] args) {
		GuestBook hi = new GuestBook();
		hi.makeGuestBooks();
	}
	void makeGuestBooks() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Add Name");
	button2.setText("View Names");
	frame.setVisible(true);
		}
public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == button1){
		JOptionPane.showMessageDialog(null, "Enter a name");
		}
		if(arg0.getSource() == button2){
		JOptionPane.showMessageDialog(null, "");
		
}
}

	
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

