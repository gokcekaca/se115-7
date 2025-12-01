public class Student{
    public String name;
    public  int age;
    public Student(String x, int y){
     name = x;
     age = y;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
