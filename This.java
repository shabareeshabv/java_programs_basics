class This{
 public static void main(String[] args)
{ 
    for ( int num=0;num<= 50;num++)
    {
        //if ((num % 3 == 0 || num % 5 == 0) && num % 15 != 0) {
          //if ( (num % 3 == 0 || num % 5 == 0)&&!(num %3==0 && num%5 ==0)){
            if(num%3==0 && num %5==0){
                continue;
            }
            if(num%3==0||num%5==0){
            System.out.print(num + " ");
        }
    }
}
}