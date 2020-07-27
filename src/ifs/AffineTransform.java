package ifs;
//package ifs;
/**
 * 	This program shows the basic shapes for 3D print
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public interface AffineTransform {
	
	/**
	 * Gets a name value to return.
	 * @return string
	 */
	//the name of the resulting ifs image(use in IfsPanel)
	public String getName();

	/**
	 * Gets a getAffine multidimensional array to return.
	 * @return double[][]
	 */
	//the 2D affine matrix for the image
	public double[][] getAffine();

	/**
	 * Gets a scale double value to return.
	 * @return double
	 */
	//The scale of the resulting image
	public double getScale();

	/**
	 * Gets a height integer value to return.
	 * @return int
	 */
	//The height of the resulting image
	public int getHeight();
	/**
	 * Gets a width integer value to return.
	 * @return int
	 */
	///The width of the resulting image
	public int getWdith();

	/**
	 * Gets a xOffset integer value to return.
	 * @return int
	 */
	//The x offset of the resulting image
	public int getXoffset();

	/**
	 * Gets a yOffset integer value to return.
	 * @return int
	 */
	//The y offset of the resulting image
	public int getYoffset();
	

}
