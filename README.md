# Lithophane 3d printing
## Open another branch to see the final Project!

### Main: IfsFile
#### Package: ifs, stl, test
** ifs : ** The model of BarnsleyFern, Maple Leaf, Sierpinski and Dragon
** stl : ** Algorithm of dimensional arrays
>   double a1 = v2.x - v1.x; 

>		double b1 = v2.y - v1.y;
>		double c1 = v2.z - v1.z;
>		double a2 = v3.x - v1.x;
>		double b2 = v3.y - v1.y;
>		double c2 = v3.z - v1.z;
>		double a = b1 * c2 - b2 * c1; 
>	   double b = a2 * c1 - a1 * c2; 
>	   double c = a1 * b2 - b1 * a2; 
>	   double vec = (Math.sqrt((a*a)+(b*b)+(c*c)));
>	   double x = a / vec;
>	   double y = b / vec;
>	   double z = c / vec;

** test : ** Using JUnit to test every units checking if there is small errors
