class Demo{
void m2(){
		System.out.println("demo static method");
		}

}

class StaticMethod{
static void m1()
{
System.out.println("static m1 method");
}
public static void main(String[] r)
{
m1();
StaticMethod.m1();
StaticMethod md=new StaticMethod();
md.m1();
new StaticMethod().m1();
System.out.println("--------");

Demo d=new Demo();
d.m2();
new Demo().m2();
m2();// other class static method we cant call directly.....
}
}

