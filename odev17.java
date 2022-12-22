public class odev17 {
    public static void main(String[] args) {
        String str = "Tenet";
        yaz(str);
    }

    public static void yaz(String str1) {
        boolean status = true;
        // str1 = str1.toUpperCase();
        for (int i = str1.length() - 1, j = 0; j < i; i--, j++) {
            if (Character.toUpperCase(str1.charAt(i)) != Character.toUpperCase(str1.charAt(j))) {
                status = false;
            }
        }
        if (status) {
            System.out.println(str1 + " palindromdur");
        } else {
            System.out.println(str1 + " palindrom değildir");
        }
    }
}
