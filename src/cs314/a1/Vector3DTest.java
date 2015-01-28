package cs314.a1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Vector3DTest {
	/*
	 * @Test public void testMain() { fail("Not yet implemented"); }
	 */

	// constructor
	@Test
	public void testVector3D() {
		// fail("Not yet implemented");
		Vector3D testA = new Vector3D(1, 1, 1);
		Vector3D testB = new Vector3D(1, 1, 1);
		// Vector3D testC = new Vector3D(1, 2, 3);
		assertTrue(testA.equals(testB));
		//System.out.println("A: " + testA.toString() + "\nB: " + testB.toString());
	}

	// scale should be f*(x, y, z)
	@Test
	public void testScale() {
		Vector3D testA = new Vector3D(1, 1, 1);
		Vector3D result = new Vector3D(4, 4, 4);
		testA.scale(4);
		assertTrue(testA.equals(result));
		//System.out.println("A: " + testA.toString() + "\nResult: " + result.toString());
	}

	@Test
	public void testAdd() {
		Vector3D testA = new Vector3D(1, 1, 1);
		Vector3D testB = new Vector3D(0, 1, 2);
		Vector3D result = new Vector3D(1, 2, 3);
		Vector3D expected = testA.add(testB);
		assertTrue(expected.equals(result));
		//System.out.println("A: " + testA.toString() + "\nB: " + testB.toString() + "\nResult: " + result.toString());
	}

	@Test
	public void testSubtract() {
		Vector3D testA = new Vector3D(5, 5, 5);
		Vector3D testB = new Vector3D(0, 1, 2);
		Vector3D result = new Vector3D(5, 4, 3);
		Vector3D expected = testA.subtract(testB);
		assertTrue(expected.equals(result));
	}
/*
	@Test
	public void testNegate() {
		Vector3D testA = new Vector3D(1, 2, 3);
		Vector3D result = new Vector3D(-1, -2, -3);
		testA.negate();
		assertEquals(testA, result);
	}

	@Test
	public void testDot() { // returns double Vector3D testA = new
		Vector3D(1, 1, 1);
		Vector3D testB = new Vector3D(0, 1, 2);
		double result = 3;
		assertEquals(testA.dot(testB), result);
	}

	@Test
	public void testMagnitude() { // returns double Vector3D testA = new
		Vector3D(1, 3, 5);
		double result = Math.sqrt(35);
		assertEquals(testA.magnitude(), result);
	}

	@Test
	public void testToString() { // returns string Vector3D testA = new
		Vector3D(1, 3, 5);
		String result = "{1, 3, 5}";
		assertEquals(testA.toString(), result);
	}
*/
	@Test
	public void testEquals() {
		Vector3D testA = new Vector3D(1, 1, 1);
		Vector3D testB = new Vector3D(1, 1, 1);
		Vector3D testC = new Vector3D(0, 1, 1);
		assertTrue(testA.equals(testB));
		assertFalse(testA.equals(testC));
	}
	
}
