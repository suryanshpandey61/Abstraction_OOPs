package abstraction_practice;

public class TwoDShapeDriver {
public static void main(String[] args) {
	TwoDShape t1=new Circle();
	TwoDShape t2=new Rectangle();
	
	
	t1.getArea();
	t1.getPerimeter();
    TwoDShape.test();
    
//    downcasting to access details of circle
    Circle c1=(Circle)t1;
    System.out.println(c1.x);
    
    System.out.println("===========");
    
    t2.getArea();
    t2.getPerimeter();
    
    //downcasting to access details of rectangle
    Rectangle r1=(Rectangle)t2;
    System.out.println(r1.y);
	
}
}
