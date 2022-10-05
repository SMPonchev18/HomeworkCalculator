import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose action: ");
        System.out.println("1. Multiplication");
        System.out.println("2. Division");

        int action = sc.nextInt();

        if (action == 1) {
            System.out.println("Choose data type: ");
            System.out.println("1. Int");
            System.out.println("2. Double");
            System.out.println("3. Float");
            System.out.println("4. Byte");
            System.out.println("5. Boolean");
            System.out.println("6. Long");
            System.out.println("7. Short");

            int dataChoice = sc.nextInt();

            if (dataChoice == 1) {
                System.out.println("a = " + Functions.getInt1());

                System.out.println("b = " + Functions.getInt2());
                Functions.IntMulti();
            } else if (dataChoice == 2) {
                System.out.println("a = " + Functions.getDouble1());

                System.out.println("b = " + Functions.getDouble2());
                Functions.DoubleMulti();
            } else if (dataChoice == 3) {
                System.out.println("a = " + Functions.getFloat1());

                System.out.println("b = " + Functions.getFloat2());
                Functions.FloatMulti();
            } else if (dataChoice == 4) {
                System.out.println("a = " + Functions.getByte1());

                System.out.println("b = " + Functions.getByte2());
                Functions.ByteMulti();
            } else if (dataChoice == 5) {
                System.out.println("a = " + Functions.getBool1());

                System.out.println("b = " + Functions.getBool2());
                Functions.BoolCalculation();
            } else if (dataChoice == 6) {
                System.out.println("a = " + Functions.getLong1());

                System.out.println("b = " + Functions.getLong2());
                Functions.LongMulti();
            } else if (dataChoice == 7) {
                System.out.println("a = " + Functions.getShort1());

                System.out.println("b = " + Functions.getShort2());
                Functions.ShortMulti();
            }
        }
        //Dev

        if (action == 1) {
            System.out.println("Choose data type: ");
            System.out.println("1. Int");
            System.out.println("2. Double");
            System.out.println("3. Float");
            System.out.println("4. Byte");
            System.out.println("5. Long");
            System.out.println("6. Short");

            int dataChoice = sc.nextInt();

            if (dataChoice == 1) {
                System.out.println("a = " + Functions.getInt1());

                System.out.println("b = " + Functions.getInt2());
                Functions.IntDev();
            } else if (dataChoice == 2) {
                System.out.println("a = " + Functions.getDouble1());

                System.out.println("b = " + Functions.getDouble2());
                Functions.DoubleDev();
            } else if (dataChoice == 3) {
                System.out.println("a = " + Functions.getFloat1());

                System.out.println("b = " + Functions.getFloat2());
                Functions.FloatDev();
            } else if (dataChoice == 4) {
                System.out.println("a = " + Functions.getByte1());

                System.out.println("b = " + Functions.getByte2());
                Functions.ByteDev();
            } else if (dataChoice == 5) {
                System.out.println("a = " + Functions.getLong1());

                System.out.println("b = " + Functions.getLong2());
                Functions.LongDev();
            } else if (dataChoice == 6) {
                System.out.println("a = " + Functions.getShort1());

                System.out.println("b = " + Functions.getShort2());
                Functions.ShortDev();
            }


        }

    }
}

