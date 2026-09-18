/*
class Object{
	 public String toString(){
	 	  return this.getClass().getName()+"@"+hashcode();
	 }
	 public int hashcode(){
	 	 return ;
	 }
	 Class getClass(){ }

}

// Why we need to override method ?  Explain
*/
class  Point{
	int x;
	int y;

	Point(){}
	Point(int x,int y){this.x=x; this.y=y;}
	//setter
	// getter

	 @Override	
	 public String toString(){
	 	  return "X  "+x+"  Y "+y;

	 }
}
class App {

	public static void main(String[] args) {

		Point p1=new Point(11,22);
		//p1.getX()
		//p1.getY()
		//System.out.println(p1.x);
		//System.out.println(p1.y);
		System.out.println(p1);  //Point@15db9742     // String toString()

		// iternally p1.toString()
		
	}
	
}