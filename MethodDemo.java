//difference bw methods and block
//block excuting automatic
//methods are not excutes
// blocks doesnot have identity
// methods have identity
// blocks are excute  the way mention program from top to bottom,where as 
//methods are excutes the way/order calling
class MethodDemo{
static {
System.out.println("static block");
return  120 ;
}
static {
System.out.println("static block1");
}
static void m1(){
System.out.println("static m1");
}
public static void main(String[] r)
{System.out.println("main method");
MethodDemo.m1();
}
}