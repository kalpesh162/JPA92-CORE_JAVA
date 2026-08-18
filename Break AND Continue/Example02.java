public class Example02{
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			if(i==5 || i==7)
				continue;
			 System.out.println(i);
		}
	}
}

/*
1
2
3
4
6
8
9
10
*/