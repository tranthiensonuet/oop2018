package week1;



public class StudentManagement {
    public static int limit = 5;
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
        boolean kt[] = new boolean[100];
        for (int i = 0; i < limit; i++)
            kt[i] = true;
        String str;
        for (int i = 0; i < limit - 1; i++)
        {
            if (students[i].getGroup() != null)
            {
                if (kt[i])
                {
                    System.out.println("Sinh vien thuoc lop " + students[i].getGroup() + " la: ");
                    for (int j = i; j < limit; j++)
                    {
                        if (kt[j] && students[i].getGroup().equals(students[j].getGroup()) && students[j] != null)
                        {
                            kt[j] = false;
                            System.out.println(students[j].getInfo());
                        }

                    }
                }
            }
        }

    }
    public static void removeStudent(String id) {
        // TODO:
        int i = 0;
        while (i < limit)
        {
            if (students[i].getID().equals(id))
            {
                for (int j = i; j < limit - 1; j++) {
                    students[j] = students[j + 1];
                }
                limit--;
            }
            else i++;
        }
        for (int j = 0; j < limit; j++)
            System.out.println(students[j].getInfo());
    }

    public static void main(String[] args) {
        // TODO:
        //sinh vien 1
        students[0] = new Student();
        students[0].setName("Trần Thiên Sơn");
        students[0].setID("17021006");
        students[0].setGroup("INT22041");
        students[0].setEmail("17021006@vnu.edu.vn");
        System.out.println(students[0].getInfo());
        //sinh vien 2
        students[1] = new Student();
        System.out.println(students[1].getInfo());
        //sinh vien 3
        students[2] = new Student("Nguyen Van A", "17020001", "17021001@vnu.edu.vn");
        System.out.println(students[2].getInfo());
        //sinh vien 4
        students[3] = new Student(students[0]);
        System.out.println(students[3].getInfo());
        //sinh vien 5
        students[4] = new Student("Pham Thi B", "17020002", "17020002@gmail.com");
        System.out.println(students[4].getInfo());
        students[1].setGroup("INT22041");
        students[2].setGroup("INT22042");
        students[3].setGroup("INT22041");
        students[4].setGroup("INT22042");
        System.out.println(sameGroup(students[1], students[2]));
        studentsByGroup();
        System.out.println("Danh sach sau khi xoa la: ");
        removeStudent("17021006");


    }
}
