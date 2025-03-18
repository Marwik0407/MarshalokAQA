import java.util.HashSet;
import java.util.Set;

class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        if (grades.length == 0) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void nextCourse() {
        this.course++;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", averageGrade=" + getAverageGrade() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + group.hashCode();
    }
}

public class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        if (!students.add(student)) {
            System.out.println("Student " + student.getName() + " is already in the set.");
        }
    }

    public void removeLowAverageStudents() {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteStudents() {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.nextCourse();
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Alice", "Group A", 1, new int[]{4, 5, 3}));
        manager.addStudent(new Student("Bob", "Group B", 1, new int[]{2, 3, 2}));
        manager.addStudent(new Student("Charlie", "Group A", 2, new int[]{5, 4, 5}));

        manager.printStudents(1);

        manager.removeLowAverageStudents();

        System.out.println("After removing low average students:");
        manager.printStudents(1);

        manager.promoteStudents();

        System.out.println("After promoting students:");
        manager.printStudents(2);
    }
}