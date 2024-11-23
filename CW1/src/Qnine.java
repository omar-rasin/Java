public class Qnine {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Harry", 17);
        p1.Info();

        Person p2 = new Person("Jake", 0);
        p2.setAge(12);
        System.out.println(p2.getAge());
    }
}
