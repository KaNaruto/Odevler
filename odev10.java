public class odev10 {
    public static void main(String[] args) {
        String str = "BuStringde17KucukHarfVar";
        String tersStr = ters(str);
        System.out.println(tersStr);
    }

    public static String ters(String str1) {
        String yeniStr = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            yeniStr += str1.charAt(i);
        }
        return yeniStr;
    }
}
