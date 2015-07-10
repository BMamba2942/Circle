public class Cylinder extends Circle{                                           /* Have you already seen eridetariety? */
    private int height;

    public Cylinder(){
        super();                                                                /* This calls the parent class's (Circle) constructor */
        height = 1;
    }

    public Cylinder(int r){
        super(r);
        height = 1;
    }

    public Cylinder(double radius, int height){
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, int height, String color){
        super(radius,color);
        this.height=height;
    }

    public double getVolume(){
        double volume;
        volume = (double) getArea()*height;                                       /* Circle's attributes & methods are inherited by Cylinder */
        return volume;
    }

    public double getSurfaceArea(){
        return getCircumference() * (super.getRadius() + height);
    }
}
