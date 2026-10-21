interface Instrument{
	 void play();
}
/*
abstract class Instrument {
	void play();
}
*/
public  class Example07 {

	public static void main(String[] args) {
			// Example07$1.class
			Instrument i1=new Instrument(){

					@Override
					public void play(){
						 System.out.println("Guitar Plays");
					}

			};
			i1.play();
			System.out.println("-----------------------");
			//Example07$2.class
			new Instrument(){
					@Override
					public void play(){
						 System.out.println("Violin Plays");
					}

			}.play();


	}
	
}