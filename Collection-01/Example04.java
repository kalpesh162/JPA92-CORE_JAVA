import  java.util.List;
import  java.util.ArrayList;
public class Example04 {
    public static void main(String[] args) {
        
        List<Integer>numbers=new ArrayList<>();    // 10 capacity
        System.out.println(numbers.isEmpty());

        for(int i=1;i<=20;i++)
            numbers.add(i);
        System.out.println(numbers.size());
        System.out.println(numbers);
        System.out.println("contains "+numbers.contains(11));

        // public boolean remove(E)
        System.out.println("remove --> "+numbers.remove(Integer.valueOf(5)));
        // List 
        // E	remove(int index)
        System.out.println("remove --> "+numbers.remove(5));

    }
    
}
