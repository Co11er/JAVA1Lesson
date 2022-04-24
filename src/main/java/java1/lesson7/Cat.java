package java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(this.appetite);
        System.out.printf("Cat %s eat %d\n", this.name, this.appetite);

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
}