public class abstrac{
    public abstract class Person{
        private String name;
        private int age;
        private String sex;

        public Person(String name, int age, String sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        protected String getName(){
            return name;
        }
        protected String getSex(){
            return sex;
        }
        protected int getAge(){
            return age;
        }

        public abstract void print();
    }



    public class Student extends Person{
        public Student(String name, int age, String sex){
            super(name, age, sex);
        }

        @Override
        public void print() {
            System.out.println("name:"+getName()+",age:"+getAge()+",sex:"+getSex());
        }
    }


    public class Teacher extends Person{
        private String subject;
        public Teacher(String name, int age, String sex, String subject){
            super(name, age, sex);
            this.subject = subject;
        }

        @Override
        public void print(){
            System.out.println("name:"+getName()+",age:"+getAge()+",sex:"+getSex()+",teaching subject:"+subject);
        }
    }
    public static void main(String args[]){
        abstrac person = new abstrac();
        Student Axlow = person.new Student("Axlow", 22, "male");
        Axlow.print();
        Teacher Happy = person.new Teacher("Happy", 5000, "male", "spear fighting technique");
        Happy.print();
    }
}