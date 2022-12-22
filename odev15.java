public class odev15 {
    public static void main(String[] args) {
        String str = "Bu stringde kac kelime var";
        int y = kelimeSayisi(str);
        System.out.println(y);
    }

    public static int kelimeSayisi(String str1) {
        int sayac = 1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                sayac++;
            }
        }
        return sayac;
    }
}
