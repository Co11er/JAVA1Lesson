package java1.lesson6.zoo;

public class Classwork {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Barbos", 500, 10),
                new Cat("Barsik", 200, 0),
                new Cat("Hora",111, 0)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].Run(100);
            animals[i].Swim(10);

        }
        System.out.print("Animals: " + Animal.quantity);
    }
}
