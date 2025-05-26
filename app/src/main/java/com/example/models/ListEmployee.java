package com.example.models;

import java.util.ArrayList;

public class ListEmployee {
    private ArrayList<Employee> employees;

    public ListEmployee() {
        employees=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void gen_dataset()
    {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Lily");
        e1.setEmail("lily@gmail.com");
        e1.setPhone("0907676654");
        e1.setUsername("lily");
        e1.setPassword("123");
        employees.add(e1);

        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("Mike");
        e2.setEmail("mike@gmail.com");
        e2.setPhone("0907676655");
        e2.setUsername("mike");
        e2.setPassword("456");
        employees.add(e2);

        Employee e3=new Employee();
        e3.setId(3);
        e3.setName("Kai");
        e3.setEmail("kai@gmail.com");
        e3.setPhone("0907676656");
        e3.setUsername("kai");
        e3.setPassword("789");
        employees.add(e3);
    }
}
