public class Person {
    
    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void Info() {

        System.out.println(name);
        System.out.println(age);
    }

    void setAge(int age) {

        this.age = age;
    }

    int getAge() {

        return age;
    }
}
