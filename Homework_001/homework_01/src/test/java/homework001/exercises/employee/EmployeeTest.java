package homework001.exercises.employee;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(1, "John", "Doe", 1000.00);
    }

    //  Constructor tests

    @Test
    @DisplayName("Constructor válido crea empleado correctamente")
    void testValidConstructor() {
        assertEquals(1, employee.getId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals(new BigDecimal("1000.00"), employee.getSalary());
    }

    @Test
    void testConstructorInvalidId() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(0, "John", "Doe", 1000));
    }

    @Test
    void testConstructorInvalidFirstName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(1, " ", "Doe", 1000));
    }

    @Test
    void testConstructorInvalidLastName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(1, "John", "", 1000));
    }

    @Test
    void testConstructorNegativeSalary() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(1, "John", "Doe", -1));
    }

    //  Setter tests 

    @Test
    void testSetFirstName() {
        employee.setFirstName("Alice");
        assertEquals("Alice", employee.getFirstName());
    }

    @Test
    void testSetFirstNameInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> employee.setFirstName(" "));
    }

    @Test
    void testSetLastName() {
        employee.setLastName("Smith");
        assertEquals("Smith", employee.getLastName());
    }

    @Test
    void testSetLastNameInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> employee.setLastName(null));
    }

    @Test
    void testSetSalary() {
        employee.setSalary(1500.456);
        assertEquals(new BigDecimal("1500.46"), employee.getSalary());
    }

    @Test
    void testSetSalaryNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> employee.setSalary(-10));
    }

    //  Salary logic tests 

    @Test
    void testGetAnnualSalary() {
        assertEquals(12000.0, employee.getAnnualSalary());
    }

    @Test
    void testRaiseSalary() {
        double newSalary = employee.raiseSalary(10);
        assertEquals(1100.00, newSalary);
        assertEquals(new BigDecimal("1100.00"), employee.getSalary());
    }

    @Test
    void testRaiseSalaryWithDecimals() {
        employee.raiseSalary(12.345);
        assertEquals(new BigDecimal("1123.50"), employee.getSalary());
    }

    @Test
    void testRaiseSalaryNegativePercentage() {
        assertThrows(IllegalArgumentException.class,
                () -> employee.raiseSalary(-5));
    }

    //  Other tests 

    @Test
    void testGetSalaryAsDouble() {
        assertEquals(1000.0, employee.getSalaryAsDouble());
    }

    @Test
    void testToString() {
        String expected = "Employee[id=1, firstName=John, lastName=Doe, salary=1000.00]";
        assertEquals(expected, employee.toString());
    }
}
