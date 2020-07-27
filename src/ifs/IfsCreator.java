package ifs;
/**
 * This program prints the 3d format for 3 shapes: sierpisnki, mapleLeaf, BarnsleyFern
 * @author Hoang Do
 * @version 2020-02-28
 */
public class IfsCreator {

	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	private static final int D = 3;
	private static final int E = 4;
	private static final int F = 5;
	private double prob;

	/**
	 * Gets values to print out the images
	 * @param calculate the average of each image and assign row number
	 * @param calculate width and height
	 */
	public int[][] generateIfs(AffineTransform affineTrans){
		for(int i = 0 ; i < affineTrans.width * affineTrans.height; i++) {
			prob = Math.random();			
			int row = 0;

			if(affineTrans.getName().contentEquals("BarnsleyFernIfs")) {
				if(prob >= 0.00 && prob <= 0.01) {
					row = 0;
				}
				else if(prob > 0.01 && prob <= 0.85) {
					row = 1;
				}
				else if(prob > 0.85 && prob <= 0.92) {
					row = 2;
				}
				else {
					row = 3;
				}
			} else if(affineTrans.getName().contentEquals("SierpinskiIfs")) {
				if(prob >= 0.00 && prob <= 0.33) {
					row = 0;
				}
				else if(prob > 0.33 && prob <= 0.66) {
					row = 1;
				}
				else { 
					row = 2;
				}
			}else if(affineTrans.getName().contentEquals("MapleIfs")){
				if(prob <= 0.10) {
					row = 0;
				}else if(prob > 0.10 && prob <= 0.45) {
					row = 1;
				}else if(prob > 0.45 && prob <= 0.80) {
					row = 2;
				}else {
					row = 3;
				}

			}else {
				if(prob <= 0.75) {
					row = 0;
				}else{
					row = 1;
				}
			}
			double u = affineTrans.affine[row][A]*affineTrans.x + affineTrans.affine[row][B]*affineTrans.y + affineTrans.affine[row][E];
			double v = affineTrans.affine[row][C]*affineTrans.x + affineTrans.affine[row][D]*affineTrans.y + affineTrans.affine[row][F];
			affineTrans.x = u;
			affineTrans.y = v;
			affineTrans.xDisp =(int) (affineTrans.x * affineTrans.scale + affineTrans.xOffset);
			affineTrans.yDisp =(int) (affineTrans.y * affineTrans.scale + affineTrans.yOffset);			
			affineTrans.twoDArray[affineTrans.yDisp][affineTrans.xDisp]++;
		}
		return affineTrans.twoDArray;
	}

	/**
	 * Gets values to print out the images
	 * @param get the images
	 * @return AffineTransform[]
	 */
	public AffineTransform[] getTransform() {
		AffineTransform[] affineTrans = new AffineTransform[4];
		affineTrans[0] = new BarnsleyFernIfs();
		affineTrans[1] = new SierpinskiIfs();
		affineTrans[2] = new MapleIfs();
		affineTrans[3] = new FileIfs("GoldenDragon");
		return affineTrans;

	}
}
