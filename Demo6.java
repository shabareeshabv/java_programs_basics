/*program on nested try and catch

*/
class Demo6{public static void main(String[] a){
	try
	{
		System.out.println("outer try block 1");
		int b=10/0;
		
	try{
		System.out.println("inner  try block 2");
	   }
	catch(StringIndexOutOfBoundsException e){
		System.out.println("inner  catch bloack 3");
		
		
              }
	finally{
			System.out.println("inner  finally  bloack 4");
		
         	}
	}
	catch(Exception e){
		System.out.println("outer catch bloack 5");
		
		
	}
	
	finally{
		System.out.println("outer finally block 6");
	}	
}

}