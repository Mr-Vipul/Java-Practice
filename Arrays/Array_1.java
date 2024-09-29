package Arrays;

public class Array_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,90};
        System.out.println(arr); // It will print address
        System.out.println("Element at first index: " + arr[0]); //Printing through Indexing
        

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); //Printing through For Loop
        }
    }
    
}
