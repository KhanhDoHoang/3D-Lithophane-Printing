package stl;
import java.lang.Math;
/**
 * 	This program shows the basic shapes for 3D print
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class StlImage {

	private double minThick;	//the required minimum thickness of the lithophane
	private double thickScale; //difference between the thickes and thinnest part of the lithophane
	private double scale;	//hardcode to 0.1
	private double maxValue;	//the determined (in creaSolid method) 
	
	/**
     * Parametized constructor.
     * @param assign two variables and calculate thickscale
     */
	public StlImage (double min, double max){
		this.minThick = min;
		this.thickScale = max - min;
		this.scale = 0.1;
	}
	
	/**
     * Create a Solid (lithophane) from a 2D array of integers.
     * @return Solid
     */
	public Solid createSolid(int[][] matrix) {
		Solid solid = new Solid();
		
		//find the maximum value in the integer array, store it in maxValue
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] >= maxValue) {
					maxValue = matrix[i][j];
				}
			}
		}
		for(int i = 0; i < matrix.length-1; i++) {
			for(int j = 0; j < matrix[i].length-1; j++) {
				//top
				solid.addFacet(
				createIfsVertex(i, j, matrix[i][j]),
				createIfsVertex(i+1, j,   matrix[i+1][j]),
				createIfsVertex(i+1, j+1, matrix[i+1][j+1]), 
				createIfsVertex(i,   j+1, matrix[i][j+1]));	
			}
		}
		int width = matrix.length;
		int length = matrix[0].length;	//the first row
		//side1
		//add the four Vertex to Solid using addFacet
		solid.addFacet(
				new Vertex(0, 0, 0),
				new Vertex(width * scale, 0, 0),
				new Vertex(width * scale, 0, minThick),
				new Vertex(0, 0, minThick));
	//side2
		//add the four Vertex to Solid using addFacet
		solid.addFacet(
				new Vertex(0, length * scale, 0), 
				new Vertex(0, 0, 0),
				new Vertex(0, 0, minThick), 
				new Vertex(0, length * scale, minThick));
	//side3
		//add the four Vertex to Solid using addFacet	
		solid.addFacet(
			new Vertex(width * scale, 0, 0),
			new Vertex(width * scale, length * scale, 0),
			new Vertex(width * scale, length * scale, minThick),
			new Vertex(width * scale, 0, minThick));
	//side4
		//add the four Vertex to Solid using addFacet
		solid.addFacet(
			new Vertex(width * scale, length * scale, 0),
			new Vertex(0, length * scale, 0), 
			new Vertex(0, length * scale, minThick), 
			new Vertex(width * scale, length * scale, minThick));
	//bottom
		//add the four Vertex to Solid using addFacet
		solid.addFacet(
			new Vertex(0, 0, 0), 
			new Vertex(0, length * scale, 0), 
			new Vertex(width * scale, length * scale, 0),
			new Vertex(width * scale, 0, 0));
		return solid;	//just need to return a solid assigned to 
						//specific numbers not a "new solid"
		
	}
	
	/**
     * Create a lithophaneVertex from an ar-ray value.
     * @param x, y, and z are the three parameter
     * @return Vertex
     */
	private Vertex createIfsVertex(double x, double y, double z) {
		//calculate the thickness based on the following formula
		double thickness = minThick + thickScale * Math.sqrt(z/maxValue);
		//create a new Vertex with the following value
		return new Vertex(x * scale, y * scale, thickness);
	}
}

