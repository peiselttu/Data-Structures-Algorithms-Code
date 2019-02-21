import java.lang.*;

public class vowelsCalc{
	
	public static int sumVowels(String str){
		int sum=0;
		// a e i o u
		for(int i=0;i<str.length();i++){
			char tmp=Character.toLowerCase(str.charAt(i)); 
			if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'){
				sum++;
			}
		}
		return sum;
	}
	
	public static void main(String []args){
		String str="Hello";
		int sum=sumVowels(str);
		System.out.println("the vowels is the string "+str+" is:"+sum);
	}
}