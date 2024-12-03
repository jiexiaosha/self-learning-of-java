public class Person {
    String name;
    int age;

    // 正确的构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 重写 toString 方法用于打印对象信息
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args){
        Person p= new Person("Alice", 25);
        System.out.println(p);  // 现在会打印出 Person{name='Alice', age=25}
    }
}