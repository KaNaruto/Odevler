public class odev29 {
    public static void main(String[] args) {
        String[][] list = { { "aaa", "bbb" }, { "cccad", "wqewqrwq" }, { "enuzunkelimebu", "ok" } };
        String enUzuString = enUzun(list);
        System.out.println(enUzuString);
    }

    public static String enUzun(String[][] a) {
        int enu = a[0][0].length();
        String enuStr = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].length() > enu) {
                    enu = a[i][j].length();
                    enuStr = a[i][j];
                }
            }
        }
        return enuStr;
    }
}
