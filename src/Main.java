public class Main {




    public static double grossYearlySalary(double hoursWorked, double wageRate, int vacationDays){
        double grossWeeklyWage = hoursWorked * wageRate;
        double deductionVacationDays = vacationDays * 8 * wageRate;
        double yearlySalary = grossWeeklyWage * 52 - deductionVacationDays;
        return yearlySalary;
    }

    public static void main(String[] args) {

        double calculatedGrossYearlySalary = grossYearlySalary(38,1, 1);
        System.out.println(calculatedGrossYearlySalary);
    }

}
