import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface{
    private String rideName;//设备名称
    private boolean isOpen;//布尔值判断设施是否开启
    private Employee operator;//Employee类型，操作员
    private Queue<Visitor> waiting;//等待队列
    private LinkedList<Visitor> rideHistory;//游玩历史记录

    public Ride(){
        this.rideName = "";
        this.isOpen = false;
        this.operator = null;
        this.waiting = new LinkedList<>();//初始化队列
        this.rideHistory = new LinkedList<>();//初始化历史记录
    }
    public Ride(String rideName, boolean isOpen, Employee operator){
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
        this.waiting = new LinkedList<>();//初始化队列
        this.rideHistory = new LinkedList<>();//初始化历史记录
    }
    public String getRideName(){
        return this.rideName;
    }
    public boolean getIsOpen(){
        return this.isOpen;
    }
    public Employee getOperator(){
        return this.operator;
    }
    public void setRideName(String rideName){
        this.rideName = rideName;
    }
    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    public void setOperator(Employee operator){
        this.operator = operator;
    }
    @Override
    public void addVisitorToQueue(Visitor visitor){
        if(visitor==null){
            System.out.println("Unable to add null number of visitors");
            return;
        }
        waiting.add(visitor);
        System.out.println(visitor.getName()+" is added"+rideName+" to waiting");
    }//添加游客到队列

    @Override
    public Visitor removeVisitorFromQueue() {
        if(waiting.isEmpty()){
            System.out.println("Unable to remove null visitor");
            return null;
        }
        Visitor removedVisitor = waiting.poll();
        System.out.println(removedVisitor.getName()+"Has been removed from the wait queue for" + rideName + ".");
        return removedVisitor;
    }//从队列中删除游客

    @Override
    public void printQueue() {
        if(waiting.isEmpty()){
            System.out.println("Cannot print if queue is null");
            return;
        }
        System.out.println(rideName + "Current wait queue:");
        int position=0;
        for(Visitor visitor : waiting){
            System.out.println(//visitor.getName()
                     +position+":"+visitor);
            position++;
        }
    }//打印等待序列

    @Override
    public void runOneCycle() {

    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if(visitor==null){
        System.out.println("Unable to add null visitor");
        return;
            }
        rideHistory.add(visitor);
        System.out.println(visitor.getName()+" Added" + rideName + " to the play history.");
    }//将游客添加到历史记录

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if(visitor==null){
            System.out.println("It is not possible to check whether a null tourist is in the history.");
            return false;
        }
        boolean exists = rideHistory.contains(visitor);
        if(exists){
            System.out.println(visitor.getName()+" Is already in the play history of" + rideName + ".");
        }else {
            System.out.println(visitor.getName()+" Is not in the play history of" + rideName + ".");
        }
        return exists;
    }// 检查游客是否在游玩历史记录中

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println(rideName + "has " + count + " visitors in its history.");
        return count;
    }// 获取游玩历史记录中游客的数量

    @Override
    public void printRideHistory() {
        if(rideHistory.isEmpty()){
            System.out.println("Cannot print if there is no ride history");
            return;
        }
        System.out.println(rideName + " Current ride history:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString(){
        String operatorInfo = (this.operator != null) ? this.operator.toString() : "No operator";
        return "Ride{rideName='" + rideName + "', isOpen=" + isOpen + ", operator=" + operatorInfo + "}";
    }
}
