public class odev16 {
    public static void main(String[] args) {
        String str = "KLMNS";
        yaz(str);
    }

    public static void yaz(String str1) {
        boolean status = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a') {
                System.out.println(str1 + " a harfini bulundurmaktadir.");
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println(str1 + " a harfini bulundurmamaktadir");
        }
    }
}
