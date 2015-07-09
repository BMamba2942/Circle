//Author: Raijuu


//Define the class
public class Square { 

    private int length;
    private int width;
    private String color;
    
    public Square(){
        length = 10;
        width = 10;
        color = "blue";
    }
    
    public Square(int l, int w){
        length = l;
        width = w;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getArea(){
        return length*width;
    }
}