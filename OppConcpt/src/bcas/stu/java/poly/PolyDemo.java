package bcas.stu.java.poly;

public class PolyDemo {

	public static void main(String[] args) {
		
		//compile-time polymorphism			
		System.out.println("....................................");
		
		CompPoly cp = new CompPoly();
		
		cp.Drow();
		cp.drow(10);
		cp.drow(20, 30);
		cp.drow(10, 15, 20);
		
		//run-time polymorphismzz	
		System.out.println("....................................");
		
		PolyDiagram pd = new PolyDiagram();	
		
		pd.drow();	
	
		pd = new PolyCircle(10);
		pd.drow();
		
		pd = new PolySquare(20, 30);
		pd.drow();
		
		pd = new PolyTriangle(10, 15, 20);
		pd.drow();
		}
	}

