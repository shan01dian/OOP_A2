
public class AssignmentTwo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        Person person2 = new Person("soyo",16,"1145141919");
        System.out.println(person2);
        Employee employee1 = new Employee();
        System.out.println(employee1);
        Employee employee2 = new Employee("nina",18,"12345678","Manager","114514");
        System.out.println(employee2);
        Visitor visitor1 = new Visitor();
        System.out.println(visitor1);
        Visitor visitor2 = new Visitor("anno",20,"1290380933","2024-10-10","Adult");
        System.out.println(visitor2);
    }
}