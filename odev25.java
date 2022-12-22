public class odev25 {
    public static void main(String[] args) {
        int[] vize = { 55, 40, 90, 50 };
        int[] final1 = { 91, 10, 70, 80 };
        double[] ort = ortalama(vize, final1);
        for (int i = 0; i < ort.length; i++) {
            System.out.print(ort[i] + " ");
        }
    }

    public static double[] ortalama(int[] a, int[] b) {
        double[] ortalama = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ortalama[i] = (a[i] * 0.40) + (b[i] * 0.6);
        }
        return ortalama;
    }
}
