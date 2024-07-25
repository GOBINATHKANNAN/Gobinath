package Persondetails;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be null or empty");
        } else {
            this.name = name;
        }
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (age < 0 || age > 150) {
            System.out.println("Age must be between 0 and 150");
        } else {
            this.age = age;
        }
    }
}
