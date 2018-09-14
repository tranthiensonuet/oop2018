package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String Name;
    private String ID;
    private String Group;
    private String Email;
    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    /**
     * Constructor 1
     */
    public Student() {
        // TODO:
        Name = "Student";
        ID = "000";
        Group = "INT22042";
        Email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     *
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        Name = n;
        ID = sid;
        Email = em;
        Group = "INT22041";
    }

    /**
     * Constructor 3
     *
     * @param s
     */
    public Student(Student s) {
        // TODO:
        Name = s.Name;
        ID = s.ID;
        Group = s.Group;
        Email = s.Email;
    }

    public String getInfo() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
