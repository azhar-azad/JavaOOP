package InheritanceAndPolymorphism1;

public class TestInheritanceAndPolymorphism1 {

    public static void main(String[] args) {

        Person person = new Person("Mr Person");
        Student student = new Student("Mr Student");
        Employee employee = new Employee("Mr Employee");
        Faculty faculty = new Faculty("Mr Faculty");
        Staff staff = new Staff("Mr Staff");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
