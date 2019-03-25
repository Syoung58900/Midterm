package pkgShape;

public class Rectangle extends Shape {

	private int Width;
	private int Length;

	public Rectangle(int width, int length) throws Exception {
		super();
		if (!(width > 0 && length > 0))
			throw new IllegalArgumentException("Length or width not positive value");

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
		return this.Length * this.Width;
	}

	@Override
	public double perimeter() {
		return (2 * Length) + (2 * Width);
	}

	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return Double.compare(this.area(), r.area());
	}

}
