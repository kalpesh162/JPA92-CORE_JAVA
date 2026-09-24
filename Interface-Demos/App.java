interface Instrument{
	 int notes=5;   // public static final
	 void play();  // public abstract void play();
}
/*
abstract class Guitar implements Instrument{

}
*/
class Guitar implements Instrument{

	@Override
	public  void play(){
		System.out.println("Guitar plays");
	}

}

class Violin implements Instrument{

	@Override
	public  void play(){
		System.out.println("Violin plays");
	}

}

class Flute implements Instrument{

	@Override
	public  void play(){
		System.out.println("Flute plays");
	}

}


public class  App{
	static void tune(Instrument i){
		 i.play();
	}
	static void tuneAll(Instrument arr[]){
		for(Instrument i : arr)
			tune(i);
	}

	public static void main(String[] args) {

		//Instrument i1=new Instrument();
		// interface can not be institiated
		
		Instrument arr[]={new Guitar(),new Violin(),new Flute()};

		// instance of
		for(Instrument i : arr){
			    if(i instanceof Guitar)
			    	System.out.println("Guitar....");
			    else if(i instanceof Violin)
			    	System.out.println("Violin....");
			    else if(i instanceof Flute)
			    	System.out.println("Flute....");
		}

		System.out.println("---------");

		for(Instrument i : arr){
			    if(i instanceof Instrument){
			    	System.out.println("Instrument  :: ");
			    	i.play();
			    	System.out.println(i.notes);

			    }
		}

		System.out.println(Instrument.notes);
	}
}