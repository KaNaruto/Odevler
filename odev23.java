public class odev23 {
    public static void main(String[] args) {
        int[] list = { 2, 5, 2, 9, 1, 11, 18 };
        int y = en(list);
        System.out.println(y);
    }

    public static int en(int[] a) {
        int enb, enb2;
        if (a[0] > a[1]) {
            enb = a[0];
            enb2 = a[1];
        } else {
            enb = a[1];
            enb2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (enb < a[i]) {
                enb2 = enb;
                enb = a[i];
            } else if (enb2 < a[i]) {
                enb2 = a[i];
            } else {
                continue;
            }
        }
        return enb2;
    }
}
