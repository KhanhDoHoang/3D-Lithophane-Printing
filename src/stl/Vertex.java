package stl;
import java.text.DecimalFormat;
import java.lang.Math;
/**
 * 	This program shows the basic shapes for 3D print
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */
public class Vertex {

	private double x;
	private double y;
	private double z;
	private static DecimalFormat df;
	
	/**
     * Gets values from Vertex.
     * @param input double x, input double y, input double z, 
     */
	public Vertex(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		df = new DecimalFormat("#.##");
	}
	
	/**
     * Create a String of this Vertex specified in the StL ASCII Form.
     * @return String
     */
	//- create a String of this Vertex specified in the StL ASCII Form
	public String toString() {

		return df.format(x) + " " + df.format(y) + " " + df.format(z) + " ";
		
	}
	
	/**
     * Calculate unit normal Vertex given three vertice.
     * @param Vertex v1, Vertex v2, Vertex 3
     * @return Vertex
     */
	//do math
	public static Vertex calcNormal(Vertex v1, Vertex v2, Vertex v3) {
		
		double a1 = v2.x - v1.x; 
		double b1 = v2.y - v1.y;
		double c1 = v2.z - v1.z;
		double a2 = v3.x - v1.x;
		double b2 = v3.y - v1.y;
		double c2 = v3.z - v1.z;
		double a = b1 * c2 - b2 * c1; 
	    double b = a2 * c1 - a1 * c2; 
	    double c = a1 * b2 - b1 * a2; 
	    double vec = (Math.sqrt((a*a)+(b*b)+(c*c)));
	    double x = a / vec;
	    double y = b / vec;
	    double z = c / vec;
	    
		return new Vertex(x,y,z);
		
	}
}
