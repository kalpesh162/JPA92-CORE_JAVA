public  class Circle{
	private double radius=1.0;
	private String color="red";

	public Circle(){ 

	}

	public Circle(double radius){
		 this.radius=radius;
	}

	public Circle(String color,double radius){
		 this.color=color;
		 this.radius=radius;
	}

	public double getRadius(){ return this.radius; }
	public String getColor(){ return this.color; }

	public double getArea(){
		 return 3.14*radius*radius;
	}

}