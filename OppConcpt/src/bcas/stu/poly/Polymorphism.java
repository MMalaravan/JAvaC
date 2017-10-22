package bcas.stu.poly;

public class Polymorphism {
	public static void main(String[] args) {
		
		//method overloading by no of params
		Adder a = new Adder();
		System.out.println(a.add(5,2));
		System.out.println(a.add(5,3,2));
		
		
		//method overloading  by different type params
		System.out.println(Adder.add(5,3.1));
		System.out.println(Adder.add(5.5,3.1));
		
		
	}

}
