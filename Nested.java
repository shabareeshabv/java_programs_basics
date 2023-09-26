import java.util.Scanner;

class Nested{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("the number is ");
        int x=scan.nextInt();
        if( x > 0 &&  x<10)
        {
        System.out.println("hii");
        }
        else if (x >10 && x<20)
        {
        System.out.println("hello");
        }
        else if (x>20)
        {
        System.out.println("bye");
        }
    }

    
}




