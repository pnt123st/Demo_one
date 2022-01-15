package exceptionhandling;

/*
Unwanted event is exception. By using try catch block
we can handle exception
*/

public class HandleException {

    public static void main(String[] args) {

//        int x = 500;
//        int y = 0;
//        int divisionResult = x/y;
//        System.out.println("Division result is : " + divisionResult);
//        //java.lang.ArithmeticException: / by zero

        try {
            int x = 500;
            int y = 0;
            int divisionResult = x/y;
            System.out.println("Division result is : " + divisionResult);
        }catch (Exception ex){
           //ex.printStackTrace();
            System.out.println("Exception Happen");
        }

    }
}
