package bcas.stu.java.poly;

public class PolySquare extends PolyDiagram {
	
	private int width;
	private int height;
	
	public PolySquare(int width, int height) {
		this.width = width;
		this.height = height;
		
		
	}

	@Override
	public void drow() {
		System.out.println("Drow square of " + width + " width and " + height + "height  !");
	}
	
}
