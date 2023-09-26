public class Wrapper{
    public static void main(String[] args) {
        System.out.println("Data Type: byte");
        System.out.println("Size: " + Byte.SIZE + " bits (" + (Byte.SIZE / 8) + " bytes)");
        System.out.println("Min Value: " + Byte.MIN_VALUE);
        System.out.println("Max Value: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: short");
        System.out.println("Size: " + Short.SIZE + " bits (" + (Short.SIZE / 8) + " bytes)");
        System.out.println("Min Value: " + Short.MIN_VALUE);
        System.out.println("Max Value: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: int");
        System.out.println("Size: " + Integer.SIZE + " bits (" + (Integer.SIZE / 8) + " bytes)");
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Data Type: long");
        System.out.println("Size: " + Long.SIZE + " bits (" + (Long.SIZE / 8) + " bytes)");
        System.out.println("Min Value: " + Long.MIN_VALUE);
        System.out.println("Max Value: " + Long.MAX_VALUE);
    }
}
