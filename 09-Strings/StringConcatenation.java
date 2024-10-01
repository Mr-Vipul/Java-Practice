import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println('a'+'b');
        System.out.println('a'+1);
        System.out.println("a"+1);
        System.out.println(1+1);
        System.out.println('1');
        System.out.println("1"+"1");

        System.out.println("a" + new ArrayList<>());
        System.out.println('a'+3);
        System.out.println((char)('a'+1));

        //at least one string literal should be present to print non string objects or primitives
        System.out.println(new Integer(10) + "" +  new ArrayList<Integer>());
    }
    
}
