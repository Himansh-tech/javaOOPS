// 1) Simple thigs like instance variable and instance methods and "this" keyword

import java.util.*;
class Animal{

    int legs=4; //instance variable 

    // Variables inside the class are called as instance variable and if they are not intialized they takes default value for different data types as follows
    // int, short, byte, long → 0
    // float, double → 0.0
    // char → 
    //String -> null
    // boolean → false

    //instance method 
    public void walk(int legs){
        System.out.println(this.legs);                  //will print "4" because this keyword is used to refer to the current object's instance variable or method.
        System.out.println(legs);                       //will print 5 cause it will refer to the local variable

    //while writing methods even if you mention different variable in method intialization and use the same instance variable with this keyword it will work and print the instance variables' content
  }
}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}



//if you use differet variable name in "instance method declaration" and "printing" then if you are printing instance variable it will be printed else it will show error
//example

// (1)
import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int legs){
        System.out.println(legs);                          //4 is printed since varible inside instance method and while printing are same
    }

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}


// (2)

import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int per){
        System.out.println(legs);                  //4 is printed since variable inside instance method and while printing are not same and while printing we are using instance variable           
    }

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}

// (3)
import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int per){
        System.out.println(this.legs);             //again 4 is printed that is same as instance variable
    }

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}

// (4)
import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int per){
        System.out.println(this.per);          //error cannot identify varible per
    }

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}

// (5)
import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int legs){
        System.out.println(per);               //error cannot find variable per
    }

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}

// (6)
import java.util.*;
class Animal{

    //instance variable 
    int legs=4; 

    //instance method 
    public void walk(int per){
        System.out.println(per);                     // 5 is printed since both variable in instance method and while printing are same the local varible is printed
    }  

}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
    }
}












                                                                          
                                                                           **//polymorphism** 


// 1) Compile time polymorphism 

// Method overloading 

// Compile-Time Polymorphism (Static Polymorphism):
// Method Overloading: This occurs when multiple methods have the same name but different parameter lists (either in number, types, or both).
// At compile-time, Java determines which method to call based on the method signature.


//Example 

import java.util.*;
class Animal{

    //instance variable 
    int legs; 
    String color;

    //instance method 1
    public void walk(int legs){
        System.out.println(legs);
    }

    //instance method 2
    public void walk(String color){
        System.out.println(color);
    }

    //instance method 3
    public void walk(String color, int legs){
        System.out.println(color + " "+legs);
    }

    //above are three instance method with same name but same different signature this is called as method overloading and is compile time polymorphism  
}
public class Solution {    
    public static void main(String[] args) {
       
        Animal cow = new Animal();
        cow.walk(5);
        cow.walk("red");
        cow.walk("blue",100);

        //o/p is:
        //5
        //red
        //blue 100
    }
}


2) Run time polymorphism

//method overriding

//Method Overriding: This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
//At runtime, the actual method that is invoked depends on the object type, not the reference type.

//Example

import java.util.*;
//super class
class Animal{
    public void sound(){
        System.out.println("Animals Sound");
    }
}

//sub class 1
class Lion extends Animal{
    
    public void sound(){
        System.out.println("Roar");
    }
}

//sub class 2
class Dog extends Animal{
    @Override                                        //we can give or not give @Override notation
    public void sound(){
        System.out.println("Bark");
    }
}

public class Solution {    
    public static void main(String[] args) {

        Animal lion = new Lion();     //superclass reference can be used to refer to an object of a subclass
        lion.sound();

        Animal dog = new Dog();
        dog.sound();

    //o/p:
    //Roar
    //Bark
    }
}



//below there is method overriding but i am makind object of samme class they belongs and it works fine
import java.util.*;

//super class
class Animal{

    public void sound(){
        System.out.println("Animals Sound");
    }
}

//sub class 1
class Lion extends Animal{
    
    public void sound(){
        System.out.println("Roar");
    }
}

//sub class 2
class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
}

public class Solution {    
    public static void main(String[] args) {
       
        Animal animal = new Animal();
        animal.sound();

        Lion lion = new Lion();
        lion.sound();

        Dog dog = new Dog();
        dog.sound();


    //o/p:
    //Animals Sound
    //Roar
    //Bark
    }
}



// Difference Between Compile-Time and Runtime Polymorphism:

// Feature	                        Compile-Time Polymorphism	                Runtime Polymorphism

// Achieved Through	               Method Overloading	                      Method Overriding
// Binding Time	                  Compile-time	                            Runtime
// Flexibility	                  Less Flexible	                            More Flexible
// Efficiency	                    More Efficient	                          Less Efficient (due to runtime binding)
// Example	                      Calling overloaded methods	               Calling overridden methods

