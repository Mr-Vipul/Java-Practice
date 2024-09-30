import java.util.ArrayList;

public class ArrayList_set {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(2,6);
        System.out.println(list);


    }
    
}
