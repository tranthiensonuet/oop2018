package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String Name;
    private String ID;
    private String Group;
    private String Email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return Name;
    }
    public void setName(String n){
        n = Name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String n){
        n = ID;
    }
    public String getGroup(){
        return Group;
    }
    public void setGroup(String n){
        n = Group;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String n){
        n = Email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        Name = "Student";
        ID = "000";
        Group = "INT22041";
        Email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        Name = n;
        ID = sid;
        Email = em;
        Group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        Name = s.Name;
        ID = s.ID;
        Group = s.Group;
        Email = s.Email;
    }

    public void getInfo() {
        // TODO:
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Group: " + getGroup());
        System.out.println("Email: " + getEmail());
    }
}
