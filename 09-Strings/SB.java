
public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        System.out.println(builder);

        builder.deleteCharAt(0);

        builder.reverse();
        System.out.println(builder);
        }
    
}
