public class odev31 {
    public static void main(String[] args) {
        int[] list = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        list = kaydir(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] kaydir(int[] a) {
        int temp1 = 0, temp2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (i < 9) {
                temp1 = a[i + 1];
                a[i + 1] = temp2;
                temp2 = temp1;
            }
            if (i == 9) {
                a[0] = temp1;
            }
        }
        return a;
    }
}
