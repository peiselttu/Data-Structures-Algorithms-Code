public class sumPositiveOdd{
	public static int sumOdd(int n){
		int sum=0;
		EvenTesting evenTesting=new EvenTesting();
			
		if(n<0){
			sum=-1;
			System.out.println("the input "+n+" is a negative number!");
		}
		else{
			boolean flag=false;
			for(int i=0;i<=n;i++){
				flag=evenTesting.isEven(i);
				if(!flag){
					sum+=i;
				}
			}
			
		}
		return sum;
	}
	
	public static void main(String []args){
		int n=6;
		int sum=sumOdd(n);
		System.out.println("sum="+sum);
	}
}