package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {

	public static void main (String[] args){
		
		int n1, n2;
		String operation;
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter First Whole Number\n");
		n1 = scannerObject.nextInt();
		
		System.out.println("Enter Second Whole Number\n");
		n2 = scannerObject.nextInt();
		
		Scanner operator = new Scanner(System.in);
		System.out.println("Enter +, -, *, or /\n");
		operation = operator.next();
		
		switch (operation) {
		
		case "+":
			System.out.println((n1+n2));
			break;
			
		case "-":
			System.out.println((n1-n2));
			break;
			
		case "*":
			System.out.println((n1*n2));
			break;
			
		case "/":
			System.out.println((n1/n2));
			break;
			
		default:
			
			System.out.println(("Error"));
			
		
		}
		
		try{
            System.out.println("Type 'r' to restart\n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            if(input.equals("r"))
            	restart(args);
      
            else
                System.out.println("You killed the program.");
        }
        catch(Exception e)
            {e.printStackTrace();}
		
	}
	
	private static void restart(String[] strArr) {
                
		main(strArr);}
	
	}