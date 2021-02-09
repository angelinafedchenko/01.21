package homework4;

public class Employee extends User {
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    void display() {
        System.out.println(super.getName() + getId());
    }
}
