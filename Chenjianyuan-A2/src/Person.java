public class Person {
    private String name;
    private int age;
    private String contact;
    //三个适合个人的实例变量
    public Person() {
        this.name = "";
        this.age = 0;
        this.contact = "";
    }

    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    //添加了getter和setter
    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ", contact=" + contact + ")";
    }
}
