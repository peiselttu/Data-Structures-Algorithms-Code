package creativityExcer1;

/*
 * Write a Java program that can simulate a simple calculator, using the Java console
as the exclusive input and output device. That is, each input to the calculator, be
it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a
separate line. After each such input, you should output to the Java console what
would be displayed on your calculator.
 */

import java.util.*;
public class Excer1_27{
	
	static double operation(double val1,String operator,double val2) {
		double result=0.0;
		switch (operator){
		case "+":
			result=val1+val2;
			break;
		case "-":
			result=val1-val2;
			break;
		case "*":
			result=val1*val2;
			break;
		case "/":
			result=val1/val2;
			break;
		default: break;	
		}	
		return result;
	}
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		double val1=scanner.nextFloat();
		String operator=scanner.next();
		double val2=scanner.nextFloat();
		
		
		double result=operation(val1,operator,val2);
		System.out.println("the result is:"+result);
		scanner.close();
	}
}
 	