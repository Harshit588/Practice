package ShapeArea;

public class Circle implements Shape {
	
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public double Area() {
			
		return Math.PI*(radius*radius);
	}
}
