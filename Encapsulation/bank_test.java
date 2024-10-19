package Encapsulation;

import java.util.Scanner;

public class bank_test {
	private String name;
	private long accno;
	private double balance;
	private int pin;

	Scanner sc = new Scanner(System.in);
	
	public  void contnue() {
		System.out.println("if you something forget in the operation then press y/n ");
		char ans = sc.next().charAt(0);
		if(ans == 'y') {
			operation();
		}
		else if(ans == 'n') {
			System.out.println("thanks for visiting..");
		}
		else {
			System.out.println("character error ");
			contnue();
			operation();
		}
		
		
	}

	public void operation() {
		System.out.println("Select the num perform action\n");
		System.out.println("press 1 for check the balance\n");
		System.out.println("press 2 for check the accno\n");
		System.out.println("press 3 for  deposit the money\n ");
		System.out.println("press 4 for withdrawl money\n");
		System.out.println("press 5 for update pin\n");
		
		int enter = sc.nextInt();
		
		if(enter == 1) {
			System.out.println("please enter the pin ");
			int p = sc.nextInt();
			System.out.println(getBalance(p));
			contnue();
		}
		
		else if(enter == 2) {
			System.out.println("please enter the pin ");
			int p = sc.nextInt();
			System.out.println(getAccno(p)); 
			contnue();
		}
		else if(enter == 3) {
			System.out.println("please enter the pin ");
			int p = sc.nextInt();
			System.out.println("enter the amount for deposit ");
			double userbalance = sc.nextDouble();
			setDepositeBalanace(userbalance,p);
			contnue();
		}
		else if(enter == 4) {
			System.out.println("please enter the pin ");
			int p = sc.nextInt();
			System.out.println("enter the amount for withdrawl ");
			double userbalance = sc.nextDouble();
			setWithdrawl(userbalance,p);
			contnue();
		}
		else if(enter == 5) {
			System.out.println("please enter the pin ");
			int p = sc.nextInt();
			System.out.println("enter for updating the pin  ");
			int nnpin = sc.nextInt();
			System.out.println("now your pin is successfully updated");
			setPin(nnpin);
			contnue();
		}
		else {
			operation();
		}
		
		
	}
	
	
	public String getName(int pin)
	{
		 if(this.pin == pin)
		 {
			 return this.name;
		 }
		 else 
		 {
			 System.out.println("wrong pin");
			 System.out.println("enter the pin ");
			 int npin = sc.nextInt();
			 getName(npin);
			 return this.name;
		 }
	}

	public String setName1(String name) {
		return this.name = name;
	}

	public long getAccno(int pin) {
		if (this.pin == pin) {
			return this.accno;
		} else {
			 System.out.println("wrong pin");
			 System.out.println("enter the pin again");
			 int npin = sc.nextInt();
			 getAccno(npin);
			return this.accno;
		}

	}
	
	public double getBalance(int pin) {
		if (this.pin == pin) {
			return this.balance;
		}
		else {
			System.out.println("its wrong pin ");
			System.out.println("please enter the correct pin ");
			int npin = sc.nextInt();
			getBalance(npin);
			return this.balance;
		}
	}

	public double setBalance(int pin) {

		if (this.pin == pin)
			return this.balance;

		else {
			System.out.println("wrong pin");
			int npin = sc.nextInt();
			getAccno(npin);
			return this.balance;
		}

	}

	public void setDepositeBalanace(double balance, int pin) {
		
		
		if(this.pin == pin) {
			
			this.balance += balance;
			System.out.println(balance + " deposited..");
			System.out.println(this.balance + " reamaining");
		}
		else {
			System.out.println("wrong pin ");
			System.out.println("enter pin again ");
			
			int npin = sc.nextInt();
			setDepositeBalanace(balance,npin);
			
			
		}
		
		
		
	}

	public void setWithdrawl(double balance, int pin) {
		if (this.pin == pin) {
			if (balance <= this.balance) {

				this.balance -= balance;
				System.out.println(balance + " withdrawl sucesfully");

			}
			else {
				System.out.println("insufficent fund");
			}

		} else {
			System.out.println("incorrect pin");
			int npin = sc.nextInt();			
			setWithdrawl(balance,npin);
		}

	}

	public void setPin(int pin) {
		if (pin <= 9999 && pin > 999) {
			this.pin = pin;
		}

		else {
			System.out.println("incorrect pin");
			int npin = sc.nextInt();
			setPin(npin);
		}

	}

	public bank_test(String name, long accno, double balance, int pin) {
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.pin = pin;
	}

}
