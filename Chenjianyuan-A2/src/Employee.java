public class Employee extends Person {
    private String job;
    private String employeeID;

    public Employee(){
        super();
        this.job = "";
        this.employeeID = "";
    }
    public Employee(String name,int age,String contact,String job,String employeeID){
        super(name, age, contact);
        this.job = job;
        this.employeeID = employeeID;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    @Override
    public String toString() {
        String employee = super.toString() + ", job='" + job + "', employeeID='" + employeeID + "'";
        return employee;
    }
}
