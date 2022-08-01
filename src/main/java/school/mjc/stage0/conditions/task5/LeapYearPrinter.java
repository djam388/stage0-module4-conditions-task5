package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void main(String[] args) {
        isLeapYear(1922);
    }
    public static void isLeapYear(int year) {
        switch (year % 400) {
            case 0:
                System.out.println("leap");
                break;
            default:
                switch ((year % 100)) {
                    case 0:
                        System.out.println("not leap");
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                System.out.println("leap");
                                break;
                            default:
                                System.out.println("not leap");
                                break;
                        }
                        break;
                }
                break;
        }

    }
}
