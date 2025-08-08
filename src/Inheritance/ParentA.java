package Inheritance;

import org.w3c.dom.ls.LSOutput;

public class ParentA {
    public static void main(String[] args) {
        ChildB childBObject=new ChildB();
        ParentA parentAObject=new ParentA();
        ParentA parentAObject1=new ChildB();
        System.out.println("*********Checking*********");
        System.out.println("Checking if parent object is an instance of child: "+(parentAObject1 instanceof ChildB));
        System.out.println("Checking if parent object is an instance of parent class: "+(parentAObject1 instanceof ParentA));
    }


}
class ChildB extends ParentA{




}
