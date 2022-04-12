package java1.lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
     //   printThreeWords();
     //   checkSumSign();
     //   printColor();
        compareNumbers();


    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = -20;
        int b = -20;
        if ( a + b >= 0 ){
            System.out.println("Summa polohitelnay");
        } else {
            System.out.println("Summa otricatelnay");
        }
    }
    public static void printColor(){
        int value = -5;
        if ( value <=0 ) {
            System.out.println("Red");
        }
        else if (value <= 100) {
            System.out.println("Yellow");
        }else {
            System.out.println("green");
        }
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
