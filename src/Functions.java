import java.util.Scanner;

public class Functions {
    private static byte Byte1;
    private static byte Byte2;
    private static int Int1;
    private static int Int2;

    private static short Short1;
    private static short Short2;

    private static long Long1;
    private static long Long2;

    private static double Double1;
    private static double Double2;

    private static float Float1;
    private static float Float2;

    private static boolean Bool1;
    private static boolean Bool2;

    static Scanner sc = new Scanner(System.in);


    public static byte getByte1() {
        Byte1=sc.nextByte();
        return Byte1;
    }

    public static byte getByte2() {
        Byte2=sc.nextByte();
        return Byte2;
    }

    public static boolean getBool1() {
        Bool1=sc.nextBoolean();
        return Bool1;
    }

    public static boolean getBool2() {
        Bool2=sc.nextBoolean();
        return Bool2;
    }

    public static int getInt1() {
        Int1=sc.nextInt();
        return Int1;
    }

    public static int getInt2() {
        Int2=sc.nextInt();
        return Int2;
    }

    public static double getDouble1() {
        Double1=sc.nextDouble();
        return Double1;
    }

    public static double getDouble2() {
        Double2=sc.nextDouble();
        return Double2;
    }

    public static float getFloat1() {
        Float1=sc.nextFloat();
        return Float1;
    }

    public static float getFloat2() {
        Float2=sc.nextFloat();
        return Float2;
    }

    public static long getLong1() {
        Long1=sc.nextShort();
        return Long1;
    }

    public static long getLong2() {
        Long2=sc.nextShort();
        return Long2;
    }
    public static short getShort1() {
        Short1=sc.nextShort();
        return Short1;
    }

    public static short getShort2() {
        Short2=sc.nextShort();
        return Short2;
    }

    public static void IntMulti(){

        System.out.println("Result: " + (Int1 * Int2));
    }
    public static void DoubleMulti(){
        System.out.println("Result: " + (Double1 * Double2));
    }

    public static void FloatMulti(){
        System.out.println("Result: " + (Float1 * Float2));
    }

    public static void ShortMulti(){
        System.out.println("Result: " + (Short1 * Short2));
    }

    public static void LongMulti(){
        System.out.println("Result: " + (Long1 * Long2));
    }

    public static void ByteMulti(){
        System.out.println("Result: " + (Byte1 * Byte2));
    }

    public static void IntDev(){

        System.out.println("Result: " + (Int1 / Int2));
    }
    public static void DoubleDev(){
        System.out.println("Result: " + (Double1 / Double2));
    }

    public static void FloatDev(){
        System.out.println("Result: " + (Float1 / Float2));
    }

    public static void ByteDev(){
        System.out.println("Result: " + (Byte1 / Byte2));
    }

    public static void ShortDev(){ System.out.println("Result: " + (Short1 / Short2));}

    public static void LongDev(){ System.out.println("Result: " + (Long1 / Long2));}

    public static void BoolCalculation(){

        System.out.println("Result: " + (Bool1 | Bool2));
    }




}
