package lesson1.task1;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private String gender;

    public static class Builder {
        private int age;
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private String gender;

        public Builder addAge(int age) {
            this.age = age;
            return this;
        }

        public Builder addFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder addCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder addPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person();
        }
    }
}