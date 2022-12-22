public class odev8 {
    public static void main(String[] args) {
        int y = enb(7815, 549);
        System.out.println(y);
    }

    public static int enb(int number1, int number2) {
        int enb;
        if (number1 > number2) {
            enb = number1;
        } else {
            enb = number2;
        }
        return enb;
    }
}
