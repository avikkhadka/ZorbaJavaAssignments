package Assignment1DataTypeCasting;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a=12,b=12;
        //comparing ==
        if(a==b)
        {
            System.out.println(a+" is equal to "+b);

        }
        //comparing !=
        if(a!=b)
        {

            if(a>b)
            {
                System.out.println(a+" is greater than "+b);
            }
            if(a<b)
            {
                System.out.println(a+" is less than "+b);
            }
            if(a>=b)
            {
                System.out.println(a+" is greater or equal to "+b);

            }
            if(a<=b)
            {
                System.out.println(a+" is less or equal to "+b);

            }

        }




    }
}
