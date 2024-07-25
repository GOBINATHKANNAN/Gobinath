public class Student {
    String name;
    int id;
    String phonenumber;
    String dateofbirth;
    public  Student(String name , int id, String phonenumber, String dateofbirth)
    {
        this.name=name;
        this.id = id;
        this.phonenumber = phonenumber;
        this.dateofbirth = dateofbirth;

    }
    public void PrintDetails()
    {
        System.out.println("\n"+"Name  : "+this.name+"\n"+"ID  :"+this.id+"\n"+" Phone number  : "+this.phonenumber+"\n"+"Date of birth  : "+this.dateofbirth);
    }

    public static void main(String[] args)
    {
        Student student1 = new Student("John cena" , 45, "1234567890", "01.01.2000");
        Student student2 = new Student("Mr.Beast", 25, "0987654321", "02.02.2001");
        Student student3 = new Student("Dragon booster", 93, "1122334455", "03.03.2002");
        student1.PrintDetails();
        student2.PrintDetails();
        student3.PrintDetails();
    }
}