package Qone;

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