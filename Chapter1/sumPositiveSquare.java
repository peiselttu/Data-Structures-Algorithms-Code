import java.lang.*;
public class sumPositiveSquare{
	
	public static double sumSquareOdd(int n){
		double sum=0;
		if(n<0){
			sum=-1;
			System.out.println("The input number "+n+" is negative!");
		}
		else{
			for(int i=0;i<=n;i++){
				sum+=Math.sqrt(i);
			}
		}
		return sum;
	}
	public static void main(String []args){
		int n=4;
		double sum=sumSquareOdd(n);
		System.out.println("the sum of the square of the positive numbers less than n "+n+" is:"+sum);
	}
}