public class odev35 {
    public static void main(String[] args) {
        String[][] list = { { "aaa", "bbb" }, { "cccad", "wqewqrwq" }, { "enuzunkelimebu", "ok" } };
        String y = uzun(list);
        System.out.println(y);
    }

    public static String uzun(String[][] a) {
        String enUStr = a[0][0];
        int enu = a[0][0].length();
        int satir = 0, sutun = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].length() > enu) {
                    enUStr = a[i][j];
                    enu = a[i][j].length();
                    satir = i;
                    sutun = j;
                }
            }
        }
        String abc = "En uzun string: " + enUStr + " satir: " + satir + " sutun: " + sutun;
        return abc;
    }
}
