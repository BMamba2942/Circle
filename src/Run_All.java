
public class Run_All {
	public static void main(String[] args){
		//Circles
		Circle c1 = new Circle();
		System.out.println("Radius of Circle is " + c1.getRadius()+ ": Color is " + c1.getColor() + ": Area is "+ c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("Radius of Circle is " + c2.getRadius()+ ": Color is " + c2.getColor() + ": Area is "+ c2.getArea());

		Circle c3 = new Circle(2.0, "blue");
		System.out.println("Radius of Circle is " + c3.getRadius()+ ": Color is " + c3.getColor() + ": Area is "+ c3.getArea());

        Circle c4 = new Circle(2.0, "blue");
        System.out.println("Radius of Circle is " + c4.getRadius()+ ": Color is " + c4.getColor() + ": Area is "+ c4.getArea() + " Circumference is " + c4.getCircumference());
       
        
        /**
         * Created by Raijuu on 7/9/2015
         */
        //Square
        Square sq1 = new Square(5,5);
		System.out.println("\nArea of square is " + sq1.getArea());
		
		/**
		 * Created by Christa on 7/9/2015.
		 */
		//Cylinder
		Cylinder cy1 = new Cylinder();
        System.out.println("\nRadius of cylinder is: " + cy1.getRadius()+ "\nColor is: " + cy1.getColor() + "\nArea is "+ cy1.getArea() + "\nVolume is " + cy1.getVolume());
        System.out.println("Surface Area of cylinder is " + cy1.getSurfaceArea());
	}
}
