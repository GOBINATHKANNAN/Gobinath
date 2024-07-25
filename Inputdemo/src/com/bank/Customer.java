package com.bank;

public class Customer {
    private String name;
    protected int age;
    public String email;
    String phone;

    public Customer(String name, int age, String email, String phone) {
        this.name=name;
        this.age=age;
        this.email=email;
        this.phone=phone;
    }

    public String getName()
    {
        return name;
    }
//    public void setName()
//    {
//        this.name=name;
//    }
    public int getAge()
    {
        return age;
    }
    public void setAge()
    {
        this.age=age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email=email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone() {
        this.phone=phone;
    }
}
