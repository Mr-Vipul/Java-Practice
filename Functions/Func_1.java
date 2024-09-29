package Functions;

import java.util.Scanner;

public class Func_1 {
    public static void main(String[] args){
        // sum();
        // float ans = sum2();
        // System.out.println(ans);

        System.out.println("Final Sum value is :" + sum2());
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a  = sc.nextInt(); 

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt() ; 

        int result = a+b ; 
        System.out.println(result);
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a  = sc.nextInt(); 

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt() ; 

        int result = a+b ; 

        return result;

    }
    
}