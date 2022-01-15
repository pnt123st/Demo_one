package exceptionhandling;

public class ExceptionHandlingUsingThrows {

    public static void main(String[] args) {
        ExceptionHandlingUsingThrows eh = new ExceptionHandlingUsingThrows();
        eh.doDivision(500, 5);//return correct output
        eh.doDivision(500, 0);//return ArithmeticException
    }
    //non return type parameterized method
    public void doDivision(int number1, int number2) throws ArithmeticException{
        int num1 = number1;
        int num2 = number2;
        int division =  number1/number2;
        System.out.println("Division result is : " + division);
        throw new ArithmeticException();//invoke an exception explicitly
    }
}
