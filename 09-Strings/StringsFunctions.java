import java.util.Arrays;

public class StringsFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.indexOf('l'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String na = "kunal Verma";
        System.out.println(Arrays.toString(na.toCharArray()));
        System.out.println(Arrays.toString(na.split(" ")));

        String nu = "     okay" ;
        System.out.println(nu.strip());
        System.out.println(nu.trim());
    }
    
}
