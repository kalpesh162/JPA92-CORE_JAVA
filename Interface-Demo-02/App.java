interface CanFight{
	 void fight();
}

interface CanFly{
	 void fly();
}

interface CanSwim{
	 void swim();
}

class ActionCharcter {
	public void fight(){
		System.out.println("ActionCharcter  :: fight()");
	}
}
class Hero extends ActionCharcter implements CanFly,CanSwim,CanFight{
	@Override
	public void fly(){ 
		System.out.println("Hero :: fly ");
	}
	@Override
	public void swim(){ 
		System.out.println("Hero :: swim ");
	}
}
public  class App {
	// CanFly cf=new Hero();
	static void u(CanFly cf){
		cf.fly();
	}
	static void v(CanFight cf){
	}
	static void w(CanSwim cs){	
	}
	public static void main(String[] args) {
			
			Hero hero=new Hero();
			u(hero);
			v(hero);
			w(hero);
	}
	
}