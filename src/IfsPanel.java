import java.util.Scanner;
public class IfsPanel {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		AffineTransform[] affineTrans = new AffineTransform[3];
		affineTrans[0] = new BarnsleyFernIfs();
		affineTrans[1] = new SierpinskiIfs();
		affineTrans[2] = new MapleIfs();
		
//		BarnsleyFernIfs barnsley = new BarnsleyFernIfs();
//		SierpinskiIfs sierpinski = new SierpinskiIfs();
//		MapleIfs maple = new MapleIfs();
		IfsCreator creator = new IfsCreator();

		int choice = 1;
//		do {
//			
//		}
		while(choice < 4 && choice > 0) {
			System.out.println("Available fractal images are:");
			System.out.println("1 " + affineTrans[0].getName());
			System.out.println("2 " + affineTrans[1].getName());
			System.out.println("3 "+ affineTrans[2].getName());
			System.out.println("What image number do you want?");
			choice = input.nextInt();
			
			while(choice > 3 || choice < 0) {
				System.out.println("Please select a value from 1 to 3:");
				choice = input.nextInt();
			}
			
			switch(choice) {
			case 1:
				IfsViewer.view(creator.generateIfs(affineTrans[0], 1));
				break;
			case 2:
				IfsViewer.view(creator.generateIfs(affineTrans[1], 2));
				break;
			default:
				IfsViewer.view(creator.generateIfs(affineTrans[2], 3));
			}
			
			System.out.println();
		}
		input.close();
	}
}
