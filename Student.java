public class Student extends Person implements Mailable {

    int matriculationNumber;

    public Student(String firstName, String surName, String birthday, int matriculationNumber){
        super(firstName, surName, birthday);
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String getMailAddress(){
        return firstName + "." + surName + "@stud.uni-fictitious.de";
    }

    @Override
    int getIdentifier() {
        return matriculationNumber;
    }

}
