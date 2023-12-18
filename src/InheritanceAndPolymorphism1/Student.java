package InheritanceAndPolymorphism1;

public class Student extends Person {

    private StudentClass studentClass;

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
