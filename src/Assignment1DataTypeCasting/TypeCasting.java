package Assignment1DataTypeCasting;
public class TypeCasting {

        public static void main(String[] args) {
            //double to float
            double doublePi=3.1414123;
            float floatPi=(float)doublePi;
            System.out.println("Double to Float: "+floatPi);

            //float to long
            long longPi=(long) floatPi;
            System.out.println("Float to Long: "+longPi);

            //long to int
            int intPi=(int) longPi;
            System.out.println("Long to int "+intPi);

            //int to short
            int shortPi=(int) intPi;
            System.out.println("int to short "+shortPi);

            //short to byte
            int bytePi=(int) shortPi;
            System.out.println("short to byte "+bytePi);

        }
    }


