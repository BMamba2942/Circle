//Read this first please

//Author: HappyZombies
/*Taken from tutorial online, comments added so I myself could understand
what is going on :) */

//Define the class
public class Circle {   //whatever we call the file, this class must be the same

	private double radius;
	private String color;

	//Constructors (they are overloaded!)
	//Remember: Constructors do not return values, unlike methods

	/*Also, you should name your constructors the same as your class, capitalize letter
	and all*/

	/* Actually, you have to ;) */

	public Circle(){   //~~~1ST CONSTRUCTOR~~~
		radius = 10;
		color = "red";
		/*we assigned variables at the top, now for this constructor, we
		are manually putting values in it*/
	}
	public Circle(double r){  //~~~2ND CONSTRUCTOR~~~
		radius = r;
		color = "red";
		/*we tell radius now equals r.
		r is not private. So now, it will allow us to enter data through 'r'.

		Remember: Private only allows THIS class (called class Circle) to 'read it'*/
	}
	public Circle(double radius, String color){ //~~~3RD CONSTRUCTOR~~~
		this.radius = radius;
		this.color = color;
		/*Same as above, now we give it two new variables
		Here we used this. so we could understand how it works:)
		Really, it's best to call the variables the same, but since we have only two
		it's okay to call them r & c, but when you have a lot of variables, r & c could 
		mean many things*/
	}



	//Public methods. Methods RETURN a value.
	public double getRadius(){
		return radius;
		/*right now , radius equals 0 because we didn't give it a value (see private var).
		but once we input data in our main() file, the constructors will get that data, and put it in
		'radius' and 'color'*/
	}
	public String getColor(){
		return color;
		/*Remember: make sure the public String getColor() matches the data type you gave
		 it in the beginning*/
	}
	public double getArea(){
		return radius*radius*Math.PI;
		//here, we return a mathematical expression
	}

	//let's head over to the Run_Circle.java
}
