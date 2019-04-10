package Task3;

import java.util.Random;

public class Employee {
    private String name, surname;
    private int id;

    public Employee() {
        Random random = new Random();
        this.id = random.nextInt(10);
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Random random = new Random();
        this.id = random.nextInt(10);
    }

    public void printEmployeeInfo() {
        System.out.println(this.name + " " + this.surname + " " + this.id);

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}
