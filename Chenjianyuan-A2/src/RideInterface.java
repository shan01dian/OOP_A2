public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);// 添加游客到队列

    Visitor removeVisitorFromQueue();// 从队列中移除游客

    void printQueue();//  打印队列

    void runOneCycle(); // 运行游乐设施一次循环

    void addVisitorToHistory(Visitor visitor);//  将游客添加到游玩历史记录

    boolean checkVisitorFromHistory(Visitor visitor);//  检查游客是否在历史记录中

    int numberOfVisitors(); //  获取游玩历史记录中游客的数量

    void printRideHistory();//  打印游玩历史记录
}
