
public class AssignmentTwo {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //System.out.println(person1);
        //Person person2 = new Visitor("soyo",16,"1145141919","2024-10-11","Child");
        //System.out.println(person2);
        Employee employee1 = new Employee();
        System.out.println(employee1);
        Employee employee2 = new Employee("nina",18,"12345678","Roller coaster operator","114514");
        System.out.println(employee2);
        Visitor visitor1 = new Visitor();
        System.out.println(visitor1);
        Visitor visitor2 = new Visitor("anon",20,"1290380933","2024-10-10","Adult");
        System.out.println(visitor2);
        Ride ride1 = new Ride("Roller Coaster", true, employee2);
        System.out.println(ride1);
        Ride ride2 = new Ride("Ferris Wheel", false, null);
        System.out.println(ride2);
    }
    public void partThree(){
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}