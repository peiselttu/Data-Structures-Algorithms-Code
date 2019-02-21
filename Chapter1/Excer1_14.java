package creativityExcer1;
/*
 * 1.14. Write a pseudocode description of a method that reverses an array of n integers,
so that the numbers are listed in the opposite order than they were before, and
compare this method to an equivalent Java method for doing the same thing.
 */

import java.util.*;

public class Excer1_14 {
	
	public static void arrayReverse(int []array) {
		int tmp=0;
		int n=array.length;
		for(int i=0;i<(n-1)/2;i++) {
			tmp=array[n-1-i];
			array[n-1-i]=array[i];
			array[i]=tmp;	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array=new int[5];
		System.out.println("The original array is:");
		for(int i=0;i<5;i++) {
			array[i]=i;
			System.out.println(array[i]);
		}
		
		long startTime=System.nanoTime();
		arrayReverse(array);
		long endTime=System.nanoTime();
		
		long exeTime=endTime-startTime;
		
		System.out.println("=================================");
		System.out.println("The reversed array is: ");
		for(int val:array) {
			System.out.println(val);
		}
		System.out.println("The execute time for the designed reverse algorithm is: "+exeTime+" ns");
		
		long startTime1=System.nanoTime();
		List<int[]> list=Arrays.asList(array);
		Collections.reverse(list);
		long endTime1=System.nanoTime();
		long exeTime1=endTime1-startTime1;
		
		System.out.println("The Java method to reverse the array");
		System.out.println("The execution time is: "+exeTime1);

		
		
	}

}
