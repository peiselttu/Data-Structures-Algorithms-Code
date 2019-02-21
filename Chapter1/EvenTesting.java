
public class EvenTesting{
	public static boolean isEven(int m){
		while(m>=0){
			m-=2;
		}
		if(m==-2){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String []args){
		for(int m=0;m<6;m++){
			boolean flag=isEven(m);
			if(flag){
				System.out.println(m+" isEven");
			}
			else{
				System.out.println(m+" isOdd");
			}
		}
	}
}