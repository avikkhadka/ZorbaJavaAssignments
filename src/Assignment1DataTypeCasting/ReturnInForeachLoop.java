package Assignment1DataTypeCasting;

public class ReturnInForeachLoop {
    public static void main(String[] args) {
        String [] fruits={"apple","mango","grapes","banana","oranges"};
        for(String fruit:fruits)
        {

            if(fruit=="banana")
            {

                return;
            }
            System.out.println(fruit);
        }
    }
    }

