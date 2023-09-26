class StrToInt{
    public static void main(String[] args){
        String str="12345";
        String str1=" 12345";
        try{
            int a=Integer.parseInt(str);
            int b=Integer.parseInt(str1);
            int c=a+b;
            System.out.println("conveted sum is " +c);

        }
        catch(NumberFormatException e){
            System.out.println("invalid"+str);

        }
    }
}