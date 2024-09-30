public class Scoping_1 {
    public static void main(String[] args) {
        // 1.Method Scoping
        methodScoping();

        // 2.Loop Scoping
        int b = 19; 

        while (b>0){
            int age = 20;
            System.out.println(age);
            b--;
        }

        // System.out.println(age);

        
        
        // 3.Block Scoping 
        {
            int x = 10;
        }
        // System.out.println(x); // cannot be print as block scoping
    }

    static void methodScoping(){
        int a = 10;
        System.out.println(a); //Method Scoping
    }    
}
