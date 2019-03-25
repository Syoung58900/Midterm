package pkgShape;

import java.util.Comparator;

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
		Cuboid c = (Cuboid) o;
		return Double.compare(this.area(), c.area());
	}

	class SortByArea implements Comparator<Cuboid> {

		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.area(), o2.area());
		}

	}

	class SortByVolume implements Comparator<Cuboid> {

		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.volume(), o2.volume());
		}

	}

}
