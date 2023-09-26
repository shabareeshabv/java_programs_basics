public class Super {
    public static void main(String[] args){
Child child=new Child();
child.displayMessage();
Child child2=new Child();
child2.displayMessage(); 
//child.super.displayMessage();    
}
}

class Parent{
    void displayMessage(){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    void displayMessage(){
        super.displayMessage();
        System.out.println("child class");
    } 
}