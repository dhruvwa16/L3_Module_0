package IntroToStacks;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	Font font;
	Stack<String> hi = new Stack<String>();
	public static void main(String[] args) {
		TextUndoRedo hi = new TextUndoRedo();
		hi.makeTextUndoRedo();
		
	}

	private void makeTextUndoRedo() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
	    frame.pack();
	}
	public void keyPressed(KeyEvent b) {
		// TODO Auto-generated method stub
		char character = b.getKeyChar(); 
		label.setText(label.getText()+character+"");
		frame.pack();
		if (b.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			hi.push(character+"");
			label.setText(label.getText());
		}
		}
		
		
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
