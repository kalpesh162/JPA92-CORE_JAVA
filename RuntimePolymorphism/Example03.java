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
class Music03{
	// Instrument g1=new Guitar();  // UPCASTING
	static void tune(Instrument g1){
         g1.play();
	}	

	/*
	static void tuneAll(Instrument arr[]){
		for(Instrument i1:arr)
			i1.play();
	}
	*/

	static void tuneAll(Instrument arr[]){
		for(Instrument i1:arr)
			tune(i1);
	}

	// Extensibility we achive here through runtime polymprohims		
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

		System.out.println("--------------------------");

		Instrument inst[]={new Guitar(),new Violin,new Flute(),new Instrument()};

		tuneAll(inst);


		
	}
	
}