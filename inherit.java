public class inherit {
    public class Person{
        private String name;
        private int age;
        private String sex;
        public Person(int age, String name, String sex){
            /*it's a must ↑         ↑           ↑ or the output would be null*/
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public void print(){
            System.out.println("{name:"+name+",age:"+age+",sex:"+sex+"}");
        }
    }
    public class Teacher extends Person{
        public Teacher(String name,int age,String sex){
            super(age, name, sex);
        }
    }
    public class Student extends Person{
        public Student(String name,int age,String sex){
            super(age, name, sex);
            /*the sequentential of parameters must be the same.
            If be like (name, age, sex), then there will be mistake*/
        }
    }
    
    public static void main(String args[]){
        inherit person = new inherit();
        Teacher Axlow = person.new Teacher("Axlow", 23, "Male");
        Student Paimon = person.new Student("Paimon", 5000, "Female");
        /*when wrote Paimon, The compiler throws an error message
        then I realised I lost one "}"
        take this as an experience for the futrure :)*/
        Axlow.print();
        Paimon.print();
    }
}
