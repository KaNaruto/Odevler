public class odev12 {
    public static void main(String[] args) {
        String str = "BuStringde17KucukHarfVar";
        String buyukkucukStr = buyuk(str);
        System.out.println(buyukkucukStr);
        System.out.println("Artik yok????");
    }

    public static String buyuk(String str1) {
        String yeniStr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) <= 122 && str1.charAt(i) >= 95) {
                yeniStr += (char) (str1.charAt(i) - 32);
            } else if (str1.charAt(i) <= 90 && str1.charAt(i) >= 65) {
                yeniStr += (char) (str1.charAt(i) + 32);
            } else {
                yeniStr += str1.charAt(i);
            }
        }
        return yeniStr;
    }
}
