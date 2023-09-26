public class MyClass {
    static{
        System.out.println("static bloack");

    }
    public MyClass(){
        System.out.println("Constructor Executed");
    }
    public static void main(String[] args){
        System.out.println("main method");
        MyClass ob1=new MyClass();
        MyClass obj2 = new MyClass();
    }
}
