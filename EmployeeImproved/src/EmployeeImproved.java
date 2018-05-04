import java.util.*;
public class EmployeeImproved {
    private static int nextId = 1;
    private String name;
    private double salary;
    private Date hireday;
    private int id;

    public EmployeeImproved(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
        GregorianCalendar calendar = new GregorianCalendar(1990,5,10);
        hireday = calendar.getTime();
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public Object getHireday() {
        return hireday.clone();
    }

    public static void main(String[] args) {
        EmployeeImproved employee = new EmployeeImproved("Grzegorz", 50000);
        System.out.println(employee.getName() + " " + employee.getSalary());
    }
}
