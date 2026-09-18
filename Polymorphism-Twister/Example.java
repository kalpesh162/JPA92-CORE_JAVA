
import java.util.Random;

class  Shape {
	void draw(){
		 System.out.println("Shape : draw");
	}

	void erase(){
		 System.out.println("Shape : erase");
	}
}

class  Circle extends Shape{

	void draw(){
		 System.out.println("Circle : draw");
	}

	void erase(){
		 System.out.println("Circle : erase");
	}
	
}


class  Triangle extends Shape{

	void draw(){
		 System.out.println("Triangle : draw");
	}

	void erase(){
		 System.out.println("Triangle : erase");
	}
	
}


class  Rectangle extends Shape{

	void draw(){
		 System.out.println("Rectangle : draw");
	}

	void erase(){
		 System.out.println("Rectangle : erase");
	}
	
}


class ShapeGenerator{

	Random random=new Random();

	Shape nextShape(){

		  switch(random.nextInt(3)){
		  	  default:
		  		
		  	  case 0 : return new Shape();
		  	  case 1 : return new Circle();
		  	  case 2 : return new Triangle();
		  	  case 3 : return new Rectangle();
		  }
	}

}





class Example{

	public static void main(String[] args) {

		ShapeGenerator shapes=new ShapeGenerator();

		///shapes.nextShape().draw();

		Shape arr[]=new Shape[10];

		for(int i=0;i<arr.length;i++){
			  arr[i]=shapes.nextShape();
		}


		for(Shape sh:arr){
			sh.draw();
			sh.erase();
			System.out.println("----------------");
		}


		
	}
	
}