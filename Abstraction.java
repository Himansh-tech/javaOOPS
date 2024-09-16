
//Abstraction

//Abstraction focuses on hiding the complex implementation details and showing only the essential features of an 
//object. It allows us to work with complex systems in a simpler way. In Java, abstraction is achieved using abstract classes or interfaces.

                            
                            // Abstract Classes and Methods
// Abstract Classes:

// An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body) that must be implemented by subclasses.
// Abstract Methods:

// An abstract method is a method declared without an implementation. Subclasses that extend the abstract class must provide implementations for all abstract methods.

import java.util.*;


//we can't create an instance of the abstract class you can only inherit them so "Vehicle veh = new Vehicle()" is not allowed
abstract class Vehicle{

    //abstarct method(They don't have body)
    abstract void start();

    //non-abstract method
    void stop(){
        System.out.println("vehicle stopped");
    }
}

class Car extends Vehicle{

    //since we always have to implement all abstract classes of superclass 
    void start(){
        System.out.println("we are inside car");
    }
}
class Bike extends Vehicle{

    //since we must always impleemnt all abstract method of super class
    void start(){
        System.out.println("bike start");
    }

    void stop(){
        System.out.println("we are inside bike");
    }
}


//NOTICE IN ABOVE CODE WE FOR EVERY SUBCLASS THAR WE INHERITATED FROM SUPERCLASS WE CALLED THE ABSTRACT FUNCTION INSIDE IT

//, if a subclass extends an abstract superclass, it must provide implementations for all abstract methods defined in the superclass.

public class Abstraction {
    public static void main(String[] args) {

        //not alowed since we can't make instance of abstract class
        // Vehicle veh = new Vehicle();
        // veh.start();

        Car car = new Car();
        car.start();

        Bike bike  = new Bike();
        bike.start();
    }    
}
