package pkgShape;

public class Rectangle extends Shape {

	private int Width;
	private int Length;

	public Rectangle(int width, int length) {
		super();
		this.Width = width;
		this.Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Object o) {
		// TODO
		return 0;
	}

}
