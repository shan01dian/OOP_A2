public class Visitor extends Person{
    private String visitDate;//游客访问的日期
    private String visitType;//成人或者儿童

    public Visitor(){
        super();
        this.visitDate = "";
        this.visitType = "";
    }
    public Visitor(String name, int age, String contact,String visitDate, String visitType){
        super(name, age, contact);
        this.visitDate = visitDate;
        this.visitType = visitType;
    }
    public String getVisitDate() {
        return visitDate;
    }
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
    public String getVisitType() {
        return visitType;
    }
    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
    @Override
    public String toString() {
        return "Visitor{name='" + getName() + "', age=" + getAge() + ", contact='" + getContact() +
                "', VisitDate='" + visitDate + "', VisitType='" + visitType + "'}";
    }
}
