// int x=10; int y=10;  x==y
// String s1="Kareena";
// String s2="Kareena";
// s1.equals(s2)

// int arr[]=new int[0];  No Error
// int arr[]=new int[-5];  // Exception

//int num=Integer.parseInt(args[i]); 
public  class Main{

	public static void main(String[] args) {
		
		if(args[0].equals("-h"))
			System.out.print("Hello");

		if(args[0].equals("-b"))
			System.out.print("Bye");

		for(int i=1;i<args.length;i++)
			System.out.println("  "+args[i]);
	}
}
/*
javac Main.java

java Main -h  Tushar
Hello  Tushar

java Main -b  Tushar
*/