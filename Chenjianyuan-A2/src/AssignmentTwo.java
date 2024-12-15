
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
        Employee employee3 = new Employee("saki",18,"18765432","Thunderstorm operator","1919810");
        System.out.println(employee3);
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
        Ride ride3 = new Ride(" Thunderstorm", true, employee3,4);
        System.out.println(ride3);
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFourA(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFourB(ride1, visitor1, visitor2, visitor3, visitor4, visitor5);
        assignment.partFive(ride1, visitor1, visitor2, visitor3, visitor4, visitor5,visitor6,visitor7,visitor8,visitor9,visitor10);
        assignment.partSix(ride3, visitor1, visitor2, visitor3, visitor4, visitor5);
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
    public void partSix(Ride ride, Visitor visitor1, Visitor visitor2, Visitor visitor3, Visitor visitor4, Visitor visitor5){
        System.out.println("\n Part6");

        ride.clearRideHistory();// 清空历史记录，避免重复添加
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);// 添加游客到游玩历史记录
        System.out.println("\nExport the following visitors to a file:");
        ride.printRideHistory(); // 打印所有历史记录游客

        String filename = "ride_history.csv";
        ride.exportRideHistory(filename);// 将数据导出到文件
    }
    public void partSeven(){
    }
}