package creativityExcer1;

public class Excer1_20 {
	public static boolean distinctArray(float []array) {
		for(int i=1;i<array.length;i++) {
			if(array[0]==array[i])
				return false;
		}
		return true;
	}
	public static void main(String []args) {
		float []array= {2.1f,2.2f,2.5f,2.3f,3.4f};
		boolean flag=distinctArray(array);
		if(flag) {
			System.out.println("The elements in the array are distinct.");
		}
		else
			System.out.println("The elements in the array are not distinct.");
		
	}

}
