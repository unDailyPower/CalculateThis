package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.*;
import java.text.DecimalFormat;

public class Calculator {
	static Scanner scannerObject = new Scanner(System.in);

	public static double getNumber(String prompt){
		double result;
		
		try{
			System.out.println(prompt);
			result = scannerObject.nextDouble();
			}
			catch (InputMismatchException nfe) {
				String badInput = scannerObject.next();
				System.out.println(badInput + " is not a number.");
				result = getNumber(prompt);
			}
		
		return result;
	}
	public static void main (String[] args){
		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        
     	double n1 = getNumber("Enter First Number\n");
      	
      	double n2 = getNumber("Enter Second Number\n");
      	
		String operation = null;
				
		System.out.println("Enter +, -, *, or /\n");
		operation = scannerObject.next();
		
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
