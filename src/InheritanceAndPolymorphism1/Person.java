package InheritanceAndPolymorphism1;

public class Person {

    protected String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
