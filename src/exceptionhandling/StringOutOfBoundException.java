package exceptionhandling;

public class StringOutOfBoundException {

    public static void main(String[] args) {
        String str = new String("Java is oop language.");
        System.out.println(str);

        System.out.println("Length of String is : " + str.length());
        //sub String
        System.out.println(str.charAt(0));


        System.out.println("------------Way to handle String Index Out Of Bounds Exception-------------");

        try {
            System.out.println(str.charAt(25));//StringIndexOutOfBoundsException
        }catch (Exception e){
            System.out.println("String Index Out Of Bounds Exception");
        }
    }
}
