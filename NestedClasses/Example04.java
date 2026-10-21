interface PContent{
	 void showContent();
}
class Parcel{
      private String label="ABCD";

	 private  class Content implements PContent{
	  	private String item="YELLOW";

	  	@Override
	  	public void showContent(){
	  		 System.out.println(item);
	  	}
	  }

     public void showDetails(){
     	 System.out.println(label);
     }

     public PContent getContent(){
     	return new Content();
     }
}
public class Example04 {
	public static void main(String[] args) {		
			Parcel p1=new Parcel();
			PContent c1=p1.getContent();
			c1.showContent();
	}
	
}