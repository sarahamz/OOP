public abstract class Person {
    String firstName;
    String surName;
    String birthday;

    public Person(String firstName, String surName, String birthday) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getBirthday() {
        return birthday;
    }

    abstract int getIdentifier();

}
