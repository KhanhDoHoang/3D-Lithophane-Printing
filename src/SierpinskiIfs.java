
public class SierpinskiIfs extends AffineTransform{

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
