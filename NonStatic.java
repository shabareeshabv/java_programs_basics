public class NonStatic {
    {
        System.out.println("Instance Block Executed");
    }
    public NonStatic() {
        System.out.println("Constructor Executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Executed");
        NonStatic obj1 = new NonStatic();
        NonStatic obj2 = new NonStatic();
    }
}
