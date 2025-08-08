public class SumOfArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int product = 1;
        //sum of arrays
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of the given arrays is "+sum);
        for(int j=0;j<arr.length;j++)
        {
            product=product*arr[j];
        }
        System.out.println("The product of the given arrays is "+product);

    }



}
