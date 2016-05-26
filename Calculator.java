package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.*;
import java.text.DecimalFormat;

public class Calculator {

	public static void main (String[] args){
		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        
      	double n1, n2;
      	
		String operation;
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter First Number\n");
		n1 = scannerObject.nextDouble();
		        						
		System.out.println("Enter Second Number\n");
		n2 = scannerObject.nextDouble();
		
		Scanner operator = new Scanner(System.in);
		System.out.println("Enter +, -, *, or /\n");
		operation = operator.next();
		
		switch (operation) {
		
		case "+":
			System.out.println(format.format(n1+n2));
			break;
			
		case "-":
			System.out.println(format.format(n1-n2));
			break;
			
		case "*":
			System.out.println(format.format(n1*n2));
			break;
			
		case "/":
			System.out.println(format.format(n1/n2));
			break;
			
		default:
			
			System.out.println(("Error"));
			
		
		}
		
		try{
            System.out.println("Type 'r' to restart\n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String reset = br.readLine();
            if(reset.equals("r"))
            	restart(args);
      
            else
                System.out.println("You did not type 'r', restarting anyway.");
            		restart(args);
        }
        catch(Exception e)
            {e.printStackTrace();}
		
	}
	
	private static void restart(String[] strArr) {
                
		main(strArr);}
	
	}
