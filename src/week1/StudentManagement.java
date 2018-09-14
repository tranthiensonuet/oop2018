package week1;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static Student students[] = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String group1 = s1.getGroup();
        String group2 = s2.getGroup();
        if (group1.equals(group2))
            return true;
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        students[0] = new Student();
        students[0].setName("Trần Thiên Sơn");
        students[0].setID("17021006");
        students[0].setGroup("INT2204");
        students[0].setEmail("17021006@vnu.edu.vn");
        System.out.println(students[0].getName());
        students[0].getInfo();

    }
}
