package homework6.builder;

public class Main {

    public static void main(String[] args) {

        Soldier oleksandr = Soldier.Builder.newInstance()
                .setName("Bob")
                .setLastName("Gubko")
                .setRank("Sergeant")
                .setBadgeNumber(11)
                .setBloodType("4-")
                .setTypeOfTroops("Aviation")
                .setSex("M").build();

        System.out.println(oleksandr);

    }

}