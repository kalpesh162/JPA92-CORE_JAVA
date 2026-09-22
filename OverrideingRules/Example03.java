class Meal{
	Meal(){ System.out.println("Meal ");}
}

class Bread {
	Bread(){ System.out.println("Bread ");}
}

class Lettuce {
	Lettuce(){ System.out.println("Lettuce ");}
}

class Lunch extends Meal{
	Lunch(){ System.out.println("Lunch ");}
}

class PortableLunch extends Lunch{
	PortableLunch(){ System.out.println(" PortableLunch");}
}

class Sandwich extends PortableLunch{
	Bread bread=new Bread();
	Lettuce lettuce=new Lettuce();
	Sandwich(){
		System.out.println("Sandwich Constructor");
	}
}

public  class Example03{
	public static void main(String[] args) {
			new Sandwich();	
	}
}