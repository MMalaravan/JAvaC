package bcas.stu.java.poly;

public class PolyTriangle extends PolyDiagram  {
	
	int base1;
	int base2;
	double base3;
	
	public PolyTriangle (int base1, int base2, double base3) {
		this.base1 = base1;
		this.base2 = base2;
		this.base3 = base3;
		
	}
	
	@Override
	public void drow() {
		System.out.println("Drow traiangle with bases of " + base1 + " , " + base2 + " and " + base3 + "  !");
	}
}
	
	

