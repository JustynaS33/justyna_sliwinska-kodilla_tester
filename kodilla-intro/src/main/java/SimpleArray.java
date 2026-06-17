public class SimpleArray {
    public static void main(String[] args) {
        String[] bookTitles = new String[6];
        bookTitles[0] = "Życie na zamówienie, czyli espresso z cukrem";
        bookTitles[1] = "Tylko jedno spojrzenie";
        bookTitles[2] = "Pensjonat Sosnówka";
        bookTitles[3] = "Światło w cichą noc";
        bookTitles[4] = "Promyk słońca";
        bookTitles[5] = "Tam gdzie serce twoje";

        String bookTitle = bookTitles[3];
        System.out.println(bookTitle);
    }
}
