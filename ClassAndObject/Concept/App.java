
class Data{
	private int x=5;  // Instance

	public Data(){
		System.out.println("Beefore Comstrcutor x=-1  "+x);
		x=-1;
	}
	public Data(int x){
		System.out.println("--->  "+this.x);
		this.x=x;
	}

    public void setX(int x){
    	 this.x=x;
    }	

    public int getX() { return this.x;}

}

public class App{
	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println(d1.getX());

		System.out.println("-----------------");

		Data d2=new Data(10);
		System.out.println(d2.getX());

	}
}