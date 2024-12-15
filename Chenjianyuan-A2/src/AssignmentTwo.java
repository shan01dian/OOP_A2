
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
        Visitor visitor5 = new Visitor("tomorin",22,"1243242344","2024-10-11","Adult");
        System.out.println(visitor5);
        Visitor visitor6 = new Visitor("saya",22,"1243242344","2024-10-10","Adult");
        Visitor visitor7 = new Visitor("rikki",17,"1432423444","2024-10-12","Child");
        Visitor visitor8 = new Visitor("rana",20,"15465464644","2024-10-12","Adult");
        Visitor visitor9 = new Visitor("rupa",21,"17899789784","2024-10-10","Adult");
        Visitor visitor10 = new Visitor("subaru",19,"1272547344","2024-10-11","Adult");
        Ride ride1 = new Ride(" Roller Coaster", true, employee2,2);
        System.out.println(ride1);
        Ride ride2 = new Ride("Ferris Wheel", false, null,0);
        System.out.println(ride2);

        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFourA(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFourB(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFive(ride1, visitor1, visitor2, visitor3, visitor4, visitor5,visitor6,visitor7,visitor8,visitor9,visitor10);
        assignment.partSix();
        assignment.partSeven();
    }



    private void partThree(Ride ride, Visitor visitor1, Visitor visitor2, Visitor visitor3, Visitor visitor4, Visitor visitor5) {
        System.out.println("\n Part3, Queue: " + ride.getRideName()+"\n");
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);//添加所有游客到队列

        System.out.println("\n Queue after adding visitors:");
        ride.printQueue();//打印当前队列

        System.out.println("\n Remove the first visitor from the queue:");
        ride.removeVisitorFromQueue();//从队列中删除第一个游客

        System.out.println("\n Print the queue after removing the first visitor from the queue:");
        ride.printQueue();

    }


    public void partFourA(Ride ride, Visitor visitor1, Visitor visitor2, Visitor visitor3, Visitor visitor4, Visitor visitor5){
        System.out.println("\n Part4A, Queue: " + ride.getRideName()+"\n");
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);//添加游客到游玩历史记录

        System.out.println("\nChecking if a visitor is in the ride history:");
        ride.checkVisitorFromHistory(visitor1);
        ride.checkVisitorFromHistory(new Visitor("unknown", 0, "0000000000", "2024-12-01", "Adult"));
        //检查游客是否在游玩历史记录当中

        System.out.println("\nNumber of visitors in the ride history:");
        ride.numberOfVisitors();//打印游玩历史记录中的游客数量

        System.out.println("\nPrinting all visitors in the ride history:");
        ride.printRideHistory(); // 打印所有游玩历史记录
    }
    public void partFourB(Ride ride, Visitor visitor1, Visitor visitor2, Visitor visitor3, Visitor visitor4, Visitor visitor5){
        System.out.println("\n Part4B, Queue: " + ride.getRideName()+"\n");

        ride.clearRideHistory();// 清空历史记录，避免重复添加

        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);// 添加游客到游玩历史记录

        System.out.println("\nPrinting ride history before sorting:");
        ride.printRideHistory();// 打印排序前的历史记录

        ride.sortRideHistory();// 对历史记录排序

        System.out.println("\nPrinting ride history after sorting:");
        ride.printRideHistory();// 打印排序后的历史记录
    }
    public void partFive(Ride ride, Visitor... visitors){
        System.out.println("\n Part5, Run a Ride Cycle for " + ride.getRideName() +"\n");

        for (Visitor visitor:visitors){
            ride.addVisitorToHistory(visitor);
        }// 添加游客到队列
        System.out.println("\n Print visitors in the queue: ");
        ride.printQueue(); // 打印当前队列

        System.out.println("\n Run the loop once: ");
        ride.runOneCycle(); // 运行一次循环

        System.out.println("\n print visitors in the queue after the run: ");
        ride.printQueue(); // 打印队列中剩余的游客

        System.out.println("\n print your play history: ");
        ride.printRideHistory(); // 打印游玩历史记录
    }
    public void partSix(){
        System.out.println("\n Part6");


        Employee employee3 = new Employee("saki",18,"18765432","Thunderstorm operator","1919810");
        System.out.println(employee3);

        Ride ride3 = new Ride(" Thunderstorm", true, employee3,4);
        System.out.println(ride3);
        //为part6新创建了ride
        Visitor visitor01 = new Visitor("DingZhen", 19, "128675933", "2024-10-10", "Adult");
        Visitor visitor02 = new Visitor("XueBao", 14, "12245734", "2024-10-11", "Child");
        Visitor visitor03 = new Visitor("SheLi", 15, "112353459", "2024-10-10", "Child");
        Visitor visitor04 = new Visitor("otto", 21, "16582625844", "2024-10-12", "Adult");
        Visitor visitor05 = new Visitor("SunXiaochuan", 26, "12404780784", "2024-10-12", "Adult");
        //part6新创建的visitor
        ride3.addVisitorToHistory(visitor01);
        ride3.addVisitorToHistory(visitor02);
        ride3.addVisitorToHistory(visitor03);
        ride3.addVisitorToHistory(visitor04);
        ride3.addVisitorToHistory(visitor05);// 添加游客到游玩历史记录
        System.out.println("\nExport the following visitors to a file:");
        ride3.printRideHistory(); // 打印所有历史记录游客

        String filename = "D:\\OOP_A2\\OOP_A2\\Chenjianyuan-A2\\ride_history.csv";
        ride3.exportRideHistory(filename);// 将数据导出到文件
    }
    public void partSeven(){
        System.out.println("\n Part7");
        Employee employee4 = new Employee("KohaD",18,"158943002","Swing set operator","987654");
        System.out.println(employee4);

        Ride ride4 = new Ride(" Swing set", true, employee4,4);
        System.out.println(ride4);//为part7创建新的ride

        String filename = "ride_history.csv";
        ride4.importRideHistory(filename); // 从文件中导入历史记录

        System.out.println("\n The number of visitors imported: "+ ride4.numberOfVisitors());//打印导入后的游客数量

        System.out.println("\nImport the visitor's information: ");
        ride4.printRideHistory(); // 打印导入后的所有游客信息

    }
}