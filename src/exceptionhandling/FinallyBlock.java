package exceptionhandling;

public class FinallyBlock {

    public static void main(String[] args) {
        FinallyBlock fb = new FinallyBlock();
        fb.doDivision(100, 5);
    }
    public void doDivision(int number1, int number2){
        try {
            int x = 200;
            int y = 0;
            int divisionResult = x/y;
            System.out.println("Division Result is : " + divisionResult);
            System.out.println("---------------------------------------------");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e1){
            System.out.println("it's Null Pointer Exception");
        }finally {
            System.out.println("We are in the finally block.");
            int num1 = number1;
            int num2 = number2;
            int divisionResult = number1/number2;
            System.out.println("Division Result is : " + divisionResult);
        }


    }
}
