// 学生类
/*class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

// 课程类
class Course {
    private String id;
    private String name;
    private int capacity;
    private int enrolledStudents;

    public Course(String id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}

// 选课类
class Enrollment {
    private Student student;
    private Course[] courses;

    public Enrollment(Student student, int maxCourses) {
        this.student = student;
        this.courses = new Course[maxCourses];
    }

    public void enrollCourse(Course course) {
        for (Course c : courses) {
            if (c == null) {
                courses[courses.length - 1] = course;
                course.enrollStudent();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(student).append(" has enrolled in: \n");
        for (Course course : courses) {
            if (course != null) {
                sb.append(course).append("\n");
            }
        }
        return sb.toString();
    }
}

// 主程序类
public class App {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Alice");
        Course course1 = new Course("C001", "Mathematics", 30);
        Course course2 = new Course("C002", "Physics", 25);

        Enrollment enrollment = new Enrollment(student1, 2);
        enrollment.enrollCourse(course1);
        enrollment.enrollCourse(course2);

        System.out.println(enrollment);
    }
}*/