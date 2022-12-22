public class odev27 {
    public static void main(String[] args) {
        int[][] list = { { 2, 5 }, { 4, 9 } };
        int[] newList = index(list);
        System.out.println(newList[0] + " " + newList[1]);
    }

    public static int[] index(int[][] a) {
        int enb = a[0][0];
        int satir = 0;
        int sutun = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > enb) {
                    enb = a[i][j];
                    satir = i;
                    sutun = j;
                }
            }
        }
        int[] index = { satir, sutun };
        return index;
    }
}
