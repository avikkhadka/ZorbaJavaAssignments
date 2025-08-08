package Assignment1DataTypeCasting;

public class ContinueInFoeachLoop {
    public static void main(String[] args) {
        String [] fruits={"apple","mango","grapes","banana","oranges"};
        for(String fruit:fruits)
        {

            if(fruit=="banana")
            {

                continue;
            }
            System.out.println(fruit);
        }
    }
}
