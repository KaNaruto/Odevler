public class odev22 {
    public static void main(String[] args) {
        String[] list = { "ali", "veli", "kkkkkk", "qwdq", "c", "weqdqwdwqdq", "ll" };
        int y = uzunIndex(list);
        System.out.println(y);
    }

    public static int uzunIndex(String[] a) {
        int enu = a[0].length();
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (enu < a[i].length()) {
                enu = a[i].length();
                index = i;
            }
        }
        return index;
    }
}
