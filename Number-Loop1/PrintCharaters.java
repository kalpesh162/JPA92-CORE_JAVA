public class PrintCharaters{
	public static void main(String[] args) {
			
			char letter='a';
			int cnt=1;
			while(letter<='z'){
				System.out.print(letter +"  ");
				if(cnt%5==0)
					System.out.println();

				 letter++;
				 cnt++;
			}


	}
}