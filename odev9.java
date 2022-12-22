public class odev9 {
    public static void main(String[] args) {
        String str = "BuStringde17KucukHarfVar";
        int y = kucukharf(str);
        System.out.println(y);
    }

    public static int kucukharf(String str1) {
        int sayac = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) <= 122 && str1.charAt(i) >= 95) {
                sayac++;
            }
        }
        return sayac;
    }
}
