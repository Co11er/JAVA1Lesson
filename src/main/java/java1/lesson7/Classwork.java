package java1.lesson7;

public class Classwork {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(21);
        Cat[] cats = {
                new Cat("Barsik", 10, false),
                new Cat("Murzik", 12, false),
                new Cat("Riz", 13, false),
        };

        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].satiety && cats[i].getAppetite() <= bowl.getFood()) {
                cats[i].eat(bowl);
            }else {
                System.out.printf("cats %s ne poel\n",cats[i].getName());
            }
        }
        bowl.info();
    }
}