import java.util.Arrays;

public class basic_1 {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        System.out.println(students);
        System.out.println(Arrays.toString(students));

        // Student kunal;
        // System.out.println(kunal);


        // Giving null values for not initialized values
        Student kunal = new Student();
        System.out.println(kunal);
        System.out.println(kunal.rollNo);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);
        
    }
    
}

class Student{
    int rollNo;
    String name; 
    float marks; 
}
