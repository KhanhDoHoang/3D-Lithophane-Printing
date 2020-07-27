package ifs;
/**
 * 	This program shows the basic shape of Sierpinski
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class SierpinskiIfs extends AffineTransform{

	/**
	 * Gets values to print out the SierpinskiIfs image
	 * @param SierpinskiIfs values
	 */
	public SierpinskiIfs() {
		super();
		this.name = "SierpinskiIfs";
		this.affine = new double[][]
				{{0.5,0.0,0.0,0.5,0.0,0.0},
			{0.5,0.0,0.0,0.5,0.0,-0.5},
			{0.5,0.0,0.0,0.5,-0.43,-0.25}};
			this.scale = 500;
			this.height = 449;
			this.width = 519;
			this.xOffset = 439;
			this.yOffset = 509;
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
