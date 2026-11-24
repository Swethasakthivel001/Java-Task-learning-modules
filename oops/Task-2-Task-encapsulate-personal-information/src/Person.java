
public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address.trim();
        } else {
            throw new IllegalArgumentException("Invalid address");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void displayPersonDetails() {
        System.out.println("Person Name    : " + getName());
        System.out.println("Person Age     : " + getAge());
        System.out.println("Person Address : " + getAddress());
        System.out.println("--------------------------");
    }
}
