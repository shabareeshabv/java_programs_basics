// topic is non void method

//void 1. not return values 2.we call directly 3.we cant fromsop and from initilization  non void 1.return some values  2. we can call directly  3.we can call from intilzation place
class Method2{
 boolean m1(){
System.out.println("boolen");
return true;
 }
 int m2(){
	 System.out.println("m2 method");
	 return 111;
 }
public static void main(String[]  a)
{
	Method2 md=new Method2();
	md.m1();
	System.out.println(md.m1());
	boolean b1=md.m1();
	System.out.println("b1 \n"+b1);
	System.out.println("b1"+b1);
	//m1();
	System.out.println(md.m2());
	
}

}
