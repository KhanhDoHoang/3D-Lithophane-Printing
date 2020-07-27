package stl;

/**
 * 	This program shows the basic shapes for 3D print
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */
public class Facet {

	
	private Vertex normal;
	private Vertex v1;
	private Vertex v2;
	private Vertex v3;
	
	/**
	 * Gets values from Vertex
	 * @param Facet values
	 */
	public Facet(Vertex v1, Vertex v2, Vertex v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		normal = Vertex.calcNormal(v1, v2, v3);
	}
	
	/**
	 * Create a String of the facet.
	 * @param toString this facet specified in the stl ascii format
	 * @return String
	 */
	//create a String of this facet specified in the stl ascii format
	//Return a string that displays the values of the class, 
	public String toString() {
		
		return "facet normal " + normal +  "\n"
				+ " outer loop\n  " + "vertex " + v1.toString() + "\n  " + "vertex " + v2.toString() + "\n  " + "vertex " + v3.toString()
				+ "\n endloop" + "\nendfacet" + "\n"; 
		
	}
}

	
		