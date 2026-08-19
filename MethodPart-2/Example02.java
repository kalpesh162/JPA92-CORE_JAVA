import java.util.Scanner;
public class Example02{
                                    // formal parameter
    public static double getDiameter(double radius){
    	   double dia=2*radius;
    	   return dia;
    }
    public static double getCircleArea(double radius){
    	 return 3.14*radius*radius;
    }

    public static double perimeterOfCircle(double radius){
    	 return 2*3.14*radius;
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double radius;
		System.out.println("Enter  Radius");
		radius=scanner.nextDouble();

		double diameter=getDiameter(radius); // actual parameter
		System.out.println(diameter);

		System.out.println(getCircleArea(radius));

		double perimeter=perimeterOfCircle(radius);
		System.out.println(perimeter);



	}
}