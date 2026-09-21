class Point{
		final int x; final int y;
		Point(){ x=0;y=0;}
		Point(int x,int y){ this.x=x; this.y=y;}

		double slope(final Point other){
			 return (other.x-this.x)/((other.y-this.y)*1.0);
		}

		double slope(final Point p1,final Point p2){
			p1=new Point(11,22);  // by make final as a reference to protect for other Object Creation
			 return (other.x-this.x)/((other.y-this.y)*1.0);
		}

}

public  class Example02 {

	public static void main(String[] args) {
			Point p1=new Point();
			Point p2=new Point(10,20);
			System.out.println(p1.x +" " +p1.y);
			System.out.println(p2.x +" " +p2.y);
			//p1.x=11;
			//System.out.println(p1.x +" " +p1.y);



	}
	
}