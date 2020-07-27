package ifs;

import ifs.AffineTransform;

/**
 * 	This program shows the basic shape of BarnsleyFern
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class BarnsleyFernIfs implements AffineTransform{

	private String name;
	private double[][] affine;
	private int scale;
	private int height;
	private int width;
	private int xOffset;
	private int yOffset;
	private int[][] twoDArray;

	/**
	 * Gets values to print out the BarnsleyFernIfs image
	 * @param BarnsleyFernIfs values
	 */
	public BarnsleyFernIfs() {
		super();
		this.name = "BarnsleyFernIfs";
		this.affine = new double[][]{
			{0.00,0.00,0.00,0.16,0.00,0.00},
			{0.85,0.04,-0.04,0.85,0.00,1.60},
			{0.20,-0.26,0.23,0.22,0.00,1.60,},
			{-0.15,0.28,0.26,0.24,0.00,0.44},
		};
		this.scale = 100;
		this.height = 503;
		this.width = 1019;
		this.xOffset = 228;
		this.yOffset = 10;
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

