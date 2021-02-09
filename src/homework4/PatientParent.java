package homework4;

public class PatientParent extends Patient {

    public PatientParent(String name, int id) {
        super(name,id);
    }

    public PatientParent(String name, int id, long card) {
        super(name, id, card);
    }

    @Override
    public void display() {
        System.out.println("Parent Name: " + this.name + ". Patient ID: " + getId());
    }


    public void showCardNumber(){
        System.out.println("Card for payment: " + card_id);
    }
}