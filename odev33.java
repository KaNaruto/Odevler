public class odev33 {
    public static void main(String[] args) {
        int x = 15;
        asal(x);
    }

    public static void asal(int a) {
        boolean status = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                status = false;
                break;
            }
        }
        if (status && a != 1) {
            System.out.println(a + " bir asal sayidir");
        } else {
            System.out.println(a + " bir asal sayi degildir");
        }
    }
}
