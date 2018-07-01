package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double>hi = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
            Random r = new Random();
            Random a = new Random();
			int e = a.nextInt(100);
            double n = r.nextDouble()+ e;
            	hi.push(n);
		}
		String a = JOptionPane.showInputDialog("Enter a number between 0 - 100");
		String b = JOptionPane.showInputDialog("Enter a greater number between 0 - 100");
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 

		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		for(int i = 0; i < 100; i++){
		  Double g= hi.pop();
		  if (c<g && g<d) {
			  System.out.println(g);
		  }
		}
		
	

			
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
	}


