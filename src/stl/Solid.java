package stl;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * This program prints the 3d format for 3 shapes: sierpisnki, mapleLeaf, BarnsleyFern
 * @author Hoang Do
 * @version 2020-02-28
 */
public class Solid {

	private String name;
	private ArrayList<Facet> facets = new ArrayList<Facet>();

	/**
     * Default constructor.
     * @param assign name
     */
	public Solid() {
		this.name = "";
	}
	
	/**
     * Parametized constructor.
     * @param assign name
     */
	public Solid(String name) {
		this.name = name;
	}
	
	/**
     * Add Facet to the facets list, return true if successful, false is not
     * @param add Facet to the facets list
     * @param return true if successful
     * @return boolean
     */
	//Connect to facet here!
	//add Facet to the facets list, return true if successful, false is not
	public boolean addFacet(Facet facet) {
		if(facets.add(facet)) {
			return true;
		}
		return false;
	}
	
	/**
     * Connect to Vertex.
     * @param Vargargs method take multiples variable
     * @return boolean
     */
	//Connect to Vertex here!!
	//Vargargs method take multiples variable *like an array
	public boolean addFacet(Vertex ... vertices) {	
		if(vertices.length < 3) {
			return false;
		}else{
			//
			// 0 1 2
			// 0 2 3
			for(int i = 0; i < vertices.length - 2; i++) {
				facets.add(new Facet(vertices[0],vertices[i+1],vertices[i+2])); 
			}
		}
		return true;


	}

	/**
     * Create a String of the solid specified in the Stl ASCII Format.
     * @param loop through facet to get values
     * @return String
     */
	//Create a String of the solid specified in the Stl ASCII Format
	@Override
	public String toString() {
		//		String str = ;
		StringBuilder str = new StringBuilder("solid " + name + "\n");

		for(int i = 0; i < facets.size(); i++) {
			str.append(facets.get(i));
		}
		str.append("endsolid " + name);		
		return str.toString();
	}

	/**
     * Printing solid to file in C disk.
     * @param print the solid to a file 
     */
	//print the solid to a file 
	public void print(PrintWriter printWriter) {
		try {
			printWriter.print(toString());

		}catch(Exception e) {
			System.out.println("Failed " + e.getMessage());
		}

	}
}

