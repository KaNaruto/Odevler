public class odev13 {
    public static void main(String[] args) {
        String str = "BaaKaaAAaa";
        int y = aaBulma(str);
        System.out.println(y);
    }

    public static int aaBulma(String str1) {
        int sayac = 0;
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == 'a' && str1.charAt(i + 1) == 'a') {
                sayac++;
            }
        }
        return sayac;
    }
}
