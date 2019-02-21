public class Flower{
	private String name;
	private int petalNum;
	private double price;
	
	public Flower(){
	}
	
	public Flower(String name,int petalNum,double price){
		this.name=name;
		this.petalNum=petalNum;
		this.price=price;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setPetalNums(int nums){
		this.petalNum=nums;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	public int getPetalNums()
	{
		return petalNum;
	}
	public double getPrice(){
		return price;
	}
	
	public static void main(String []args){
		Flower baihe=new Flower("baihe",3,4.4);
		System.out.println("Flower Name: "+baihe.name);
		System.out.println("Flower petal Number: "+baihe.petalNum);
		System.out.println("Flower price: "+baihe.price);
	}
}