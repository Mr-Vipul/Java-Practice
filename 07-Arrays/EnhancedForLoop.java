import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

        System.out.println("Below Is printed using optimized for loop");
        for (int i:arr){
            System.out.print(i + " ");
        }

    }
    
}
