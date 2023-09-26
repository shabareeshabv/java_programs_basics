class Parent {
    void displayMessage() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    void displayMessage() {
        super.displayMessage(); // Call the parent class method using super
        System.out.println("This is the child class method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        
        // Access the overridden method in the child class
        child.displayMessage();
        
        // Access the parent class method using super
        child.super.displayMessage();
    }
}
