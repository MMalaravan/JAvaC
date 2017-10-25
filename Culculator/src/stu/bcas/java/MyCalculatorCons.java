package stu.bcas.java;

public class MyCalculatorCons {
	
	static int num1, num2;
	
	public MyCalculatorCons(int x ,int y) {
		num1 = x;
		num2 = y;
	}
	public static int addNums() {
		int result = num1 + num2;
		return result;
	}
	public static int subNums() {
		int result = num2 - num1;
		return result;
	}
	public static int mulNums() {
		int result = num1 * num2;
		return result;
	}
	public static int divNums() {
		int result = num1 / num2;
		return result;
	}
	public void printsummary() {
		System.out.println("sum is "+ addNums());
		System.out.println("sub is "+ subNums());
		System.out.println("mul is "+ mulNums());
		System.out.println("div is "+ divNums());
		
	}

}
