public class App1{
    public static void main(String[] args) {
        Student stu = new Student(2022051125, "周志鹏");
        Course cou = new Course(1001, "数学分析", 30, 29);
        System.out.println(stu);
        System.out.println(cou);
    }
}
class Student{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "学生信息为："+name+" "+id;
    }
}
class Course{
    private int code;
    private String cname;
    private int capacity;
    private int nop;
    public int getCode(){
        return code;
    }
    public String getCname(){
        return cname;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getNop(){
        return nop;
    }
    public Course(int code,String cname,int capacity,int nop){
        this.code = code;
        this.cname = cname;
        this.capacity = capacity;
        this.nop = nop;

    }
    public String toString(){
        return "选课信息为："+code+" "+cname+" "+capacity+" "+nop;
    }

}
class Secourse{
    private Student student;
    private Course[] course;
    public Secourse(Student student,int maxcourse){
        this.student = student;
        this.course = new Course[maxcourse];
    }
    public Student getStudent(){
        return student;
    }
    public Course[] getCourse(){
        return course;
    }
    public Secourse(Student student,Course[] course){
        this.student = student;
        this.course = course;
    }
    Course co ;
    public String enroll(){
        return co.toString();
    }
    public String toString(){
        return "当前选课信息为："+student+course;
    }

}
