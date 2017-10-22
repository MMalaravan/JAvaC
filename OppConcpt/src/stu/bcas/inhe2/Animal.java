package stu.bcas.inhe2;

public class Animal {
public Animal () {
	System.out.println("A new animal has been created?");
}
	
	public Animal (String name) {
		System.out.println("A new animal has been created with "+ name +"?");
	}
	
	public void sleep() {
		System.out.println("An animal sleeps.....");
	}
	public void eat() {
		System.out.println("An animal eats.....");
	}
}


