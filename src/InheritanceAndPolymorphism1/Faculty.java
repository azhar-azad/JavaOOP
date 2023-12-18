package InheritanceAndPolymorphism1;

public class Faculty extends Employee {

    private double officeHours;
    private String rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
