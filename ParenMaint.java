class ParenMaint {
    int parentValue;

    ParenMaint(int value) {
        this.parentValue = value;
    }
}

class Child extends ParenMaint {
    int childValue;

    Child(int parentValue, int childValue) {
        super(parentValue);
        this.childValue = childValue;
    }

    void displayValues() {
        System.out.println("Parent Value: " + parentValue);
        System.out.println("Child Value: " + childValue);
    }
}

 class ParenMaint {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.displayValues();
    }
}
