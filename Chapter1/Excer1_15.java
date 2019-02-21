package creativityExcer1;
/*
 *  Write a pseudocode description of a method for finding the smallest and largest
numbers in an array of integers and compare that to a Java method that would do
the same thing
 */

public class Excer1_15 {
	public static int minVals(int array[]) {
		int tmp=0;
		tmp=array[0];
		for(int i=1;i<array.length;i++) {
			
			if(tmp>=array[i]) {
				tmp=array[i];
			}
		}
		return tmp;
	}
	
	public static int maxVals(int array[]) {
		int tmp=0;
		tmp=array[0];
		for(int i=1;i<array.length;i++) {
			
			if(tmp<=array[i]) {
				tmp=array[i];
			}
		}
		return tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array=new int[5];
		array[0]=23;
		array[1]=11;
		array[2]=22;
		array[3]=14;
		array[4]=9;
		
		int minVal=minVals(array);
		int maxVal=maxVals(array);
		System.out.println("the minimum in the array: "+minVal);
		System.out.println("the maximum in the array: "+maxVal);

	}

}
