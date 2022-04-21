package java1.lesson6.zoo;

public class Cat extends Animal {

    protected static int quantity;

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        quantity++;
    }


    public void Swim(int distance) {
        System.out.printf("%s no swim\n", this.name);

    }

}