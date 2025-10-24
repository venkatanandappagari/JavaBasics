package JavaOops;

    public class OopsClassPerson {
    // Instance variables with no explicit initialization
    private String name;
    private int age;
    private double salary;
    private boolean isEmployed;
    private char grade;

    // Default constructor
    public OopsClassPerson() {
        // No assignments here — we want to see default values
    }

    // Parameterized constructor
    public OopsClassPerson(String name, int age, double salary, boolean isEmployed, char grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isEmployed = isEmployed;
        this.grade = grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display all fields
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Employed: " + isEmployed);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Object with default constructor — shows default values
        System.out.println("=== Default Values ===");
        OopsClassPerson p1 = new OopsClassPerson();
        p1.displayInfo();

        // Object with parameterized constructor
        System.out.println("\n=== Assigned Values ===");
        OopsClassPerson p2 = new OopsClassPerson("Venkat", 25, 50000.0, true, 'A');
        p2.displayInfo();

        // Update some fields using setters
        System.out.println("\n=== After Updating p1 ===");
        p1.setName("Asha");
        p1.setAge(30);
        p1.displayInfo();
    }
}