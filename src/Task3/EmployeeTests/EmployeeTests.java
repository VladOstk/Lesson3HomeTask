package Task3.EmployeeTests;

import Task3.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTests {
    @Test
    public void printEmployeeInfo_containsNameSurname() {
        Employee employee = new Employee("Bruce", "Lee");
        Assert.assertEquals("Bruce", employee.getName());
        Assert.assertEquals("Lee", employee.getSurname());
    }

    @Test
    public void printEmployeeInfo_containsOnlyId() {
        Employee employee = new Employee();
        Assert.assertEquals(null, employee.getName());
        Assert.assertEquals(null, employee.getSurname());
        Assert.assertTrue(employee.getId() != 0);

    }

}
