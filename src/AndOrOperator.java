public class AndOrOperator
{
    public static void main(String[] args) {
        int a=5,b=6,c=7;
        if(a%2==0 && b%2==0)
        {
            System.out.println(a + " and "+b+" both are completely divisible by 2");
        }
        else {
            System.out.println(a + " and "+b+" both are not completely divisible by 2");

        }
        if(a%2==0 || c%2==0)
        {
            System.out.println("Either "+a + " nor "+c+ " are completely divisible by 2");
        }
        else {
            System.out.println("Neither "+a + " or "+c+" are completely divisible by 2");

        }
    }
}
