
public class BarnsleyFernIfs extends AffineTransform{

	public BarnsleyFernIfs() {
		super();
		this.name = "Barnsley";
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
