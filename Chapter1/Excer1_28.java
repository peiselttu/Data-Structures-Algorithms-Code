package creativityExcer1;

import java.util.Random;

public class Excer1_28 {
	private String sentence;
	private int index;
	
	public Excer1_28() {}
	
	public int getIndex() {
		return index;
	}
	public String getSentence() {
		return sentence;
	}
	
	public void setIndex(int idx) {
		this.index=idx;
	}
	public void setSentence(String sentence) {
		this.sentence=sentence;
	}
	
	public void setHomework(int index,String sentence) {
		this.index=index;
		this.sentence=sentence;
	}
	
	static void printSummary(Excer1_28 h) {
		System.out.print("["+h.index+"]:");
		System.out.println(" "+h.sentence);
	}
	
	
	public static void main(String []args) {
		Excer1_28 []homework=new Excer1_28[100];
		String hw="I will never spam my friends again";
		Random rand=new Random();
		
		// Initialize
		for(int i=0;i<100;i++) {
			homework[i]=new Excer1_28();
		}
		
		for(int i=0;i<100;i++) {
			homework[i].index=i;
			homework[i].sentence=hw;
		}
		
		for(int i=0;i<100;i++) {
			printSummary(homework[i]);
		}

	}

}
