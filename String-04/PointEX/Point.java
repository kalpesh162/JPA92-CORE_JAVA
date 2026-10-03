/*
class Object  {
	public  boolean equals(Object o){
		if(this==o) return true;
		return false;
	}
}
*/
class Point{
	// private 
	  int x;
	  int y;

	  Point(){ }
	  Point(int x,int y){ this.x=x; this.y=y;}

	  // setter
	  // getter

	  @Override
	  public String toString(){
	  	 return String.format("%-3d %-3d",x,y);
	  }
		// p1.equals(p2)
	  @Override					//other=new Point(11,22)
		public  boolean equals(Object other){
			 Point p2=(Point)other;  // downCasting
			if(this.x==p2.x  && this.y==p2.y)
				return true;

			return false;
		}
}

/*
// Why we override equals method

public  class java.lang.String{

		@Override
	  public boolean equals(Object){

	  }
}


What exaclty is inheritance
method Overriding
UPCASTING
DOWNCASTING   --> ClassCastException

Why we need to Override ?

*/