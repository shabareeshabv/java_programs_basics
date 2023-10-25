//hashcode concept
/* hachcode povide memory identifiaction number which s given by jvm without checking content
*/
package com.nit;
class Studentclass{
 int sid=101;
String name="ram";
Studentclass(int sid,String name){
	this.sid=sid;
	this.name=name;
}
@Override
public String toString(){
return sid+"....."+name;
}	
@Override
public int hashCode{
	return sid+sname.hashCode();
	
	
	
}
@Override
public boolean equals(Object o){
	
}
public static void main(String[] args)
{
Studentclass s1=new Studentclass( 101,"ram");

Studentclass s2=new Studentclass( 102,"ram");
System.out.println("s1:"+s1+"...."+s1.hashCode());
System.out.println("s2:"+s2+"...."+s2.hashCode());
	
}
}