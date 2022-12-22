public class odev19 {
    public static void main(String[] args) {
        int[] list = { 2, 5, 2, 9, 1, 11, 18 };
        int y = index(list);
        System.out.println(y);
    }

    public static int index(int[] a) {
        int enk = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (enk > a[i]) {
                enk = a[i];
                index = i;
            }
        }
        return index;
    }
}
