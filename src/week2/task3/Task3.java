package week2.task3;

public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
//Ngan hang
class Bank {
    private String NameAccount;
    private int NumberAccount;
    private int Money;

    public String getNameAccount() {
        return NameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.NameAccount = nameAccount;
    }

    public int getNumberAccount() {
        return NumberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.NumberAccount = numberAccount;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        this.Money = money;
    }
    //Contructor

    public Bank(String NameAccount, int NumberAccount, int Money) {
        this.NameAccount = NameAccount;
        this.NumberAccount = NumberAccount;
        this.Money = Money;
    }

    //kiem tra xem so tai khoan co trung nhau khong
    public static boolean sameAccount(int a, int b) {
        if (a == b)
            return true;
        else return false;
    }

    // rut tien tu tai khoan
    public void Moneyout(int a) {
        if (a > Money)
            System.out.println("Tai khoan cua ban khong du de rut tien :((");
        else {
            double phuphi = 0.02; //phu phi khi rut thi bi tru 2% so tien rut vao tai khoan
            double Moneyconlai = Money - a - a * 0.02;// so tien con lai sau khi tru phi phu
            System.out.println("So tien con lai sau khi rut la: " + Moneyconlai);
        }
    }

    // nap tien vao tai khoan
    public void Moneyadd(int a) {
        if (a < 0)
            System.out.println("So tien nap khong dung quy dinh"); // em muon so tien nap tren 50k moi dung quy dinh
        else {
            double phuphi = 0.01; // phu phi khi nap tien
            double moneynapconlai = a - a * 0.01;
            double moneyadd = Money + moneynapconlai;
            System.out.println("So tien trong tai khoan sau khi nap la: " + moneyadd);
        }
    }

    public static void main(String[] args) {
        Bank bk1 = new Bank("Nguyen Van A", 123456789, 150000);
        Bank bk2 = new Bank("Tran Van B", 123457890, 50000);
        if (sameAccount(bk1.getNumberAccount(), bk2.getNumberAccount()))
            System.out.println("Cung chu tai khoan");
        else System.out.println("Khong cung chu tai khoan");
        bk1.Moneyout(50000);
        bk1.Moneyadd(100000);
    }
}
//animal
class Animal{
    public static int limit = 6;//gioi han 5 con vat
    private String Name;//ten
    private int Age;// tuoi
    private int High;//do cao

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHigh() {
        return High;
    }

    public void setHigh(int high) {
        High = high;
    }
    public static Animal animal[] = new Animal[100];
    //contructor
    public Animal (String Name, int Age, int High){
        this.Name = Name;
        this.Age = Age;
        this.High = High;
    }
    //xem ten co trung nhau khong
    public boolean sameName(Animal s2){
        if (this.getName() == null || s2.getName() == null)
            return false;
        else return (this.getName().equals(s2.getName()));
    }
    //Sap xep theo tuoi tang dan
    public static void arrayAge(){
        // ham sap xep
        for (int i = 0; i < limit - 1; i++)
        {
            for (int j = 0; j < limit - i - 1; j++)
            {
                if (animal[j].getAge() > animal[j+1].getAge())
                {
                    int temp = animal[j].getAge();
                    animal[j].setAge(animal[j+1].getAge());
                    animal[j+1].setAge(temp);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep la");
        for (int i = 0; i < limit; i++)
            System.out.println(animal[i].getName() + "/" + animal[i].getAge() + "/" + animal[i].getHigh());
    }
    //So sanh chieu cao
    public void Highvs(Animal s1){
        if (this.getHigh() < 0 || s1.getHigh() < 0)
            System.out.println("Chieu cao khong hop le");
        else {
            if (this.getHigh() == s1.getHigh())
                System.out.println(this.getName() + " and " + s1.getName() + " co chieu cao bang nhau");
            else if (this.getHigh() > s1.getHigh())
                System.out.println(this.getName() + " co chieu cao lon hon chieu cao cua " + s1.getName());
            else
                System.out.println(this.getName() + " co chieu cao nho hon chieu cao cua " + s1.getName());
        }
    }
    public static void main(String[] args) {
        animal[0] = new Animal("Dog", 15, 20);
        animal[1] = new Animal("Cat", 16, 34);
        animal[2] = new Animal("Dolphin", 10, 28);
        animal[3] = new Animal("Shark", 18, 34);
        animal[4] = new Animal("Lion", 14, 30);
        animal[5] = new Animal("Tiger", 14, 34);
        //in ra so sanh cung ten
        System.out.println(animal[0].sameName(animal[1]));
        //in ra danh sach sap xep theo tuoi
        arrayAge();
        //So sanh chieu cao
        animal[2].Highvs(animal[4]);
    }
}
//Tu dung do
class Closet{
    public static int n = 6; // gioi han so luong tu 5
    public static int limit = 100; // gioi han cho dung cho tu
    private int Number; //so thu tu closet
    private String Type; // loai tu: VIP or Normal
    private int Empty; //tu da chua duoc bao nhieu do

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getEmpty() {
        return Empty;
    }

    public void setEmpty(int empty) {
        Empty = empty;
    }
    public static Closet closet[] = new Closet[100];
    //Contructor

    public Closet(int Number, String Type, int Empty){
        this.Number = Number;
        this.Type = Type;
        this.Empty = Empty;
    }
    //kiem tra xem tu cua ban thuoc type nao
    public void check(){
        if (getType() == null)
            System.out.println("Tu cua ban khong hop le!");
        else if (getType().equals("VIP"))
            System.out.println("Tu so " + getNumber() + " cua ban thuoc loai VIP!");
        else if (getType().equals("Normal"))
            System.out.println("Tu so " + getNumber() + " cua ban thuoc loai Normal!");
        else System.out.println("Tu cua ban khong hop le!");
    }

    //phan loai tu VIP va Normal
    public int type(){
        if (this.getType() == null)
            return 0;
        else if (this.getType().equals("VIP"))
            return 1;
        else if (this.getType().equals("Normal"))
            return 2;
        else return 0;
    }
    //tu con cho trong khong
    public void slot(){
        if (getEmpty() < 0)
            System.out.println("Tu cua ban khong hop le!");
        else{
            if (getEmpty() < limit)
                System.out.println("Tu so " + getNumber() + " con " + (limit - getEmpty()) + " cho trong");
            else System.out.println("Tu so " + getNumber() + " khong con cho trong nao");
        }
    }
    public static void main(String[] args) {
        closet[0] = new Closet(1, "VIP", 40);
        closet[1] = new Closet(2, "Normal", 103);
        closet[2] = new Closet(3, "Normal", 69);
        closet[3] = new Closet(4, "VIP", 96);
        closet[4] = new Closet(5, "VIP", 73);
        closet[5] = new Closet(6, "Normal", 60);
        //check tu cua ban
        closet[0].check();
        //phan loai tu
        System.out.println("Danh sach tu VIP la: ");
        for (int i = 0; i < n; i++)
        {
            if (closet[i].type() == 1)
                System.out.println(closet[i].getNumber() + ", " + closet[i].getType() + ", " + closet[i].getEmpty());
        }
        System.out.println("Danh sach tu Normal la: ");
        for (int i = 0; i < n; i++){
            if (closet[i].type() == 2)
                System.out.println(closet[i].getNumber() + ", " + closet[i].getType() + ", " + closet[i].getEmpty());
        }
        //xem tu con bao nhieu slot
        closet[4].slot();
    }
}