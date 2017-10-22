package stu.bcas.inhe2;

public class Dog extends Animal {
	public Dog() {
		super();
		System.out.println("A new dog has been created");
	}
	
	@Override
	public void sleep() {
		System.out.println("An dog sleeps.....");
	}
	
	@Override
	public void eat() {
			System.out.println("An dog eats.....");


}
}
