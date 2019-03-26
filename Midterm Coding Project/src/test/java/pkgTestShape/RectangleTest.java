package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void Rectangle_Test1() {
		try {
			Rectangle r = new Rectangle(2, 3);
		} catch (Exception e) {
			assertTrue(false);
		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test2() throws Exception {
		Rectangle r = new Rectangle(-1, 1);
	}

	@Test
	public void getLength_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			assertEquals(r.getLength(), 3);
		} catch (Exception e) {
			assertTrue(false);
		}

	}

	@Test
	public void setLength_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			r.setLength(4);
			assertEquals(4, r.getLength());
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void getWidth_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			assertEquals(r.getWidth(), 2);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void setWidth_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			r.setWidth(1);
			assertEquals(1, r.getWidth());
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void area_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			assertEquals((double) 6, r.area(), 0);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void perimeter_Test() {
		try {
			Rectangle r = new Rectangle(2, 3);
			assertEquals(r.perimeter(), 10, 0);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void compareTo_Test1() {
		try {
			Rectangle r = new Rectangle(2, 3);
			Rectangle j = new Rectangle(2, 3);
			assertEquals(r.compareTo(j), 0);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void compareTo_Test2() {
		try {
			Rectangle r = new Rectangle(3, 3);
			Rectangle j = new Rectangle(2, 3);
			assertEquals(r.compareTo(j), 1);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void compareTo_Test3() {
		try {
			Rectangle r = new Rectangle(2, 3);
			Rectangle j = new Rectangle(4, 4);
			assertEquals(r.compareTo(j), -1);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

}
