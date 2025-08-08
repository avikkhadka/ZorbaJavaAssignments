public class Test {
    public static void main(String[] args) {
        int N = 121;
        int D = 1;
        int count = 0;

        int number = N;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == D) {
                count++;
            }
            number = number / 10;
        }

        System.out.println("Digit " + D + " occurs " + count + " times in number " + N);
    }
}
