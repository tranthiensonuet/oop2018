package week1;



public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String group1 = s1.getGroup();
        String group2 = s2.getGroup();
        if (group1 == null || group2 == null)
            return false;
        else return (group1.equals(group2));
    }
    public static void studentsByGroup() {
        // TODO:
    }

    public static void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement st = new StudentManagement();
        //sinh vien 1
        st.students[0] = new Student();
        st.students[0].setName("Trần Thiên Sơn");
        st.students[0].setID("17021006");
        st.students[0].setGroup("INT22041");
        st.students[0].setEmail("17021006@vnu.edu.vn");
        System.out.println(st.students[0].getInfo());
        //sinh vien 2
        st.students[1] = new Student();
        System.out.println(st.students[1].getInfo());
        //sinh vien 3
        st.students[2] = new Student("Nguyen Van A", "17020001", "17021001@vnu.edu.vn");
        System.out.println(st.students[2].getInfo());
        //sinh vien 4
        st.students[3] = new Student(st.students[0]);
        System.out.println(st.students[3].getInfo());
        st.students[0].getInfo();
        //sinh vien 2
        st.students[1] = new Student();
        st.students[1].getInfo();
        //sinh vien 3
        st.students[2] = new Student("Nguyen Van A", "17020001", "17021001@vnu.edu.vn");
        st.students[2].getInfo();
        //sinh vien 4
        st.students[3] = new Student(st.students[0]);
        st.students[3].getInfo();
        st.students[1].setGroup("INT22042");
        students[2].setGroup("INT22041");
        st.students[3].setGroup("INT22042");
        if (st.sameGroup(st.students[1], st.students[2]))
            System.out.println("Cung lop");
        else
            System.out.printf("Khac lop");


    }
}
