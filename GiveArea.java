// write a program to take 2 arguments and print the area of rect
// provide input by manually running 
// ex : javac GiveArea.java
// java GiveArea 10 20

public class GiveArea{
    public static double findArea(float side1, float side2){
        double area=side1*side2;
        return area;
    }
    public static void main(String[] args) {
        float side1=Float.parseFloat(args[0]);
        float side2=Float.parseFloat(args[1]);
        double area=findArea(side1,side2);
        System.out.println("Area is "+area);
    }
}
