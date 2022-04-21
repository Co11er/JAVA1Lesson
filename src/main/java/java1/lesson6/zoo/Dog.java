package java1.lesson6.zoo;

public class Dog extends Animal {

    protected static int quantity;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        quantity++;
    }


}
