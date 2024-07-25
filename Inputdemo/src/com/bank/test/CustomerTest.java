package com.bank.test;
import com.bank.Customer;

public class CustomerTest {
    public static void main(String[] args) {

        Customer myCustomer = new Customer("Rohit ",19,"rohit@gmail.com","9626875488");
        System.out.println("Name   :"+myCustomer.getName() );
        System.out.println("Age    :"+myCustomer.getAge() );
        System.out.println("email  :"+myCustomer.getEmail() );
        System.out.println("Number :"+myCustomer.getPhone() );

    }
}
