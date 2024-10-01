
public class StringPerformance {
    public static void main(String[] args) {

        // Here the new object is created again and again so space compl is O(N^2)
        // It is copying every iteration in new heap memory
        String strr = ""; 

        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);
            strr = strr  + ch ;
        }

        System.out.println(strr);
    }
    
}
