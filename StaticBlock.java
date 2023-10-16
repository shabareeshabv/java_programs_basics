public class StaticBlock {
    static {
        System.out.println("sb1");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static {
        System.out.println("sb2");
    }

    static {
        System.out.println("sb3");
    }
}
