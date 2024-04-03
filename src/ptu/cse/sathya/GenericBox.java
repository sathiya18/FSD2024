package ptu.cse.sathya;

public class GenericBox<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        // Create an instance of GenericBox for Integers
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10); // Autoboxing converts int to Integer
        System.out.println("Integer Value: " + integerBox.get());

        // Create an instance of GenericBox for Strings
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello Generics");
        System.out.println("String Value: " + stringBox.get());
    }
}
