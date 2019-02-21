package creativityExcer1;

import java.util.Random;

public class Excer1_21 {
	public static int[] randomizedArray(int []array) {
		Random rgen=new Random();
		for(int i=0;i<array.length;i++) {
			 int rndIdx=rgen.nextInt(array.length);
			 int tmp=array[rndIdx];
			 array[rndIdx]=array[i];
			 array[i]=tmp;			 					 
		}
		
		return array;
	}
	public static void main(String []args) {
		int []array= {1,2,3,4,5};
		int []rslArray=randomizedArray(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(rslArray[i]);
		}
	}

}
