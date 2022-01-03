package exceptionhandling;

public class UsesOfExceptionHandling {

    public static void main(String[] args) {
/*        //ArithmeticException
        int num1=10;
        int num2=0;
        int division=num1/num2;
        System.out.println(division);*/
     //approach to handle this exception
        try {
            int num1=10;
            int num2=0;
            int division=num1/num2;
            System.out.println(division);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("This is Arithmetic Exception");
        }

    }
}
