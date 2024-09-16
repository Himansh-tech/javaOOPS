import java.util.*;

//When you implement an interface in a subclass, the subclass is required to provide implementations for all the
//methods declared in the interface. However, the subclass can also define additional methods that are not part of the interface. 
//These additional methods are specific to the subclass and are not accessible through a reference of the interface type.


interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Start the car");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Start the bike");
    }

    public void stop(){
        System.out.println("Stop the bike");
    }
}

public class interfac {
    public static void main(String args[]){
        Vehicle car = new Car();
        car.start();

        Vehicle bike = new Bike();
        bike.start();
        //bike.stop();   using vehicle for object declaration so can't use methods which are not inside vehicle
        ((Bike)bike).stop(); // // To call the additional methods, you need to cast to the specific class
        

        Bike bike2 = new Bike();
        bike2.start();
        bike2.stop();
    }
}


// op is:
// Start the car
// Start the bike
// Stop the bike
// Start the bike
// Stop the bike