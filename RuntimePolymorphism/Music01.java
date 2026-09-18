class  Instrument{

	 void play(){
	 	System.out.println("Instrument::play()");
	 }
}

class Guitar extends Instrument{
	@Override	
	 void play(){
	 	System.out.println("Guitar::play()");
	 }
}

class Violin extends Instrument{
	@Override	
	 void play(){
	 	System.out.println("Violin::play()");
	 }

}

class Flute extends Instrument{
	@Override	
	 void play(){
	 	System.out.println("Flute::play()");
	 }

}

class Music01{

	static void tune(Guitar g1){
         g1.play();
	}	


	static void tune(Instrument g1){
         g1.play();
	}	

	static void tune(Violin g1){
         g1.play();
	}	

	static void tune(Flute g1){
         g1.play();
	}	
	public static void main(String[] args) {
		/*
		Instrument i1=new Instrument(); i1.play();
		Guitar g1=new Guitar(); g1.play();
		Violin v1=new Violin(); v1.play();
		Flute f1=new Flute(); f1.play();
		*/

		/*
		Instrument i1=new Guitar();
		i1.play();
		*/

		tune(new Guitar());
		tune(new Violin());
		tune(new Flute());
		tune(new Instrument());



		
	}
	
}