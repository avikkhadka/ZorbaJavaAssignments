//    Write a program to check the instance of keyword in below inheritance example.

package Inheritance;



public class AutoMobile {
    public static void main(String[] args) {
        AutoMobile autoMobileObject=new AutoMobile();
        FourWheeler fourWheelerObject=new FourWheeler();
        BMW bmwObject=new BMW();
        Bike bikeObject=new Bike();
        System.out.println("***************Checking if object of Automobile is an instance of other classes***************");

        System.out.println("auto instance of AutoMobile: "+(autoMobileObject instanceof AutoMobile));
        System.out.println("auto instance of FourWheeler: "+(autoMobileObject instanceof FourWheeler));
        System.out.println("auto instance of BMW: "+(autoMobileObject instanceof BMW));
        System.out.println("auto instance of Bike: "+(autoMobileObject instanceof Bike));

        System.out.println("***************Checking if object of FourWheeler is an instance of other classes***************");
        System.out.println("fourWheelerObject instance of FourWheeler: "+(fourWheelerObject instanceof FourWheeler));
        System.out.println("fourWheelerObject instance of AutoMobile: "+(fourWheelerObject instanceof AutoMobile));
        System.out.println("fourWheelerObject instance of BMW: "+(fourWheelerObject instanceof BMW));

        System.out.println("***************Checking if object of BMW is an instance of other classes***************");
        System.out.println("bmwObject instance of BMW: "+(bmwObject instanceof BMW));
        System.out.println("bmwObject instance of Automobile: "+(bmwObject instanceof AutoMobile));
        System.out.println("bmwObject instance of BMW: "+(bmwObject instanceof FourWheeler));

       System.out.println("***************Checking if object of Bike is an instance of other classes***************");
       System.out.println("bikeObject instance of Bike: "+(bikeObject instanceof Bike));
       System.out.println("bikeObject instance of AutoMobile: "+(bikeObject instanceof AutoMobile));

    }


}

class FourWheeler extends AutoMobile{

}

class BMW extends FourWheeler{

}
class Bike extends AutoMobile{

}


