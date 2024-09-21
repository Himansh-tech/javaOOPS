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

// import java.util.*;
// class Person{

//     //making data variables as private to insure Encapsulation
//     private String name="Akasha";
//     private int age=21;
    
//     //constructor is added here 
//     public Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
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
//         Person person1 = new Person("Harsh",15);

//         System.out.println(person1.getName());
//         System.out.println(person1.getAge());

//         person1.setName("Himanshu");
//         person1.setAge(22);

//         System.out.println(person1.getName());
//         System.out.println(person1.getAge());

//     }
// }

// // Harsh
// // 15
// // Himanshu
// // 22



// // Without Constructor: The default constructor initializes the object with default values of "Akasha" and 21. The getter methods return these values.
// // With Constructor: The constructor initializes the object with values provided when creating the object. These values override the default ones. 
// // When you call the getter methods, they return the values set by the constructor or any changes made by setter methods.




//below is my example of encapsulation where I have used getter and setter to get and set the private varialbles outisde the class which actually can't be accessed from outside

// import java.util.*;

// class Encap1{
//     private String name = "Akasha";
//     private int age = 21;

//     //get Methods
//     public void getterName(){
//         System.out.println(this.name);
//     }
//     public void getterAge(){
//         System.out.println(this.age);
//     }

//     //set Methods

//     //here i made this method private so it can't be accessed outside the class.
//     // now to access it there are two ways 
//     //1) make it public
//     //2) use a public methods to and call this private method in that public method which i have done below

//     private void setterName(String nam){
//         name = nam;
//     }
//     public void setname(String nam){
//         setterName(nam);
//     }
//     public void setterAge(int ag){
//         age = ag;
//     }
// } 

// public class Encap {

//     public static void main(String args[]){
//         Encap1 cap = new Encap1();
//         cap.getterAge();
//         cap.getterName();

//         cap.setname("Himanshu");
//         cap.setterAge(22);

//         cap.getterAge();
//         cap.getterName();
//     }
// }


//in java top level class can't be private they can either be public or package private(default) 
//while other classes that is sub classes can be private

    import java.util.*;

    class priClass{
        private class subPriClass{
            public int sum(int a, int b){
                return a+b;
            }
        }
        public void execute(){
            subPriClass add = new subPriClass();
            System.out.println(add.sum(5,3));
        }

    }

public class Encap {

    public static void main(String[] args) {
        priClass pri = new priClass();
        pri.execute();
        
    }
}