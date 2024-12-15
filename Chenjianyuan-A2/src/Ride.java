import java.io.BufferedReader;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Ride implements RideInterface{
    private String rideName;//设备名称
    private boolean isOpen;//布尔值判断设施是否开启
    private Employee operator;//Employee类型，操作员
    private Queue<Visitor> waiting;//等待队列
    private LinkedList<Visitor> rideHistory;//游玩历史记录
    private int maxRider;//每次循环最大乘客数量
    private int numOfCycles;//设施运行次数

    public Ride(){
        this.rideName = "";
        this.isOpen = false;
        this.operator = null;
        this.waiting = new LinkedList<>();//初始化队列
        this.rideHistory = new LinkedList<>();//初始化历史记录
        this.maxRider = 5;// 默认每次最多 5 人
        this.numOfCycles = 0;// 初始运行次数为 0
    }
    public Ride(String rideName, boolean isOpen, Employee operator,int maxRider){
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
        this.waiting = new LinkedList<>();//初始化队列
        this.rideHistory = new LinkedList<>();//初始化历史记录
        this.maxRider = maxRider;
        this.numOfCycles = 0;
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
        if(this.operator==null){
            System.out.println(rideName + " cannot run because no operator is assigned.");
            return;
        }//检查是否有操作员
        if (waiting.isEmpty()) {
            System.out.println(rideName + "cannot run because the wait queue is empty.");
            return;
        }// 检查队列是否为空
        int ridersToLoad = Math.min(maxRider, waiting.size());
        if(ridersToLoad<1){
            System.out.println(rideName + " won't work because there aren't enough visitors.");
            return;
        }
        System.out.println("\n" + rideName + "Starts a loop..." );
        for(int i=0; i<ridersToLoad; i++){
            Visitor visitor = waiting.poll();// 从队列中移除游客
            addVisitorToQueue(visitor); // 将游客添加到游玩历史记录
        }
        numOfCycles++; // 增加运行次数
        System.out.println(rideName + "Done! This run received "+ ridersToLoad +" tourists. ");

        }
        public int getNumOfCycles(){
            return numOfCycles;// 打印运行次数
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
    }// 打印游玩历史记录

    public void clearRideHistory(){
        rideHistory.clear();
        System.out.println("The play history for "+rideName +" has been cleared.");
    }// 清空历史记录

    public void sortRideHistory(){
        if(rideHistory.isEmpty()){
            System.out.println("Cannot sort if there is no ride history");
            return;
        }
        Collections.sort(rideHistory,new VisitorComparator(){});
        System.out.println(rideName+" Has been sorted by access date and type.");
    } // 新增方法：对游玩历史记录排序

    public void exportRideHistory(String filename) {
        if(rideHistory.isEmpty()){
            System.out.println("The history for "+ rideName + " is empty and cannot be exported.");
            return;
        }// 确保历史记录不为空
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filename))){
            for(Visitor visitor : rideHistory){
                String record =  visitor.getName() + "," + visitor.getAge() + "," + visitor.getContact() +
                        "," + visitor.getVisitDate() + "," + visitor.getVisitType();
                writer.write(record);// 遍历历史记录中的游客并写入文件
                writer.newLine();//换行
            }
            System.out.println("The play history for " +rideName + " has been successfully exported to the file:" + filename);
        }catch(IOException e){
            System.out.println("An error occurred exporting play history: " + e.getMessage ());
        }//将游玩历史记录（rideHistory）中的所有游客信息导出到一个 CSV 文件

    }
    public void importRideHistory(String filename) {
        try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
            String line;
            while ((line=reader.readLine())!=null){
                String[] details = line.split(",");// 使用逗号分隔符分割每一行
                if(details.length!=5){
                    System.out.println("Skip invalid lines: " + line);
                    continue;//跳过格式不正确的行
                }
                String name = details[0];
                int age = Integer.parseInt(details[1]);
                String contact = details[2];
                String visitDate = details[3];
                String visitType = details[4];
                Visitor visitor = new Visitor(name, age, contact, visitDate, visitType);
                rideHistory.add(visitor);// 添加到游玩历史记录
            }
            System.out.println(" Successfully imported play history from file "+ filename +"." );// 从文件中导入游玩历史记录
        }catch (IOException e){
            System.out.println("Error while reading file: " + e.getMessage ());//读取文件时报错
        }catch (NumberFormatException e){
            System.out.println("The data is in the wrong format and we can't parse the age: " + e.getMessage ());//数据格式报错
        }
    }

    @Override
    public String toString(){
        String operatorInfo = (this.operator != null) ? this.operator.toString() : "No operator";
        return "Ride{rideName='" + rideName + "', isOpen=" + isOpen + ", operator=" + operatorInfo + "}";
    }
}
