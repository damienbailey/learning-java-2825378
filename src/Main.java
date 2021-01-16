public class Main {

    public static void main(String[] args) {


//two student profiles
        //incresment one student grad year by one

        Student student1 = new Student("Damien","Bailey",2021,4.0,"Accounting");
        Student student2 = new Student("Betty","Bailey",2023,3.8,"Bookkeeping");

        System.out.println(student1.expectedYearToGraduate);


        student1.incrementGraduationYear();

        System.out.println(student1.expectedYearToGraduate);

    }

}
