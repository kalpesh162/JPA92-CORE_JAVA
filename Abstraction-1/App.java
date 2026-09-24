abstract class Instrument{
     // data
	 abstract void play();  // play() is incomplete
	// methods
}
/*
abstract class A{
	void f1(){

	}
}
*/
//abstarct class Guitar extends Instrument {}

class Guitar extends Instrument{
	@Override
	void play(){
		System.out.println("Guitar is play...");
	}
}



class Violin extends Instrument{
	@Override
	void play(){
		System.out.println("Violin is play...");
	}
}


class Flute extends Instrument{
	@Override
	void play(){
		System.out.println("Flute is play...");
	}
}
public class App{

	static void tune(Instrument i){
		i.play();
	}

	static void tuneAll(Instrument a[]){
		   for(Instrument i1 : a)
		   	tune(i1);
	}

	public static void main(String[] args) {
		//Instrument is abstract; cannot be instantiated
		/*
		Instrument i1=new Instrument();
		i1.play();
		*/

		Guitar g1=new Guitar();
		g1.play();

		Instrument arr[]={new Guitar(),new Violin(),new Flute()};

		tuneAll(arr);
	}
}