public class Example02 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2, d = 4;
        int result = a++ + --b * c-- - ++a + d++ + b - --d + c;
        System.out.println("Result: " + result);
    }
}