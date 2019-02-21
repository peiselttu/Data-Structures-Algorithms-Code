package creativityExcer1;

public class Excer1_18 {

	public static double pNorm(int []array,int p) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=Math.pow(array[i], p);
		}
		
		return Math.sqrt(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,3,5,7};
		double result=pNorm(array,3);
		System.out.println("The result is: "+result);
	}

}
