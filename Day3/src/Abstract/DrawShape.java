package Abstract;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{

	void draw() {
		System.out.println("Draw a rectangle");
		
	}
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw a circle");
	}
}

public class DrawShape {

	public static void main(String[] args) {
		Shape s1= new Rectangle();
		s1.draw();
		
		s1= new Circle();
		s1.draw();
	}

}
