public class Loops {
    public static void main(String[] args) {

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
    }

    public int totalNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
