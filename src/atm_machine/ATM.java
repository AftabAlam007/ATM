package atm_machine;

import java.util.Scanner;

public class ATM {
	
	private int balance;
	public ATM (int initialBalance) {
		this.balance = initialBalance;	
	}

	public int getBalance() {
		return this.balance;
	}
	
	public boolean withdraw(int amount) {
		
		if(amount > this.balance) {
			return false;
		}
		// we can write this this.balance=this.balance-amount(this.balance-=amount)
		this.balance -=amount;
		return true;
	}
	
	public void deposite(int amount) {
		this.balance += amount;
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		ATM atm =new ATM (1000);
		while (true) {
			
			System.out.println("1. View Balnce");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposite");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice :");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Your Balance is :"+atm.getBalance() );
				break;
				
			case 2:
				System.out.println("Enter the Amount to Withdrow :");  // wdamount(withdraw)
				int wdamount = sc.nextInt();
				boolean success = atm.withdraw(wdamount);	
				if(success) {
					System.out.println("Withdraw Successfull");
				}else {
					System.out.println("Insufficient Balance....");
				}
				break;
				
			case 3:
				
				System.out.println("Enter the amount to deposite :");
				int dpamount = sc.nextInt();
				atm.deposite(dpamount);
				System.out.println("Deposite Successfull..");
				break;
				
			case 4: System.out.println("Thanks of using ATM ...");
			System.exit(0);
			break;
			
			default:
				System.out.println("Invalid Choice");
				
				}
		}

	}

}
