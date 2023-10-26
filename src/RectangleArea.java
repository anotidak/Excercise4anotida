import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData()

    {
        //method gets the length and width of the rectangle from the user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length and width");
        length = sc.nextDouble();
        width = sc.nextDouble();

    }
    //method computes the area of the triangle
    public void computerField()
    {
        area = length *width ;
    }
    public void fieldDisplay(){
        System.out.println("Area of rectangle is:"+ area);
    }
}