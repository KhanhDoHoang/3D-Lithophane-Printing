
public class MapleIfs extends AffineTransform{

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
