
public class Overloading {
    public static void main(String[] args) {

        // In method overloading the function have the same name but parameters value is different
        sum(10,20);
        sum(10,20,40);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);

    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);

    }
}
