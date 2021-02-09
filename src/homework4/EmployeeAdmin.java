package homework4;

public class EmployeeAdmin extends Employee {

    long phone;

    public EmployeeAdmin(String name, int id, long phone) {
        super(name, id);
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    @Override
    public void display() {
        System.out.println("Administrator Name: " + super.getName() + ". User ID: " + getId());

    }

    public void showPhone() {
        System.out.println("Telephone for schedule the visit: " + phone);
    }
}