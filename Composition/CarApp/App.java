class Engine{
	 void startOn(){
	 	System.out.println("Engine On");
	 }
	 void startOFF(){
	 	System.out.println("Engine On");
	 }

}

class Door{
	void open(){
		System.out.println("Open Door");
	}
	void close(){
		System.out.println("Open Close");
	}
}

class Wheel{
	 void inflate(){
	 	System.out.println("Wheel inflate ...");
	 }
}

class Car {
	Engine engine;
	Door leftdoor[]=new Door[2];
	Door rightdoor[]=new Door[2];
	Wheel wheels[]=new Wheel[4];

	public Car(){
		engine=new Engine();
		for (int i=0; i<leftdoor.length;i++ ) 
			leftdoor[i]=new Door();
		
		for (int i=0; i<leftdoor.length;i++ ) 
			rightdoor[i]=new Door();
		
		for (int i=0; i<wheels.length;i++ ) 
			wheels[i]=new Wheel();
				
		
	}


}
	


public  class App {

	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.engine.startOn();
	
		System.out.println("Open Left Door");
		bmw.leftdoor[0].open();
		
	}	
}
