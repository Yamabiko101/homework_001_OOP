package homework001.exercises.employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    
    private static final int MONTHS_PER_YEAR = 12;
    private final int id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    
    public Employee() {
        this(0, "", "", 0.0);
    }

    public Employee(int id, String firstName, String lastName, double salary) {
        
        if (id <= 0) {
            throw new IllegalArgumentException("ID should be greater than 0");
        }
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name can't be empty");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name can't be empty");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary can't be negative");
        }
        
        this.id = id;
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.salary = BigDecimal.valueOf(salary).setScale(2, RoundingMode.HALF_UP);
    }
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public double getSalaryAsDouble() {
        return salary.doubleValue();
    }
    
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name can't be empty");
        }
        this.firstName = firstName.trim();
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name can't be empty");
        }
        this.lastName = lastName.trim();
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary can't be negative");
        }
        this.salary = BigDecimal.valueOf(salary).setScale(2, RoundingMode.HALF_UP);
    }

    public double getAnnualSalary() {
        return salary.multiply(BigDecimal.valueOf(MONTHS_PER_YEAR)).doubleValue();
    }

    public double raiseSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage can't be negative");
        }
        BigDecimal multiplier = BigDecimal.ONE.add(
            BigDecimal.valueOf(percentage).divide(BigDecimal.valueOf(100), 4, RoundingMode.HALF_UP)
        );
        this.salary = salary.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
        return salary.doubleValue();
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d, firstName=%s, lastName=%s, salary=%.2f]", 
            id, firstName, lastName, salary);
    }
}