import java.util.ArrayList;
import java.util.Scanner;

public class Array2DList {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner intt = new Scanner(System.in);

        for(int i =0; i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i<3;i++){
            for(int j=0; j<3; j++ ){
                list.get(i).add(intt.nextInt());
            }
        }
        
    }
}
