package controlflow;

import java.util.Scanner;

public class Problem_NestedForLoop {

    public static void main(String[] args) {
        /**
         Problem: User will input numbers and your program will print as ROW basis
         The output will be as below:
         1
         12
         123
         1234
         12345
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number");
        int rowNumber=input.nextInt();

        for(int i=1; i<=rowNumber; i++){

            for (int j=1; j<=i; j++){
                System.out.println(j+ " ");
            }
            System.out.println();
        }


    }
}
