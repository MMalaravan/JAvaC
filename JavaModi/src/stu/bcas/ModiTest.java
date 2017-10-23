package stu.bcas;

public class ModiTest {
	
	public void printPublic() {
		System.out.println("This is a public method");
	}
	
	private void printPrivate() {
		System.out.println("This is a private method");
	}
	
	protected void printProtected() {
		System.out.println("This is a protected method");
	}
	
	public static void main(String []args) {
		ModiTest mt = new ModiTest();
		mt.printPublic();
		mt.printPrivate();
		mt.printProtected();
		
	}
	

}
