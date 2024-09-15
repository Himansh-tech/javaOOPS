// Inheritance provides the foundation for polymorphism by allowing classes to be organized in a hierarchical relationship.

/*
Polymorphism
Imagine a Swiss Army knife:

Polymorphism is like having a Swiss Army knife that can adapt to different tasks. Depending on which tool you need (screwdriver, knife, bottle opener), the knife changes its function.
In programming, polymorphism allows objects to be treated as instances of their parent class rather than their actual class. It enables a single interface (method) to be used for different underlying forms (objects).

Inheritance
Imagine you have a family tree:

Inheritance is like inheriting traits from your family. For example, you might inherit your parents' eye color or their talent for playing music.
In programming, inheritance means a new class (like you) inherits attributes and behaviors from an existing class (like your parents). This helps reuse code and organize it better.
  */


//Inheritance is about creating a new class from an existing class, inheriting its features.
//Polymorphism is about using a common interface (method) to interact with different types of objects and adapt their behavior.





                                                                        // Inheritance

//one class (called the derived class or subclass) inherits the properties and behaviors (methods and fields) of another class (called the base class or superclass).
//This allows code reuse and extension, enabling developers to build upon existing code without rewriting it.

//here two classes can have every methid and variable same to same and it does not cause any problem until the name of classes arw different
/*
Key Concepts in Inheritance:
* Base Class (Superclass): The class that provides its properties and methods to other classes.
* Derived Class (Subclass): The class that inherits properties and methods from the base class.
* extends Keyword: In Java, the extends keyword is used to establish a relationship where one class inherits another.
* Reusability: Inheritance promotes code reusability by allowing subclasses to use or override methods and properties from the base class.
* IS-A Relationship: Inheritance represents an "IS-A" relationship, meaning that a subclass is a specialized version of a superclass (e.g., a Dog IS-A Animal).
*/

//Type of Inheritance

//1) Single Inheritance: A class inherits from one base class.

import java.util.*;

//super or base class
class shape{
    public void area(){
        System.out.println("Area of shape");
    }
}

//sub or derived class
class triangle extends shape{
    public void area(int h, int b){
        System.out.println("Area of Triangle is "+0.5*h*b);
    }
}

public class Solution {
    public static void main(String[] args) {
        //instance of class triangle
        triangle shp = new triangle();
        shp.area(3,4);
    }
}

//op is:
//Area of Triangle is 6.0


//if i make above both class static and functions static i can access them directly without making instance of those classes

//example

import java.util.*;
public class Solution {
    
    static class shape{
        public static void area(){
            System.out.println("Area of shape");
        }
    }

    static class triangle extends shape{
        public static void area(int h, int b){
            System.out.println("Area of Triangle is "+0.5*h*b);
        }
    }
    public static void main(String[] args) {
        
        shape.area();
        triangle.area(3,4);
    }
}

//op is: 
//Area of shape
//Area of Triangle is 6.0



// (2) Hierarchical Inheritance: Multiple classes inherit from the same base class.

import java.util.*;
//super class
class shape{
    public void area(){
        System.out.println("Area of shape");
    }
}

//sub class 1 triangle
class triangle extends shape{
    public void area(int h, int b){
        System.out.println("Area of Triangle is "+0.5*h*b);
    }
}

//sub class 2 circle
class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Solution {
    public static void main(String[] args) {

        //instance for circle class
        circle cr = new circle();
        cr.area(3);


        //instance for traingle class
        triangle tr = new triangle();
        tr.area(3,4);
        
    }
}

//op is:
//Area of circle is 28.259999999999998
//Area of Triangle is 6.0



//it still works even if we inherit circle form triangle or inherit triagle from circle just one of them must be inherating the super class 
//and order does not matter we can keep the class which is inherating the super class in end also.

//(above thing is called as multilevel inheritance)


//exmaple:

import java.util.*;

class shape{
    public void area(){
        System.out.println("Area of shape");
    }
}

class triangle extends circle{
    public void area(int h, int b){
        System.out.println("Area of Triangle is "+0.5*h*b);
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
}

public class Solution {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.area(3);

        triangle tr = new triangle();
        tr.area(3,4);
    }
}

//op is:
//Area of circle is 28.259999999999998
//Area of Triangle is 6.0


//but is do it like circle inherit from triangle and trinagle inherit from circle and none of them actually inherit from super class then it will give cyclic inheritance error



//(3) Multilevel Inheritance: A class is derived from another derived class.

//example

import java.util.*;

class shape{
    public void area(){
        System.out.println("Area of shape");
    }
}

//triangle inherits form shape 
class triangle extends shape{
    public void area(int h, int b){
        System.out.println("Area of Triangle is "+0.5*h*b);
    }
}

//and circle inherits form triangle
class circle extends triangle{
    public void area(int r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
}

public class Solution {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.area(3);

        triangle tr = new triangle();
        tr.area(3,4);
    }
}

//op is:
//Area of circle is 28.259999999999998
//Area of Triangle is 6.0


//(4) Hybrid Inheritance: A combination of multiple inheritance types (e.g., hierarchical and multilevel).

/*
Key Benefits of Inheritance:

* Code Reusability: Methods and fields defined in the base class are available to all derived classes, avoiding code duplication.
* Code Maintenance: Changes made to the base class automatically affect all derived classes, making it easier to maintain the code.
* Extensibility: A subclass can add new methods and fields or modify existing behaviors by overriding base class methods.
* Polymorphism: Inheritance is key to achieving polymorphism, where a subclass can be treated as an object of the superclass, allowing for dynamic method dispatch.
*/


//Multiple Inheritance (x)
//Java doesn't support multiple inheritance directly (i.e., a class cannot inherit from more than one class) due to the "diamond problem," 
//but this can be achieved using interfaces.


