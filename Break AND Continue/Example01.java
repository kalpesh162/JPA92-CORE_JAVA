// Where we use break
public class Example01{
	public static void main(String[] args) {
		
		// break  switch case
		// break  loop

		for(int i=1;i<=100;i++){
				if(i==10)
					 break;
			System.out.println(i);
		}

   
		for(int i=1;i<=5;i++){

			   for(int j=1;j<=5;j++){
			   		if(j==3) break;
			   	    System.out.println(i + "" + j);
			   }


		}



	}
}