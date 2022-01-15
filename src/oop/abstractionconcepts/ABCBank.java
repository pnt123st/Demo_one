package oop.abstractionconcepts;

public class ABCBank extends Bank{

    /**
     implement abstract method loan()
     Now- loan() method is available in both parent and child class.
     This concept is call method overriding. Biggest advantage of
     abstract class is that child class don't need to define methods
     available in parent/abstract class. Child class have access/inherits
     parent class properties.
     pare
     */
    public void loan(){
        System.out.println("Interest rate is 5% ");
    };


}
