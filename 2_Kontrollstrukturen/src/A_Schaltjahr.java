public class A_Schaltjahr {

    static int year = 2400;
    static boolean isLeapYear;


    public static void main(String[] args) {
        calcLeapYear();
    }

    public static void calcLeapYear() {
        if (year % 4 == 0) {
            isLeapYear = true;
            if(year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            }
        }
        System.out.println(isLeapYear);
    }
}
