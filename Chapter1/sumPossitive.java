public class sumPossitive{
	public static int sumNumber(int n){
		int sum=0;
		if(n<=0){
			sum=-1;
			System.out.println("The number "+n+" is non positive");
		}
		else{
			for(int i=0;i<=n;i++){
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String []args){
		int n=10;
		int sum=sumNumber(n);
		if(sum>0){
			System.out.println("The total sum of numbers less than the possitive "+n+" is:"+sum);
		}
	}
}