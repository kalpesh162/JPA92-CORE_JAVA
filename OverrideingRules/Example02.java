class Grain {
	Grain process(){
		return new Grain();
	}

	@Override
	public String toString(){
		return "Grain :: processed";
	}
}

class  Wheat extends Grain{
	@Override
	Wheat process(){
		return new Wheat();
	}
	@Override
	public String toString(){
		return "Wheat :: processed";
	}
}
	// While Override method in java if parent class has return type
// When we Override the it must be same return type or its subtype Allowed
// thats called
// CoVarient Return Type


class Example02 {

	public static void main(String[] args) {
		
	}
	
}