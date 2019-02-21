package creativityExcer1;

import java.util.*;

public class Excer1_26 {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> lines=new ArrayList<>();
		
		while(scanner.hasNextLine()) {		
			String str=scanner.nextLine();
			if(str.equals("Exit")) {
				break;
			}
			lines.add(str);
		}
		System.out.println("======================================");
		System.out.println("The reverse of the input lines");
		for(int i=lines.size()-1;i>=0;i--) {
			System.out.println(lines.get(i));			
		}	
		
		//System.out.println(lines.size());
	}
}
