import java.util.ArrayList;
import java.util.Scanner;

// Student Class (Encapsulation + OOPs Basics)
class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Grade: " + grade;
    }
}

// Main Management System
class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(id, name, age, grade));
        System.out.println("✅ Student added successfully!\n");
    }

    // Display Students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found!\n");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    // Search Student by ID
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("✅ Found: " + s + "\n");
                return;
            }
        }
        System.out.println("❌ Student not found!\n");
    }

    // Update Student by ID
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Age: ");
                s.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter new Grade: ");
                s.setGrade(sc.nextLine());

                System.out.println("✅ Student updated successfully!\n");
                return;
            }
        }
        System.out.println("❌ Student not found!\n");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("🗑️ Student deleted successfully!\n");
                return;
            }
        }
        System.out.println("❌ Student not found!\n");
    }

    // Menu
    public void menu() {
        while (true) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("🚪 Exiting..."); return;
                default: System.out.println("⚠️ Invalid choice! Try again.\n");
            }
        }
    }
}

// Main Runner
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.menu();
    }
}