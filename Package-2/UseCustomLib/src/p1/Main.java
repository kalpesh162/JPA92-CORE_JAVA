package p1;
import com.mylib.MathUtils;

public class Main{

	public static void main(String[] args) {
		System.out.println("Addition: " + MathUtils.add(10, 5));
        System.out.println("Subtraction: " + MathUtils.subtract(10, 5));
        System.out.println("Multiplication: " + MathUtils.multiply(10, 5));
        System.out.println("Division: " + MathUtils.divide(10, 5));
	}
}