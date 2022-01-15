package oop.abstractionconcepts;

/**
 Note: structure of an Abstract class is as follows:
 */
public abstract class Bank {

    //abstract method
    public abstract void loan();

    //non-abstract method/regular method
    public void credit(){
        System.out.println("Bank issues credit for customers");
    }

    public void debit(){
        System.out.println("Bank issues debit for customers");
    }


}
