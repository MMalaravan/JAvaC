package bcas.stu.java.poly;

public class PolyCircle extends PolyDiagram {
	
	private int radious;
	
	public PolyCircle (int radious) {
		this.radious = radious;
		
	}

	@Override
	public void drow() {
		System.out.println("Drow Circle of " + radious + "radious !");
	}
}
