import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ifs.AffineTransform;
import ifs.IfsCreator;
import stl.Solid;
import stl.StlImage;
/**
 * This program prints the 3d format for 3 shapes: sierpisnki, mapleLeaf, BarnsleyFern
 * @author Hoang Do
 * @version 2020-03-18
 */

public class IfsStFile {
	public static void main(String[]args) throws IOException {
		Scanner input = new Scanner(System.in);

		//Get the array of affine transform objects from IfsCreator class
		IfsCreator creator = new IfsCreator();

		AffineTransform[] creatorStoring =  creator.getTransform();

		int choice = 0;
		System.out.println("Available fractal images are:");
		for(int i = 0; i < creatorStoring.length; i++) {
			System.out.println((i+1) +" "+ creatorStoring[i].getName());
		}

		System.out.println("What number do you want?");
		choice = input.nextInt();

		while(choice > 4 || choice < 0) {
			System.out.println("Please select a value from 1 to 4:");
			choice = input.nextInt();
			continue;
		}		
		//	creator.generateIfs(creatorStoring[choice-1]);

		StlImage stl = new StlImage(0.8,4.0);
		//	AffineTransform affine = new AffineTransform();
		Solid solid = stl.createSolid(creator.generateIfs(creatorStoring[choice-1]));

		PrintWriter printWriter = new PrintWriter("C:\\temp2020\\"+ creatorStoring[choice-1].getName() +".stl");
		solid.print(printWriter);

		System.out.println("----Done----");
		System.out.println();
		printWriter.close();
		input.close();

	}
}

