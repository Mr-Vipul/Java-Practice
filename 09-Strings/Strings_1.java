
public class Strings_1 {
    public static void main(String[] args) {

        // Here The variable is pointing to the same object;
        String a = "Namastute";
        String b = "Namastute";
        System.out.println(a == b);


        // Here two different variables are poiting to two diff objects
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1 == name2);



        // It is comparing the value not the reference value is checking that they are pointing to same object or not 
        System.out.println(name1.equals(name2));
    }
    
}
