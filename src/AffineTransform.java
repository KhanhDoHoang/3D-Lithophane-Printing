
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
	
	//the name of the resulting ifs image(use in IfsPanel)
	public String getName() {
		return name;
	}
	//the 2D affine matrix for the image
	public double[][] getAffine(){
		return affine;
	}
	//The scale of the resulting image
	public double getScale() {
		return scale;
	}
	//The height of the resulting image
	public int getHeight() {
		return height;
	}
	///The width of the resulting image
	public int getWdith() {
		return width;
	}
	//The x offset of the resulting image
	public int getXoffset() {
		return xOffset;
	}
	//The y offset of the resulting image
	public int getYoffset() {
		return yOffset;
	}
}

//public AffineTransform() {
//this.name = "";
//this.twoDArray = new int[width][height];
//this.scale = 0;
//this.height = 0;
//this.width = 0;
//this.xOffset = 0;
//this.yOffset = 0;
//this.x = 0;
//this.y = 0;
//this.xDisp = 0;
//this.yDisp = 0;
//}
