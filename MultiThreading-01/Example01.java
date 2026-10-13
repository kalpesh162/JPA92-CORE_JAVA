
// public static  Thread currentThread()
// public String toString(){ }
class Example01 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread()+"  "+i);
			//Thread[main,5,main]
			// main --> Thread Name
			// 5    --> Priority
			// main --> Thread Group Name
		}

	}
	
}