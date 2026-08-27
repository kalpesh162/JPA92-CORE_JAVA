
class Rock{
	 int id;
	 int cnt=0;

	 Rock(int x){
	 	 id=x;
	 	 cnt++;
	 }
}

public  class Example01{
	public static void main(String[] args) {
		
		Rock rock1=null;
		for(int i=1;i<=10;i++){
			rock1=new Rock(i*5);
		}

		System.out.println(rock1.cnt);	

	}
}