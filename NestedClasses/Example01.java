
class Parcel{
      private String label="ABCD";


	  class Content{
	  	private String item="YELLOW";

	  	public void showContent(){
	  		 System.out.println(item);
	  	}

	  }

     public void showDetails(){
     	 System.out.println(label);
     }
}


public class Example01 {

	public static void main(String[] args) {
			Parcel.Content c1=new Parcel().new Content();
			c1.showContent();
	}
	
}