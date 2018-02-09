import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
	
	@Test
	public void testMain() {
		Triangle tr = new Triangle(1, 2, 3);
		assertNotNull(tr);
    }
	
	@Test
	public void testNotATriangle() {
		Triangle tr = new Triangle(1, 2, 6);
		assertEquals("Not a Triangle" , tr.findTriangleType());
    }
	
	@Test
	public void testEquilateral() {
		Triangle tr = new Triangle(4, 4, 4);
		assertEquals("Equilateral" , tr.findTriangleType());
    }
	
	@Test
	public void testIsosceles() {
		Triangle tr = new Triangle(4, 4, 8);
		assertEquals("Isosceles" , tr.findTriangleType());
    }
	
	@Test
	public void testScalene() {
		Triangle tr = new Triangle(4, 6, 8);
		assertEquals("Scalene" , tr.findTriangleType());
    }
	
	
}
