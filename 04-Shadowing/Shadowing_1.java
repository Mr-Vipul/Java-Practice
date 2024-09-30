public class Shadowing_1 {
    static int x  = 20;
    public static void main(String[] args) {
        
        System.out.println(x);

        int x = 40;
        System.out.println(x);

        check();
    }
    
    static void check(){
        System.out.println(x);
    }
}
