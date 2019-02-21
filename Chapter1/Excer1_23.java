package creativityExcer1;

import java.lang.*;
import java.util.ArrayList;

public class Excer1_23 {
	public static void main(String []args) {
		int result=0;
		int []a= {1,3,5};
		int []b= {2,4,6};
		
		ArrayList<Integer>arrayList=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			result=a[i]*b[i];
			arrayList.add(result);
		}
		System.out.println(""+arrayList);
	}
}
