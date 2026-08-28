class Data{
	  int x=11;
	  static int y=22;

	  Data(){ } // use above intialization 

	  	/*
	  Data(int x,int y){
	  	this.x=x;
	  	this.y=y;
	  }
	  */
	  // static Block
	  static {
	  	System.out.println("static Block  Loads   Check Value Y "+Data.y);
	  		y=10;
	  	System.out.println("static Block  Loads   Check Value Y After y=10    "+Data.y);
	  }



	  	Data(int x){
	  		 System.out.println("Inside Constructor But Before intialization  "+this.x);
	  		
	  		 this.x=x;
	  		 // y=10; Its Ok Here
	  		 System.out.println("Inside Constructor But After intialization  "+this.x);
	  	}
	  
	  void displayData(){
	  	System.out.println(x+"  "+y);
	  }

	  static void showData(){
	  	
	  	System.out.println(y+"  ");  
	  	
	  }

}

public  class Example03{
	public static void main(String[] args) {
		Data d1=new Data(33);
		
	}
}