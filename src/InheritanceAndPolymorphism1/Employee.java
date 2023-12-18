package InheritanceAndPolymorphism1;

import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
