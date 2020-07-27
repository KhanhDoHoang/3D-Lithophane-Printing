package ifs;
/**
 * 	This program shows the basic shapes for 3D print
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class AffineTransform {
	public String name;
	public double[][] affine;
	public int[][] twoDArray;
	public double scale;
	public int height;
	public int width;
	public int xOffset;
	public int yOffset;
	public double x;
	public double y;
	public int xDisp;
	public int yDisp;

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
