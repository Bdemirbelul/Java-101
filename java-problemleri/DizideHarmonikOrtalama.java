public class DizideHarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double harmonikSeriToplami = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            harmonikSeriToplami += 1.0 / numbers[i];
        }

        double harmonikOrtalama = numbers.length / harmonikSeriToplami;
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}
