public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkNotebook();

        Notebook heavyNotebook = new Notebook(2000, 2000);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkNotebook();

        Notebook oldNotebook = new Notebook(1200, 3000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkNotebook();
    }
}