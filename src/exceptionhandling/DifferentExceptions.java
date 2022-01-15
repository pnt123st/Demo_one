package exceptionhandling;

public class DifferentExceptions {

    public static void main(String[] args) {
        DifferentExceptions de = new DifferentExceptions();
        de.doDivision(100, 0);
    }

    public void doDivision(int number1, int number2){
        /**
         Note:
         Sometimes we don't know what types of exception our code will throw.
         So, we can use different types of exception for a try block as follows:
         */
        try {
            int num1 = number1;
            int num2 = number2;
            int division = number1/number2;
            System.out.println(division);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e1){
            System.out.println("Null Pointer Exception");
        }catch (IndexOutOfBoundsException e2){
            System.out.println("Index Out of bound Exception");
        }

    }
}
