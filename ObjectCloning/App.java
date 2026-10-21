class Point{
	 int x;
	 int y;
	 
	 Point(){ }

	 Point(int x,int y){this.x=x; this.y=y; }

	 @Override
	 public String toString(){
	 	 return String.format("%-3d %-3d  \n",x,y);
	 }
	 
	 public Point clonePoint() throws CloneNotSupportedException{
	 	   return (Point)super.clone();
	 }
	 

}


public class App {

	public static void main(String[] args) throws CloneNotSupportedException{
		Point p1=new Point(11,22);
		//protected Object	clone()
		//Point p2=(Point)p1.clone();
		Point p2=(Point)p1.clonePoint();

		System.out.println(p1);
		System.out.println(p2);
	}

	
}