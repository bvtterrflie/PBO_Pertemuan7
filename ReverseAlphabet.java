package looping;

public class ReverseAlphabet {
    public static void main(String[] args) {
        System.out.println("Letters from Z to A:");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
    }
}
