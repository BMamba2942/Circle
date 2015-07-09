//Run the program !
public class Run_Circle {
	public static void main(String[] args){
		/*here, we tell Java to get 'Circle' (which is in the other file)
		 we then give it a variable, it can be anything, but it's best to call
		 it an appropriate name. Don't want to call it 'Circle spongebob = new Circle();
		 We call it c1 because it is the first constructor that we will use!
		 */
		Circle c1 = new Circle();
		System.out.println("Radius is " + c1.getRadius()+ " Color is " + c1.getColor() + " Area is "+ c1.getArea());
		/*
		 A system println is done.
		 We use the dot operator to invoke the methods! Remember the methods? They return
		 the radius....color...and area!

		 Our first constructor already have values , they equaled to 1.0 and 'red'
		 */

		Circle c2 = new Circle(2.0);
		System.out.println("Radius is " + c2.getRadius()+ " Color is " + c2.getColor() + " Area is "+ c2.getArea());
		/*
		 * Observe, Constructor 2 needed data for it's double r. Here, we tell it (give r value 2.0)
		 * r now equals 2.0, and that means that radius now equals 2.0!
		 */

		Circle c3 = new Circle(2.0, "blue");
		System.out.println("Radius is " + c3.getRadius()+ " Color is " + c3.getColor() + " Area is "+ c3.getArea());
		/*
		 * Constructor 3 needed 2 different data values, so we gave it to them
		 *
		 *
		 * We are done ! Yay!!!
		 */

		
		Circle c3 = new Circle(2.0, "blue");
			System.out.println("Radius is " + c3.getRadius()+ " Color is " + c3.getColor() + " Area is "+ c3.getArea());
			/*
			 * Constructor 3 needed 2 different data values, so we gave it to them
			 * 
			 * 
			 * We are done ! Yay!!!
			 */

	}
}
