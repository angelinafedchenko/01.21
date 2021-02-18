package homework6.builder;

class Soldier {
    private String name;
    private String lastName;
    private String rank;
    private int badgeNumber;
    private String bloodType;
    private String typeOfTroops;
    private String sex;

    public Soldier(String name, String lastName, String rank, int badgeNumber, String bloodType, String typeOfTroops, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.rank = rank;
        this.badgeNumber = badgeNumber;
        this.bloodType = bloodType;
        this.typeOfTroops = typeOfTroops;
        this.sex = sex;
    }

    public Soldier(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.rank = builder.rank;
        this.badgeNumber = builder.badgeNumber;
        this.bloodType = builder.bloodType;
        this.typeOfTroops = builder.typeOfTroops;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Soldier [name = " + name + ", last name = " + lastName + ", rank = " + rank + ", badge # = " + badgeNumber + ", blood type = " + bloodType + ", type of troops = " + typeOfTroops + ", sex = " + sex + "]";
    }

    public static class Builder {
        private String name;
        private String lastName;
        private String rank;
        private int badgeNumber;
        private String bloodType;
        private String typeOfTroops;
        private String sex;


        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setBadgeNumber(int badgeNumber) {
            this.badgeNumber = badgeNumber;
            return this;
        }
        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Builder setTypeOfTroops(String typeOfTroops) {
            this.typeOfTroops = typeOfTroops;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }


        public Soldier build() {
            if(name == null) {
                return null;
            }

            return new Soldier(this);
        }
    }
}