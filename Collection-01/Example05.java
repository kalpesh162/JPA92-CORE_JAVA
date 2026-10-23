import  java.util.List;
import  java.util.ArrayList;
public class Example05 {
    public static void main(String[] args) {
            List<String>list1=new ArrayList<>();
            list1.add("book1");
            list1.add("book2");
            list1.add("book3");

            List<String>list2=new ArrayList<>();
            list2.add("book4");
            list2.add("book5");

            list1.addAll(list2);
            System.out.println("list1 --> "+list1);
            System.out.println("list2 --> "+list2);

            System.out.println("containsALl "+list1.containsAll(list2));

            list1.removeAll(list2);
            System.out.println("Update List 1 "+list1);

            //boolean retainAll(Collection)

    }
    
}
