package oops;

public class encapsulation {

	private int accntnum;
	private String accntname;
	private int balance;
	
	encapsulation(int balance){
		this.balance=balance;
	}
	
	public void setdetails(int accntnum, String accntname) {
		this.accntnum=accntnum;
		this.accntname=accntname;
	}
	
	public void withdraw(int amt) {
		this.balance-=amt;
	}
	
	public void deposit(int amt) {
		this.balance+=amt;
	}
	
	public void printdetails() {
		System.out.println("Accnt num : "+accntnum);
		System.out.println("Accnt name : "+accntname);
		System.out.println("Balance :"+balance);
	}
}
