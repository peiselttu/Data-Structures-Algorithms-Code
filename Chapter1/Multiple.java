public class Multiple{
	public static boolean isMultiple(int m,int n){
		if(m%n==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String []args){
		int m=5,n=2;
		System.out.println(""+m+"/"+n+"="+m/n);
		boolean flag=isMultiple(m,n);
		if(flag){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}