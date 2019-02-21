import java.util.Scanner;
public class excer1_1{
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter an Integer:");
		int intVal=scanner.nextInt();
		System.out.println("The Integer is:"+intVal);
		
		System.out.println("Please Enter a float:");
		float floatVal=scanner.nextFloat();
		System.out.println("The Float is:"+floatVal);
		
		System.out.println("Please Enter a double:");
		double doubleVal=scanner.nextDouble();
		System.out.println("The Double is:"+doubleVal);
		
		System.out.println("Please Enter a short (-32768-32767):");
		short shortVal=scanner.nextShort();
		System.out.println("The Short is:"+shortVal);
		
		System.out.println("Please Enter a long:");
		long longVal=scanner.nextLong();
		System.out.println("The long is:"+longVal);
				
		System.out.println("Please Enter an Byte val(-128-127):");
		byte byteVal=scanner.nextByte();
		System.out.println("The Byte is:"+byteVal);
		
		System.out.println("Please Enter an Boolean:");
		boolean booleanVal=scanner.nextBoolean();
		System.out.println("The boolean value is:"+booleanVal);
		
		System.out.println("Please Enter an char:");
		char charVal=scanner.next().charAt(0);
		System.out.println("The char value is:"+charVal);
		
		
		
	}
}