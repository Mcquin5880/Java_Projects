package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (!validateName(name, age)) throw new IllegalArgumentException("Invalid name.");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    private boolean validateName(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40 || age < 0 || age > 120) {
            return false;
        }
        return true;
    }
}