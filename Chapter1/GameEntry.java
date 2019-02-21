public class GameEntry{
	public static void main(String []args){
		GameObject []A=new GameObject[6];
		A[0]=new GameObject(89,"aName");
		
		A[1]=new GameObject(99,"bName");
		
		
		A[2]=new GameObject(89,"cName");
		
		A[3]=new GameObject(85,"dName");
		
		A[4]=new GameObject(560,"eName");
		
		A[5]=new GameObject(660,"fName");
		
		GameObject B=A[4];
		System.out.println("B Name:"+B.name);
		System.out.println("B Score:"+B.score);
		System.out.println("=============================");

		B.score=450;
		B.name="bName";
		System.out.println("B Name:"+B.name);
		System.out.println("B Score:"+B.score);
		System.out.println("=============================");
		
		for(int i=0;i<=5;i++){
		System.out.println("name:"+A[i].name);
		System.out.println("score:"+A[i].score);
		}
		
		
	}
}

class GameObject{
	protected int score;
	protected String name;
	
	public int getScore(){
		return score;
	}
	public String getName(){
		return name;
	}
	
	public void setScore(int score){
		this.score=score;
	}
	public void setName(String name){
		this.name=name;
	}
	public GameObject(){
	}
	
	public GameObject(int score,String name){
		this.score=score;
		this.name=name;
	}
}