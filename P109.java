    class Resume {
        private String name;
        private String sex;
        private int age;

        public Resume() {}

        public Resume(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String getName(){
                return name;
        }
        public String getSex(){
                return sex;
        }
        public int getAge(){
                return age;
        }

        public void introduce(){
            System.out.println("姓名："+name);
            System.out.println("性别："+sex);
            System.out.println("年龄："+age);
        }
    }
public class P109{
    public static void main(String[] args){
        Resume person = new Resume("李四","男",20);
        person.introduce();
    }
}
