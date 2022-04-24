package java1.lesson7;

public class Bowl {
    private int food;


    public Bowl(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;

    }

    public void increaseFood(int amount) {
        food += amount;

    }

    public void info() {
        System.out.println("Bowl food " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
