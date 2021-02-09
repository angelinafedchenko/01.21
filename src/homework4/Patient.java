package homework4;

public class Patient extends User {
    long card_id;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Patient(String name, int id, long card_id) {
        this.name = name;
        this.id = id;
        this.card_id = card_id;
    }

    @Override
    void display() {
        System.out.println(super.getName() + getId());
    }
}