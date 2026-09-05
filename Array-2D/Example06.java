import java.util.Arrays;
class Example06 {
	public static void main(String[] args) {
	
		int A[]={44,33,22,77,11,66,55,99,88};

		Arrays.sort(A);

		for(int ele : A)
			System.out.print(ele +" ");

		System.out.println();
		System.out.println(Arrays.toString(A));
	}	
}