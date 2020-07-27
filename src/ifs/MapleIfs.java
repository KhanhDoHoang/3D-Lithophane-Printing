package ifs;
/**
 * 	This program shows the basic shape of Maple
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class MapleIfs implements AffineTransform{

	private String name;
	private double[][] affine;
	private int scale;
	private int height;
	private int width;
	private int xOffset;
	private int yOffset;
	private int[][] twoDArray;

	/**
	 * Gets values to print out the MapleIfs image
	 * @param MaplesIfs values
	 */
	public MapleIfs() {
		super();
		this.name = "MapleIfs";
		this.affine = new double[][]{
			{0.51,0.00,0.01,0.14,1.31,0.08},
			{0.50,-0.45,0.52,0.43,0.75,-1.49},
			{0.47,0.47,-0.49,0.45,0.74,1.62},
			{0.51,0.00,0.00,0.49,-1.62,-0.02},
		};
		this.scale = 100;
		this.height = 702;
		this.width = 885;
		this.xOffset = 340;
		this.yOffset = 445;
		this.twoDArray = new int[width][height];
	}
	/**
	 * Gets a name value to return.
	 * @return string
	 */
	//the name of the resulting ifs image(use in IfsPanel)
	public String getName() {
		return name;
	}

	/**
	 * Gets a getAffine multidimensional array to return.
	 * @return double[][]
	 */
	//the 2D affine matrix for the image
	public double[][] getAffine(){
		return affine;
	}

	/**
	 * Gets a scale double value to return.
	 * @return double
	 */
	//The scale of the resulting image
	public double getScale() {
		return scale;
	}

	/**
	 * Gets a height integer value to return.
	 * @return int
	 */
	//The height of the resulting image
	public int getHeight() {
		return height;
	}

	/**
	 * Gets a width integer value to return.
	 * @return int
	 */
	///The width of the resulting image
	public int getWdith() {
		return width;
	}

	/**
	 * Gets a xOffset integer value to return.
	 * @return int
	 */
	//The x offset of the resulting image
	public int getXoffset() {
		return xOffset;
	}

	/**
	 * Gets a yOffset integer value to return.
	 * @return int
	 */
	//The y offset of the resulting image
	public int getYoffset() {
		return yOffset;
	}	
}
