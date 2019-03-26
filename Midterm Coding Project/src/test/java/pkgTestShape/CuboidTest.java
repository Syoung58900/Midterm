package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	@Test
	public void Cuboid_Test1() {
		try {
			Cuboid c = new Cuboid(1, 2, 3);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Test2() throws Exception {
		Cuboid c = new Cuboid(-1, 2, 3);
	}

	@Test
	public void getDepth_Test() {
		try {
			Cuboid c = new Cuboid(1, 2, 3);
			assertEquals(c.getDepth(), 3);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void setDepth_Test() {
		try {
			Cuboid c = new Cuboid(1, 2, 3);
			c.setDepth(4);
			assertEquals(c.getDepth(), 4);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void area_Test() {
		try {
			Cuboid c = new Cuboid(1, 2, 3);
			assertEquals(c.area(), 24, 0);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test(expected = UnsupportedOperationException.class)
	public void perimeter_Test() throws Exception {
		Cuboid c = new Cuboid(1, 2, 3);
		c.perimeter();
	}

	@Test
	public void sortByArea_Test() {
		try {

		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void sortByVolume_Test() {

	}
}
