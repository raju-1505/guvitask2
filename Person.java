package Qone;//1.1 create class person with properties

 class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this.name = name;

        this.age = 18;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



public class PersonMain {
    public static void main(String[] args) {

        Person p1 = new Person("Dinesh");


        Person p2 = new Person("Raju", 25);

        System.out.println("Qone.Person 1 Details:");
        p1.display();

        System.out.println("\nQone.Person 2 Details:");
        p2.display();
    }
}
