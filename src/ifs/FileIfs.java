package ifs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * GThis program scans and reads the value of Golden Dragon from file Ifs.
 * @author do_hoang
 * @version 1.3 2020-02-11 
 */

public class FileIfs extends AffineTransform {

	/**
	 * Gets a random value to return between min and max inputs.
	 * @param scan and read the values given in Ifs file 
	 */
	public FileIfs(String GoldenDragon){
		super();
		try (Scanner file = new Scanner(new File("C:\\\\Users\\\\katie\\\\Downloads\\\\GoldenDragon.ifs"))) {				
			List<String> ignoreAll = Arrays.asList(" ","	","  ");

			//List<String> name = new ArrayList<>();
			//String[] split = file.next().split("");

			while(file.hasNext()) {
				String line = file.next();	//scan for the following line, String

				switch(line) {
				case "affine":
					int rows = file.nextInt();
					//System.out.println(rows);
					this.affine = new double[rows][7];
					for (int i = 0; i < rows; i++) {
						for(int j = 0; j < 7; j++) {
							affine[i][j] = file.nextDouble();
							//System.out.println(affine[i][j]);
						}
					}

					break;

				case "scale":

					this.scale = file.nextInt();
					//System.out.println(scale);
					break;

				case "height":
					this.height = file.nextInt();
					//System.out.println(height);
					break;

				case "width":
					this.width = file.nextInt();
					//System.out.println(width);
					break;

				case "xOffset":
					this.xOffset = file.nextInt();
					//System.out.println(xOffset);
					break;

				case "yOffset":
					this.yOffset = file.nextInt();
					//System.out.println(yOffset);
					break;

				default:
					this.name = file.next() + "" + file.next();
					//System.out.println(name);


				}
			}
			this.twoDArray = new int[width][height];
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}


	}
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


/*
 * file.skip(Pattern.compile("scale")); if(line.contentEquals("scale"))
 * {continue;}
 */

/*
 * if(ignoreAll.contains(file)) { System.out.println("runs"); continue; }
 */

/*	while(file.hasNextDouble)
 * 		int row = file.nextInt();
 * 	while(Character.isWhitespace(file.hasNextDouble)
 */
