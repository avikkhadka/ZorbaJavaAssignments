public class UseOfThis {
    static int length=10;
    int width=5;
    int height=15;
    public static void main(String[] args) {
        System.out.println("Printing length of static variable:"+length);
        UseOfThis areaObject=new UseOfThis();
        System.out.println("Printing width of instance variable:"+areaObject.width);

        //**calculating the area of triangle without using this**//
        int area=areaObject.calcAreaOfTriangle(areaObject.height,areaObject.width);
        System.out.println("Area of the triangle is without using this:"+area);

        //**calculating the area of triangle with the help of this**//

        int area2 = areaObject.calcAreaUsingThis();
        System.out.println("Area of the triangle using this: " + area2);
    }
    public int calcAreaOfTriangle(int width, int height)
    {
      return (width*height)/2;
    }

    public int calcAreaUsingThis() {
        return (this.width * this.height) / 2;
    }

}
