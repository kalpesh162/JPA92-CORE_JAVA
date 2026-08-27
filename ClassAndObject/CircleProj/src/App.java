
public  class App{
	public static void main(String[] args) {
		Circle c1=new Circle("read",2.0);
		System.out.println("Radius "+c1.getRadius());
		System.out.println("Color "+c1.getColor());
		System.out.println("Area "+c1.getArea());

		Circle c2=new Circle(2.0);
		System.out.println("Radius "+c2.getRadius());
		System.out.println("Color "+c2.getColor());
		System.out.println("Area "+c2.getArea());

		Circle c3=new Circle();
		System.out.println("Radius "+c3.getRadius());
		System.out.println("Color "+c3.getColor());
		System.out.println("Area "+c3.getArea());



	}
}