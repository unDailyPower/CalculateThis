package calculator;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import java.util.Scanner;

import java.awt.FlowLayout;

public class Calculator {

	public static void main (String[] args) {
		int n1, n2;
		String operation;
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		n1 = scannerObject.nextInt();
		
		System.out.println("Enter Second Number");
		n2 = scannerObject.nextInt();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter +, -, /, or *");
		operation = op.next();
		
		/*trying to make a silly exception for dividing by zero
		 * but as it is, this will throw the exception if I use any operation, not just division.
		if (n2 == 0)
			throw new ArithmeticException("YOU DIVIDED BY ZERO, IMPLOSION OF THE EARTH IS IMMENIENT");
		*/
		switch (operation) {
		
		case "+":
			
			System.out.println((n1 + n2));
			break;
			
		case "-":
		
			System.out.println((n1 - n2));
			break;
			
		case "/":
			
			System.out.println((n1 / n2));
			break;
			
		case "*":
		
			System.out.println((n1 * n2));
			break;
			
		default:
			
			System.out.println(("Error"));
		}
		
		
	//Window frame and UI
	/*JFrame frame = new JFrame("CalculateThat!");
	frame.setSize(300,400);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(new JTextField("Enter Calculation Here"));
    
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("1");
    p1.add(b1);
    b1.addActionListener(null);
    */
    
    
    
	}
	
}
