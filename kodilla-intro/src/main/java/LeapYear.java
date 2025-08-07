public class LeapYear {
    public static boolean isLeapYear(int year) {
    if (year % 4 != 0) {
        return false; // NIE PRZESTĘPNY
    } else if (year % 100 != 0) {
        return true;  // PRZESTĘPNY
    } else if (year % 400 != 0) {
        return false; // NIE PRZESTĘPNY
    } else {
        return true;  // PRZESTĘPNY
    }
}

public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " to rok przestępny.");
        } else {
            System.out.println(year + " to nie jest rok przestępny.");
        }
    }
}
