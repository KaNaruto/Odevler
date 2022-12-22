public class odev7 {
    public static void main(String[] args) {
        int x = 5;
        int y = toplam(x);
        System.out.println(y);
    }

    public static int toplam(int number1) {
        int toplam = 0;
        for (int i = 1; i < number1; i++) {
            toplam += i;
        }
        return toplam;
    }
}
