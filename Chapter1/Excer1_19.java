package creativityExcer1;

public class Excer1_19 {
	public static int numCount(int a) {
		int divNum=0;
		while(a>=1) {
			a=a/2;
			divNum++;
		}
		return divNum;
	}
	public static void main(String []args) {
		int a=5;
		int num=numCount(a);
		System.out.println("the number of division: "+num);
	}
}
