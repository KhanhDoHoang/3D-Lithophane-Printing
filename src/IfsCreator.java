
public class IfsCreator {

	private int A;
	private int B;
	private int C;
	private int D;
	private int E;
	private int F;
	private double prob;
//	public int choice;
	
	public IfsCreator() {
		A = 0; B = 1; C = 2; D = 3; E = 4; F = 5;
	}
	
	public int[][] generateIfs(AffineTransform affineTrans, int choice){
		for(int i = 0 ; i < affineTrans.width * affineTrans.height; i++) {
			prob = Math.random();			
			int row = 0;
			
			if(choice == 1) {
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
			} else if(choice == 2) {
				if(prob >= 0.00 && prob <= 0.33) {
					row = 0;
				}
				else if(prob > 0.33 && prob <= 0.66) {
					row = 1;
				}
				else { //(prob > 0.66 && prob <= 1.00) {
					row = 2;
				}
			}else {
				if(prob <= 0.10) {
					row = 0;
				}else if(prob > 0.10 && prob <= 0.45) {
					row = 1;
				}else if(prob > 0.45 && prob <= 0.80) {
					row = 2;
				}else {
					row = 3;
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
}
