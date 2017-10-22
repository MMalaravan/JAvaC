package stu.bcas.inhe2;

public class Bird extends Animal {
	public Bird() {
		super();
		System.out.println("A new bird has been created?");
	}

	
	@Override
	public void sleep() {
		System.out.println("An bird sleeps.....");
	}
	
	@Override
	public void eat() {
			System.out.println("An bird eats.....");

}
}

