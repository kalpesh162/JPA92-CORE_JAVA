/*
Array Case 18: Replace Each Element with First Digit
WAP to replace each elements with their first digit of element
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}

int firstDigit(int num){
	
     while(num>9) 
     num=num/10;

 return num;
}

void replaceFirstDigit(int arr[]){
	
	for(int i=0;i<arr.length;i++){
	     arr[i]=firstDigit(arr[i]);
	}

}
--------------------------------------------------






*/

public class Example18{
	


static int firstDigit(int num){	
	     while(num>9) 
	     num=num/10;

	 return num;
}

static void replaceFirstDigit(int arr[]){
	
for(int i=0;i<arr.length;i++){
	     arr[i]=firstDigit(arr[i]);
	}

}

static void displayArray(int A[]){
     for(int i=0;i<A.length;i++)
     	System.out.println(A[i]);
}

public static void main(String[] args) {
		
   int A[]={123,235,6754,3257,64,2367,288,35,645,374};

   displayArray(A);

   replaceFirstDigit(A);

   System.out.println("OUTPUT ");

   displayArray(A);

	}
}