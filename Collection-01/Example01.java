import java.util.ArrayList;
public class Example01 {
    public static void main(String[] args) {
            ArrayList list=new ArrayList();        
            list.add("Ramesh");
            list.add(11);  // Integer.valueOf(11);
            list.add(11.11);
            list.add(true);
            list.add(null);
            list.add('A');
            int num=100;
            list.add(num);
            list.add("Ramesh");
            list.add(11);  // Integer.valueOf(11);
            list.add(11.11);
            list.add(true);
            list.add(null);
            list.add('A');
            System.out.println(list);

    }
}
