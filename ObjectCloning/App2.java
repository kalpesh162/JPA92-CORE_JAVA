class Point implements Cloneable{
	 int x;
	 int y;	 
	 Point(){ }
	 Point(int x,int y){this.x=x; this.y=y; }
	 @Override
	 public String toString(){
	 	 return String.format("%-3d %-3d  \n",x,y);
	 }
	 /*
	 @Override
	 protected Point clone() throws CloneNotSupportedException{
	 		return (Point)super.clone();
	 }
	 */
	 @Override
	 public Point clone() throws CloneNotSupportedException{
	 		return (Point)super.clone();
	 }
}
public class App2 {

	public static void main(String[] args) {
		Point p1=new Point(11,22);
		
		Point p2=null;
		try{
		p2=(Point)p1.clone();
	}catch(CloneNotSupportedException e){
		e.printStackTrace();
	}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

	
}