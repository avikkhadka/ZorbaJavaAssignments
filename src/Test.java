public class Test {
    public static void main(String[] args) {
        int n = 3;
        if (n <= 1) {
            System.out.println(n + " is not prime.");
        } else {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime.");
                    break;
                }
            }
            if (i == n) {
                System.out.println(n + " is prime.");
            }
        }
    }
}
