package abstraction_practice;

public class Rectangle extends TwoDShape {
	
	int y=30;
	
    public void getArea() {
    	System.out.println("Area of the rectangle is L*B");
    }
    public void getPerimeter() {
    	System.out.println("Perimeter of rectangle 2(L+B)");
    }
}
