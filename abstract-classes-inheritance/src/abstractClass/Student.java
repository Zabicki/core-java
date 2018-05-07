package abstractClass;

public class Student extends Person{
    private String major;

    public Student(String n, String major) {

        super(n);
        this.major = major;
    }

    public String getDescription() {
        return "student specjalizacji " + major;
    }
}
