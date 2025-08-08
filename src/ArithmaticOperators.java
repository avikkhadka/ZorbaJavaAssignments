public class ArithmaticOperators {



    public static void main(String[] args) {
        int a=2,b=4;
        int addition=a+b;
        int subtration=a-b;
        int multiplication=a*b;
        int division=b/2;

        //addition
        System.out.println("Result of the addition is "+addition);
        //subtraction
        System.out.println("Result of the subtraction is "+subtration);
        //multiplication
        System.out.println("Result of the multiplication is "+multiplication);
        //division
        System.out.println("Result of the division is "+division);
        //modulus
        if(b%2==0)
        {
            System.out.println(b+" is completely divisible by "+a);

        }
        if(b>0)
        {
            System.out.println(++b);
        }

    }
}
