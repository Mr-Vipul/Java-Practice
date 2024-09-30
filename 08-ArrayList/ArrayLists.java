
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);
    }
    
}
