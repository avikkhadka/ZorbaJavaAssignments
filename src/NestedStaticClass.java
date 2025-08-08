public class NestedStaticClass {
    public static void main(String[] args) {
        NestedStaticClass outerObj=new NestedStaticClass();
        NestedStaticClass.Nested innerObj=new NestedStaticClass.Nested();
        System.out.println(Nested.i);
        System.out.println(innerObj.j);

    }
    static class Nested{
        public static int i=10;
        int j=20;
    }

}
