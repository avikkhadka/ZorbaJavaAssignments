package Assignment1DataTypeCasting;

public class Calculator {
    public static void main(String[] args) {
      int num1=10;
      int num2=3;
      int sum,sub,product,div;

      char operation='/';
      if(operation=='+')
      {
          sum=num1+num2;
          System.out.println("The result of the addition is "+ sum);
      }
        if(operation=='-')
        {
            sub=num1-num2;
            System.out.println("The result of the subtration is "+ sub);
        }
        if(operation=='*')
        {
            product=num1*num2;
            System.out.println("The result of the product is "+ product);
        }
        if(operation=='/')
        {
            div=num1/num2;

            System.out.println("The result of the division is "+ div);
        }
        else {
            System.out.println("Invalid Operation");
        }




    }
}
