import java.util.Scanner;

public class Input {
    public static void main(String[]args){

        // Int Input
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();

        // String Input 
        Scanner scr  = new Scanner(System.in);
        String strr = scr.nextLine();

        // Float Input 
        Scanner flo  = new Scanner(System.in);
        Float f = flo.nextFloat();

        // Double Input
        Scanner db  = new Scanner(System.in);
        Double d = db.nextDouble();

        // Char Input 
        Scanner ch = new Scanner(System.in);
        char c = ch.next().charAt(0);

        // Boolean Input
        Scanner boo = new Scanner(System.in);
        boolean b = boo.nextBoolean();

        //short
        Scanner sh = new Scanner(System.in);
        short s = sh.nextShort();

        //long
        Scanner lo = new Scanner(System.in);
        long l = lo.nextLong();
    }
}
