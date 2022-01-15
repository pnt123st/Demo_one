package oop.abstraction;
/**
 Abstract class:
 In abstract class,
 --we can create complete methods
 --we can create abstract method
 --we can't create/declare an abstract method as private
 */
public abstract class NewCar {

    //complete method
    public void boostEngine(){
        System.out.println("Boost engine is enabled");
    }

    //abstract method: method without body
    public abstract void gpsSystem();
}
