public class LeapYear {
    public static boolean isLeapYear(int Year) {
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
