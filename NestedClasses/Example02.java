
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

     public Content getContent(){
     	return new Content();
     }
}


public class Example02 {

	public static void main(String[] args) {
			
			Parcel p1=new Parcel();
			Parcel.Content c1=p1.getContent();

			c1.showContent();
	}
	
}