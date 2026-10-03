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
	  // gettrr

	  public String toString(){
	  	 return String.format("%-3d %-3d",x,y);
	  }
	
}