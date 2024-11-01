package week2;

public class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {

            this.age = age;

    }


    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }


    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Irfan");
        person.setAge(22);

        person.display();
    }
}
