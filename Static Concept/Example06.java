
import java.util.Random;

public  class Example06{
	 public static void main(String[] args) {
	 	
	 	Random generator=new Random();

	 	for(int i=1;i<=10;i++){
	 		System.out.println(generator.nextInt(1000));
	 	}


	 }
}