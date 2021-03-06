public class Person {

    private String name;

    // Constructor function initializing name property in Person class.
    public Person(String personName) {

        name = personName;
    }

    // Return name property when called.
    public String getName() {

        return name;

    }

    // Changes the name property.
    public void setName(String name) {

        this.name = name;

    }

    // Prints console message saying hello.
    public String sayHello() {

        return "Hello, " + name + ".";

    }
}
