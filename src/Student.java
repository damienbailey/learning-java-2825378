public class Student {


       /*
        Student Profile attributes
        First Name
        Last name
        Expected year to graduate
        GPA
        Declared Major Done
        */
    // need to increment student year of grad by one if they fail a test.

    //constructor with dynamic values. Done

    String givenName;
    String surname;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;

    public Student(String givenName, String surname, int expectedYearToGraduate, double GPA, String declaredMajor){
        this.givenName = givenName;
        this.surname = surname;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;


        }
    public void incrementGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }



}
