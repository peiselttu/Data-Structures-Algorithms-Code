package revisedCreditCard;

public class revisedCreditCard {
	
	private String cardName;
	private String cardNo;
	private String bankName;
	
	protected double balance;
	protected double limit;
	
	public revisedCreditCard() {}

	public revisedCreditCard(String cardName,String cardNo,String bankName,double limit,double balance) {
		this.cardName=cardName;
		this.cardNo=cardNo;
		this.bankName=bankName;
		this.limit=limit;
		this.balance=balance;
	}
	
	public revisedCreditCard(String cardName,String cardNo,String bankName,double limit) {
		this(cardName,cardNo,bankName,limit,0.0);
	}
	public String getCardName() {
		return cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getBankName() {
		return bankName;
	}
	public double getLimit() {
		return limit;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setCardName(String name) {
		cardName=name;
	}
	public void setCardNo(String no) {
		cardNo=no;
	}
	public void setBankName(String bankName) {
		this.bankName=bankName;
	}
	public void setLimit(double limit) {
		this.limit=limit;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void makeDeposit(double amount) {
		this.balance+=amount;
	}
	public void payBills(double amount) {
		double thisLimit=this.limit;
		double thisBalance=this.balance;
		if(amount>thisBalance) {
			System.out.println("Your current balance is :"+thisBalance+" cannot afford it.");
			return;
		}
		else {
			if(amount>thisLimit) {
				this.balance-=this.balance-thisLimit;
				System.out.println("Your current limit is: "+thisLimit+" cannot pay all of it, your pay amount is: "+thisLimit+" this time.");
				return;
			}
			this.balance-=amount;
			System.out.println("the payment of card "+cardNo+ " is made successfully! And the Current balance is: "+this.balance);
		}
	}
	
	public static void printSummary(revisedCreditCard card) {
		System.out.println("The customer name is: "+card.cardName);
		System.out.println("The card no. is: "+card.cardNo);
		System.out.println("The bank name is: "+card.bankName);
		
		System.out.println("The current balance is: "+card.balance);
		System.out.println("The current limitation is: "+card.limit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revisedCreditCard []newCard=new revisedCreditCard[3];
		newCard[0]=new revisedCreditCard("zhangsan",
										 "5391 0375 9387 5309",
										 "California Savings",
										 800,
										 0.0);
		newCard[1]=new revisedCreditCard("lisi",
				 "3485 0399 3395 1954",
				 "California Savings",
				 800);
		 
		newCard[2]=new revisedCreditCard("wangwu",
				 "5391 0375 9387 5309",
				 "California Savings",
				 800,
				 2500);
		
		System.out.println("Make a batch deposit");
		for(double val=1;val<=6;val++) {
			newCard[0].makeDeposit(val+300);
			newCard[1].makeDeposit(30*val);
			newCard[2].makeDeposit(3*val);
		}
		System.out.println("make a batch payment");
		for(double val=1;val<=6;val++) {
			newCard[0].payBills(100*val);
			newCard[1].payBills(100*val);
			newCard[2].payBills(100*val);
		}
		
		printSummary(newCard[0]);
		System.out.println("====================================");
		printSummary(newCard[1]);
		System.out.println("====================================");
		printSummary(newCard[2]);
		System.out.println("Hello world");
		

	}

}
