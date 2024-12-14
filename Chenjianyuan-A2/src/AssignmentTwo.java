
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
        Visitor visitor0 = new Visitor();
        System.out.println(visitor0);
        Visitor visitor1 = new Visitor("anon",20,"1290380933","2024-10-10","Adult");
        System.out.println(visitor1);
        Visitor visitor2 = new Visitor("momok",18,"1290380234","2024-10-10","Child");
        System.out.println(visitor2);
        Visitor visitor3 = new Visitor("soyo",16,"1145141919","2024-10-11","Child");
        System.out.println(visitor3);
        Visitor visitor4 = new Visitor("tomo",21,"1293429044","2024-10-11","Adult");
        System.out.println(visitor4);
        Visitor visitor5 = new Visitor("tomotin",22,"1243242344","2024-10-11","Adult");
        Ride ride1 = new Ride("Roller Coaster", true, employee2);
        System.out.println(ride1);
        Ride ride2 = new Ride("Ferris Wheel", false, null);
        System.out.println(ride2);
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
    }

    private void partThree(Ride ride, Visitor visitor1, Visitor visitor2, Visitor visitor3, Visitor visitor4, Visitor visitor5) {
        System.out.println("\n Part3, Queue: " + ride.getRideName()+"\n");
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);//添加所有游客到队列
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