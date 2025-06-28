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


