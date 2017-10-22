package stu.bcas.inhe2;

public class AnimalDemo {
	public static void main(String[] args) {
		
		Animal animal = new Animal ();
		Bird bird = new Bird ();
		Dog dog = new Dog ();
		
		System.out.println("..........................................................");
		
		animal.sleep();
		animal.eat();
		
		bird.sleep();
		bird.eat();
		
		dog.sleep();
		dog.eat();
		
		System.out.println("..........................................................");
		
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		
		System.out.println("..........................................................");
		
		a1.eat();
		a2.sleep();
		
	}

}
