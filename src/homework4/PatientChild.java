package homework4;

public class PatientChild extends Patient {
    public PatientChild(String name, int id) {
        super(name, id);
    }
    @Override
    void display( ) {
        System.out.println("Child Name: " + super.getName() + ". Patient ID: " + getId());
    }
}