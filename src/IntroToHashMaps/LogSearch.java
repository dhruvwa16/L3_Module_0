package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	static HashMap<Integer, String> hi;
	public static void main(String[] args) {
		hi = new HashMap<Integer, String>();
		LogSearch hi = new LogSearch();
		hi.makeLogSearch();
	}

	private void makeLogSearch() {
		// TODO Auto-generated method stub
		 frame = new JFrame();
		 panel = new JPanel();
		 button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
		String a = JOptionPane.showInputDialog("Enter an ID number");
		int b = Integer.parseInt(a);
		String c = JOptionPane.showInputDialog("Enter a name");
		hi.put(b,c);
		
	}
		if(e.getSource() == button2){
			String d =JOptionPane.showInputDialog("Enter an ID number");
			int f = Integer.parseInt(d);
			for(Integer i : hi.keySet()){
				if(f == i) {
					JOptionPane.showMessageDialog(null, hi.get(f));
				 }
				else {
					JOptionPane.showMessageDialog(null, f + "is not in the list");
					
				}
		}
	}
		if(e.getSource() == button3) {
			String msg = "";
			for(Integer i : hi.keySet()){
				msg = msg + " ID "+ i+ " name " + hi.get(i);
			}
			JOptionPane.showMessageDialog(null, msg);
	}
		if(e.getSource()== button4) {
			String g =JOptionPane.showInputDialog("Enter an ID number");
			int h = Integer.parseInt(g);
			for(Integer i : hi.keySet()){
				if(h == i) {
					 hi.remove(h);
				 }
	
}
		}
	}
}
	

	/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
