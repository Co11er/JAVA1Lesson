package java1.lesson6.zoo;

public class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected static int quantity;

    public Animal() {
        quantity++;
    }


    public Animal(String name, int maxRun, int maxSwim) {
        this();
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }


    public void Run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s run " + distance + "\n", this.name);
        } else {
            System.out.printf("%s not run\n", this.name);
        }
    }

    public void Swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s swim " + distance + "\n", this.name);
        } else {
            System.out.printf("%s not swim\n", this.name);
        }
    }


}