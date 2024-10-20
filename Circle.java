package abstraction_practice;

public class Circle extends TwoDShape {
	
	int x=20;
	
   public void getArea() {
	   System.out.println("Area of Circle is PI*r*r");
   }
   public void getPerimeter() {
	   System.out.println("Perimeter of Circle 2*PI*r*r");
   }
}
