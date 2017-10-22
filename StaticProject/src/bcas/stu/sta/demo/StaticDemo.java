package bcas.stu.sta.demo;

public class StaticDemo {
	
	
	//static method myCalculation
	public static void myCalculation() {
	System.out.println("Static method myCalculation");
	}
	
	
	//static main methods
    public static void main(String[] args) {
	System.out.println("This is static main method");
	myCalculation();
    }
    
    
    //static block
    static {
	System.out.println("This is ststic block");
    }
}
