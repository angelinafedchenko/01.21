package homework4;

public class ClinicalApp {

    public static void main(String[] args) {

        EmployeeDoctor Dentist = new EmployeeDoctor("Mykola",1, 22);
        Dentist.display();
        Dentist.showOper();

        EmployeeAdmin Secretary = new EmployeeAdmin("Evgen", 2, 1235485L);
        Secretary.display();
        Secretary.showPhone();

        PatientParent Father = new PatientParent("Oleksiy", 3, 536911111L);
        Father.display();
        Father.showCardNumber();

        PatientChild Son = new PatientChild("Oleksandr", 4);
        Son.display();


    }

}
