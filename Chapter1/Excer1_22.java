package creativityExcer1;

/*
 * Write a short Java program that outputs all possible strings formed by using the
characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once
 */

public class Excer1_22 {
	static void printKLength(char[] array,int k) {
		int n=array.length;
		printKLengthRec(array,"",n,k);
	}
	static void printKLengthRec(char[] array,String prefix,int n,int k) {
		if(k==0) {
			System.out.println(prefix);
			return;
		}
		for(int i=0;i<n;++i) {
			String newPrefix=prefix+array[i];
			printKLengthRec(array,newPrefix,n,k-1);
		}

	}
	public static void main(String []args) {
		char []array= {'c','a','t','d','o','g'};
		int k=6;
		printKLength(array,k);
		
	}
}
