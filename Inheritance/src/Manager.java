public class Manager extends Employee{
    private double bonus;

    /*
    super(..) construction means that constructor from superclass is called with given parameters.
    Manager class constructor doesn't have access to superclass variables, that's why superclass constructor is used.
    super(..) call has to be the first instruction in subclass constructor.
    If the super(..) instruction is not called, default superclass constructor is called. If there is no such
    constructor defined, the compiler will display an error.
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    /*
    In Java, you can access variables and methods from superclass only by adding 'super.' prefix before method
    or variable name. It is possible to add and override methods from superclass, but it is not allowed to
    remove inherited methods or variables.
     */
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public static void main(String[] args) {
        Manager boss = new Manager("Karol Parol", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Henryk Kwiatek", 50000, 1989, 10, 1);
        staff[2] = new Employee("Artur Kwiatkowski", 40000, 1990, 3, 15);

        /*
        e variable's type is Employee, but in fact, the real type of the variable can be both Employee or Manager,
        due to the fact Manager derives from Employee. JVM recognizes which type the variable refers to and picks
        the proper method (here the getSalary() method varies in Employee and Manager class implementations).
         */
        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}
