//program on try and catch 

class Test13{
public static void main(String[] args)
        {
try{
System.out.println("Try catch");
//int a=10/0;
//System.out.println("ram".charAt(4));
//int[] a=new int[-1];
System.out.println(new int[] {1,2,3}[2]);
System.out.println(new int[] {1,2,3}[3]);

   } 
catch(ArithmeticException e)
{
   System.out.println("catch block");
   //e.printStackTrace();
}
catch(StringIndexOutOfBoundsException e)
{
   System.out.println("catch block  string");
   //e.printStackTrace();
}
catch(NegativeArraySizeException e)
{
   System.out.println("catch block array");
   //e.printStackTrace();
}
catch(Exception e){
	
	System.out.println("catch bloack exception");



         }
      }
}