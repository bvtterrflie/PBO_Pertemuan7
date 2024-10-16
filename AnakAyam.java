package looping;

public class AnakAyam {
    public static void main(String[] args) {
        int n = 10; // You can set this value to any number
        for (int i = n; i > 0; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu habis.");
            }
        }
    }
}