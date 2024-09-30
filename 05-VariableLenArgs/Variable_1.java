import java.util.Arrays;

public class Variable_1 {
    public static void main(String[] args) {
        sum(2,3,4,5,6,7,8,9,0,10);
        strr("kl","rs","vk","sd","dn");
    }
    
    public static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void strr(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
