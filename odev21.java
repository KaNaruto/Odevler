public class odev21 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        list = arttirma(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] arttirma(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
        return a;
    }
}
