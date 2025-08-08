public class A
{
    public static void main(String[] args) {
       int findFactorial=3;
       long factorial=1;
        for (int i = 1; i <= findFactorial; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial: " + factorial);
    }
}