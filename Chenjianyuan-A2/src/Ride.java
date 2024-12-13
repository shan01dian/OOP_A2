public class Ride {
    private String rideName;//设备名称
    private boolean isOpen;//布尔值判断设施是否开启
    private Employee operator;//Employee类型，操作员

    public Ride(){
        this.rideName = "";
        this.isOpen = false;
        this.operator = null;
    }
    public Ride(String rideName, boolean isOpen, Employee operator){
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
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
    public String toString(){
        String operatorInfo = (this.operator != null) ? this.operator.toString() : "No operator";
        return "Ride{rideName='" + rideName + "', isOpen=" + isOpen + ", operator=" + operatorInfo + "}";
    }
}
