import java.lang.*;
public class stringBuilder{
	public static StringBuilder removeChar(String str,char ch){
		StringBuilder sb=new StringBuilder(str);
		int index1=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==sb.charAt(i)){
				index1=i;
				break;
			}
		}
		sb.replace(index1,index1+1," ");
		return sb;
	}
	
	public static void main(String []args){
		String str="Let's try, make";
		System.out.println(removeChar(str,','));
		
		
	}
}