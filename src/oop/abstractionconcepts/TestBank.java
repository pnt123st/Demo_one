package oop.abstractionconcepts;

public class TestBank {

    public static void main(String[] args) {

        ABCBank abcBank = new ABCBank();
        abcBank.credit();
        abcBank.debit();
        abcBank.loan();
        /**
         What we are going to abstract here?
         Hide some implementation logic.I defined a loan() method
         in my abstract class, but there is no implementation logic there.
         Implementation logic like- interest rate, pay of conditions etc.
         are defined in irrespective child class.
         */
        /**
         Dynamic Polymorphism:
         Through dynamic polymorphism, we can cal all the method as well.
         */
        Bank bank = new ABCBank();
        bank.credit();
        bank.debit();
        bank.loan();
    }
}
