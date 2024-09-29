public class IfElse {
    public static void main(String[] args) {
        int age = 18;

        //If-else
        if( age>=18){
            System.out.println("You can Vote");
        }else{
            System.out.println("You cant Vote");
        }

        //If else-if else

        if(age>18){
            System.out.println("You can Vote");
        }else if (age==18) {
            System.out.println("You can only vote if you have made your Voter Card"); 
        }else{
            System.out.println("You can'nt Vote");
        }

    }
    
}
