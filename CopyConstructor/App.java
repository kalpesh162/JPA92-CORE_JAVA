class  Point{
	int x; int y;

	Point(){}
	Point(int x,int y){this.x=x; this.y=y;}
	// Copy Constrctor 
	// is threre copy constructor in java ? No
	// But we can write copy Constrctor
	Point(Point other){
		this.x=other.x;
		this.y=other.y;	
	} 
}

class App {
	public static void main(String[] args) {
		
		Point p1=new Point(11,22);

		Point p2=new Point(p1); // Copy Constrcutor

	}
	
}