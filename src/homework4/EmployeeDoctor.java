package homework4;

public class EmployeeDoctor extends Employee {

    private int oper;

    public EmployeeDoctor(String name, int id, int oper) {
        super(name, id);
        this.name = name;
        this.id = id;
        this.oper = oper;
    }

    @Override
    public void display() {
        System.out.println("Doctor Name: " + super.getName() + ". User ID: " + getId());

    }

    public void showOper() {
        System.out.println("Operatory for visit: " + oper);
    }

}