// topic void methods
//void methods which is not carrying any information from called area to calling area 
//or method which is not giving any returns is called void methods
class VoidMethod{

static void m1(){
System.out.println("void m1() method");
int a=10;
int b=20;
int c=a+b;
return;
}

public static void main(String[] s)
{
	System.out.println("main method");
	m1();
}
}
