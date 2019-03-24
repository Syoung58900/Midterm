package pkgShape;

public class Cuboid extends Rectangle {

	private int Depth;

	public Cuboid(int width, int length, int depth) throws Exception {
		super(width, length);
		if (!(depth > 0))
			throw new IllegalArgumentException("Depth not a positive number");
		else
			this.Depth = depth;
	}

	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		this.Depth = depth;
	}

	public double volume() {
		return super.area() * Depth;
	}

	@Override
	public double area() {
		return super.area() * 4;
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Perimeter not valid for cuboid");
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

}
