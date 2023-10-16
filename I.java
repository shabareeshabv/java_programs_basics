 //interfaces
 //rules of interfaces
//abstract  interface I{
//}
// 1.we can abstarct keyword on top of interface but compiler will delete
//2.we can write extencds keyword on top of iterface but noy for interacting with classes only interact interfaces
// 3.by default variable of interface are public static final
/*
4. we cant write private ,protected variables
5.we cant declare variables
6. by default interface methods are public abstarct
7. we cant write concrete methods
8. the combinTION OF ABSTRACT  final,publi,private are illigal	
we cant write static methods,static blocks
we cant create for object for interface
we can use/ create  references 
we cant write static ,non static ,interface
*/
interface J{
}
abstarct interface I extends J{

int a=111;
public int b=222;
private int c=333;
protected int d=444;
}
 