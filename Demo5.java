//program  try and catch block with non void methods
class Demo5{
static int m1(){
try{
System.out.println("try bloack");
return 111;
}
//System.out.println("this");
catch(Exception e){
System.out.println("catch block");
return 222;
}
//return 444;

finally {
	System.out.println("finally bloack");
	return 333;
}
}
public static void main(String[] a){
System.out.println(m1());

}
}