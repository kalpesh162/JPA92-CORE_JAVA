public  class Example05 {

	public static void main(String[] args) {
		
		char theater[][] = {
						    {'A','A','A','A','A','A'},
						    {'B','B','B','B','B','B'},
						    {'C','C','C','C','C','C'},
						    {'D','D','D','D','D','D'},
						    {'E','E','E','E','E','E'},
						    {'F','F','F','F','F','F'}
						};


		for(int i=0;i<theater.length;i++){

			 for(int j=0;j<theater[i].length;j++){
			 	  System.out.print(theater[i][j] +""+(j+1)+"  ");
			 }
			 System.out.println();
		}


       // boolean array bookedTickets

	}
	
}