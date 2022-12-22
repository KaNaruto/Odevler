public class odev5 {
    public static void main(String[] args) {
        int x = 10;
        int y = fibonacci(x);
        System.out.println(y);
    }

    public static int fibonacci(int number1) {
        int bas = 1;
        int temp = 1;
        int fibo = 1;
        for (int i = 2; i <= number1; i++) {
            temp = fibo;
            fibo += bas;
            bas = temp;
        }
        return bas;
    }
}