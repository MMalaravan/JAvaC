package bcas.stu;

import java.util.Scanner;

public class Accocount {
	private static double balance;
	private static double amount;

	public Accocount(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		this.amount = amount;

	}

	public void setResult() {

		if (balance > amount) {

			System.out.println("Your amount withrowaal ");
			balance = balance - amount;
			System.out.println("Now your balance = "+balance);
		}

		else {

			System.out.println("Plz update your account balance");

		}

	}

	public static void main(String[] args) {

		Accocount acc1 = new Accocount(balance);
		acc1.credit(amount);
		
		Scanner get = new Scanner(System.in);

		System.out.println("Type your balance ");
		balance = get.nextDouble();

		System.out.println("Type your amount to want ");
		amount = get.nextDouble();

		acc1.setResult();
		
	}

}
