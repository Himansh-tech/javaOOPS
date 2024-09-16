import java.util.*;
class Person{

    //making data variables as private to insure Encapsulation
    private String name="Akasha";
    private int age=21;

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
        Person person1 = new Person();

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        person1.setName("Himanshu");
        person1.setAge(22);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}



