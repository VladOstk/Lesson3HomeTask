package Task3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bruce","Lee");
        employee1.printEmployeeInfo();
        employee1.setId(1);
        employee1.setName("Bob");
        employee1.setSurname("Dylan");
        employee1.printEmployeeInfo();
    }


}
