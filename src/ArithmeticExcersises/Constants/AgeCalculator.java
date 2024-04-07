package ArithmeticExcersises.Constants;

public class AgeCalculator {

    static final int DAYS_IN_A_YEAR=365;
    static final int WEEKS_IN_A_YEAR=52;
    static final int MONTHS_IN_A_YEAR=12;

    public int ageInDays(int age){
        return  age*DAYS_IN_A_YEAR;
    }
    public int ageInWeeks(int age){
        return age*WEEKS_IN_A_YEAR;
    }
    public int ageInMonths(int age){
        return age*MONTHS_IN_A_YEAR;
    }
}
