public class odev6 {
    public static void main(String[] args) {
        int x = 10;
        int y = fac(x);
        System.out.println(y);
    }

    public static int fac(int number1) {
        int faktoriyel = 1;
        for (int i = number1; i > 1; i--) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
