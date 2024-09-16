// import java.util.*;
// class Person{

//     //making data variables as private to insure Encapsulation
//     private String name="Akasha";
//     private int age=21;

//     //using getter and setter fuction to access and modify the data members

//     public String getName(){
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }
// }
// public class Encap{
//     public static void main(String[] args) {
//         Person person1 = new Person();

//         System.out.println(person1.getName());
//         System.out.println(person1.getAge());

//         person1.setName("Himanshu");
//         person1.setAge(22);

//         System.out.println(person1.getName());
//         System.out.println(person1.getAge());

//     }
// }

// o/p is:
// Akasha
// 21
// Himanshu
// 22



//When a constructor is defined, it takes priority and overrides any default values that you might have initialized in the class. 

import java.util.*;
class Person{

    //making data variables as private to insure Encapsulation
    private String name="Akasha";
    private int age=21;
    
    //constructor is added here 
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //using getter and setter fuction to access and modify the data members

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class Encap{
    public static void main(String[] args) {
        Person person1 = new Person("Harsh",15);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        person1.setName("Himanshu");
        person1.setAge(22);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}

// Harsh
// 15
// Himanshu
// 22



// Without Constructor: The default constructor initializes the object with default values of "Akasha" and 21. The getter methods return these values.
// With Constructor: The constructor initializes the object with values provided when creating the object. These values override the default ones. 
// When you call the getter methods, they return the values set by the constructor or any changes made by setter methods.


