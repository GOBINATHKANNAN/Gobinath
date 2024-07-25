package Persondetails;

public class Main {
    public static void main(String[] args) {

        Person personDetails = new Person();
        personDetails.setAge(18);
        personDetails.setName("Harish");
       String name= personDetails.getName();
       int age= personDetails.getAge();
        System.out.println("Name :"+ name +"\n"+"Age  :"+ age);

    }
}

