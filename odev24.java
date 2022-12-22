public class odev24 {
    public static void main(String[] args) {
        int[] list = { 2, 5, 2, 9, 1, 11, 18, -8, 500 };
        list = buyukKucuk(list);
        System.out.println(list[0] + " " + list[1]);
    }

    public static int[] buyukKucuk(int[] a) {
        int enb = a[0];
        int enk = a[0];
        for (int i = 1; i < a.length; i++) {
            if (enk > a[i]) {
                enk = a[i];
            }
            if (enb < a[i]) {
                enb = a[i];
            }
        }
        int[] list = { enk, enb };
        return list;
    }
}
