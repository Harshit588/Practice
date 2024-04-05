package ShapeArea;

public class Ractangle implements Shape{
	
	int l,b;
	
	
	public Ractangle(int l, int b) {
		
		this.l = l;
		this.b = b;
	}


	@Override
	public double Area() {
		
		return l*b;
	}
}