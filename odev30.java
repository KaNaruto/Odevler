public class odev30 {
    public static void main(String[] args) {
        int[][] list1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] list2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] list3 = toplama(list1, list2);
        for (int i = 0; i < list3.length; i++) {
            for (int j = 0; j < list3[i].length; j++) {
                System.out.print(list3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] toplama(int[][] a, int[][] b) {
        int[][] toplamList = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                toplamList[i][j] = a[i][j] + b[i][j];
            }
        }
        return toplamList;
    }
}
