package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stl.Facet;
import stl.Solid;
import stl.Vertex;
/**
 * This program test the the Stl 
 * @author Hoang Do
 * @version 2020-03-28
 */

class SolidTest {
	/**
	 * Test invalid case with less than 3 parameters
	 * @param test less than 3 parameters
	 */
	@Test
	void testInvalid() {
		Solid solid = new Solid();
		Solid none = new Solid();
		//Solid.addFacet(Vertex ... vertices) 
		//with0 1 2 params each ==> false
		boolean test = solid.addFacet();
		//works
		solid.addFacet(new Vertex(0, 2, 3));
		assertFalse(test);
		assertEquals(solid.toString(), none.toString());
	}
	/**
	 * Testcase with 3 vertexes
	 * @param test 3 vertexes
	 */
	//Done
	@Test
	void test3() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4));
		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));	
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 4 vertexes
	 * @param test 4 vertexes
	 */
	//Done
	@Test
	void test4() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4), new Vertex(0, 2, 3));
		boolean test2 = solidCompare.addFacet(new Facet(new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 5 vertexes
	 * @param test 5 vertexes
	 */
	//Done
	@Test
	void test5() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4), new Vertex(0, 2, 3), new Vertex(0, 2, 3));

		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 2, 3)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 6 vertexes
	 * @param test 6 vertexes
	 */
	//Done
	@Test
	void test6() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4),
				new Vertex(0, 2, 3), new Vertex(0, 2, 3), new Vertex(0, 3, 4));

		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 3, 4)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 7 vertexes
	 * @param test 7 vertexes
	 */
	//Done
	@Test
	void test7() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4),
				new Vertex(0, 2, 3), new Vertex(0, 2, 3), new Vertex(0, 3, 4),
				new Vertex(0, 5, 6));

		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 3, 4), new Vertex(0, 5, 6)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 8 vertexes
	 * @param test 8 vertexes
	 */
	//Done
	@Test
	void test8() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4),
				new Vertex(0, 2, 3), new Vertex(0, 2, 3), new Vertex(0, 3, 4),
				new Vertex(0, 5, 6), new Vertex(0, 6, 7));

		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 3, 4), new Vertex(0, 5, 6)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 5, 6), new Vertex(0, 6, 7)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
	/**
	 * Testcase with 9 vertexes
	 * @param test 9.;vertexes
	 */
	@Test
	void test9() {
		//Vertex ... vertices
		Solid solid = new Solid();
		//Facet facet
		Solid solidCompare = new Solid();
		boolean test1 = solid.addFacet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4),
				new Vertex(0, 2, 3), new Vertex(0, 2, 3), new Vertex(0, 3, 4),
				new Vertex(0, 5, 6), new Vertex(0, 6, 7), new Vertex(0, 7, 8));

		boolean test2 = solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 2, 3), new Vertex(1, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(1, 3, 4), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 2, 3)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 2, 3), new Vertex(0, 3, 4)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 3, 4), new Vertex(0, 5, 6)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 5, 6), new Vertex(0, 6, 7)));
		solidCompare.addFacet(new Facet(
				new Vertex(1, 1, 2), new Vertex(0, 6, 7), new Vertex(0, 7, 8)));
		assertTrue(test1);
		assertTrue(test2);
		assertEquals(solid.toString(), solidCompare.toString());	
	}
}
