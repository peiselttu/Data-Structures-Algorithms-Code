package creativityExcer1;

public class Excer1_17 {
	
	public static boolean hasEven(int []array) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			if(array[i]%2==0) {
				return true;
			}		
		}
		return false;
	}
	public static void main(String[] args) {
		int []array= {1,3,4,7};
		boolean flag=hasEven(array);
		if(!flag) 
			System.out.println("There is no even number in the array.");
		else
			System.out.println("There is a one pair of number in the array is even");
		}
		
	}


