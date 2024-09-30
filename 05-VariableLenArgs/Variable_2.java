import java.util.Arrays;

public class Variable_2 {
    public static void main(String[] args) {
        
        args(10,20,40,50,670,78,9,0);
    }

    public static void args(int a , int b, int ...v){
        System.out.println(a + b + Arrays.toString(v));
    }
    
}
