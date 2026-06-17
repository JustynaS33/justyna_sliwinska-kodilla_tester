public class LeapYear {
    int year;

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
            System.out.println("Ten rok nie jest przestępny, bo nie dzieli się przez 4");
        } else if (year % 100 != 0) {
            return true;
            System.out.println("Ten rok jest przestępny, bo dzieli się przez 4, ale nie dzieli się przez 100");
        } else if (year % 400 != 0) {
            return false;
            System.out.println("Ten rok nie jest przestępny, bo dzieli się przez 100, ale nie dzieli się przez 400");
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + "to rok przestępny.");
        } else {
            System.out.println(year + "to nie jest rok przestępny");
        }
    }
}
}
