class ArrayNew{
public static void main(String[] args)
{ String value="hellow";
String value1="hellow1";
String value2="hellow2";
String value3="hellow3";String value4="hellow4";
String[] ref={ value,value1,value2,value3,value4};

for( int i=0;i<ref.length;i++)
System.out.println("forward value is" +ref[i]);
String[] ref1={ value,value1,value2,"bengalore",value4};
 ref1[1]="jaksaofoasjfadjfhu";
System.out.println("value is "+ ref1[1]);
for( int i=ref.length-1;i>=0;i--)
System.out.println("forward value is" +ref1[i]);

}
}