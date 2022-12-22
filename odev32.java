public class odev32 {
    public static void main(String[] args) {
        int[] list1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] list2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] list3 = topla(list1, list2);
        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i] + " ");
        }
    }

    public static int[] topla(int[] a, int[] b) {
        int[] lista = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            lista[i] = a[i] + b[i];
        }
        return lista;
    }
}
