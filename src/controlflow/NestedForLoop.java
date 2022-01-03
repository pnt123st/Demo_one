package controlflow;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i ++){
//            System.out.println("We are in parent for loop");
//
//            for (int j = 0; j<3; j ++){
//                System.out.println("we are in Nested for loop");
//            }
//        }
        /**
         Problem: User will input numbers and your program will print as ROW basis
         The output will be as below:
         1
         12
         123
         1234
         12345
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = input.nextInt();
        //System.out.println("Number is " + num);

        for (int i =1; i<=num; i++){

            for (int j=1; j<=i; j++){
                System.out.println(" " +j);
            }
        }
        System.out.println(" ");
    }
}
