import  java.util.List;
import  java.util.ArrayList;
public class Example03 {

    public static void main(String[] args) {
        //List<Integer>numbers=new ArrayList<>(1000);    
        List<Integer>numbers=new ArrayList<>();    // 10 capacity
        System.out.println(numbers.isEmpty());

        for(int i=1;i<=20;i++)
            numbers.add(i);

        System.out.println(numbers.size());

        System.out.println(numbers);
        
       // in arraylist insert element and remove element lead to shifting elements 
       // that leads to decrease performance


    }
    
}
