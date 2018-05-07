package abstractClass;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
    private double salary;
    private Date hireDay;

    public Employee(String n, double salary, int year, int month, int day) {
        super(n);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("pracownik zarabiajacy %.2f zl", salary);
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
