public class StaticTest {
    public static void main(String[] args) {
        EmployeeImproved[] staff = new EmployeeImproved[3];

        staff[0] = new EmployeeImproved("Tomasz", 40000);
        staff[1] = new EmployeeImproved("Dariusz", 60000);
        staff[2] = new EmployeeImproved("Grzegorz", 65000);

        for (EmployeeImproved e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }
        int n = EmployeeImproved.getNextId();
        System.out.println("Next availave id = " + n);
    }
}
