package java1.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(20, 10));
        System.out.println(number(6));
        System.out.println(compareNumbers(-19));
        number4("Ppp", 10);
        System.out.println(god(2100));
    }

    public static boolean sumNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static String number(int a) {
        return (a <= 0 ? "negative" : "positive");
    }

    public static boolean compareNumbers(int a) {
        if (a <= 0) {
            return true;
        }
        return false;
    }

    public static void number4(String a, int b) {
        for (int i = 0; i <= b - 1; i++) {
            System.out.println(a);
        }
    }

    public static boolean god(int a) {
        return a % 4 == 0 && a % 400 == 0 || a % 100 != 0;
    }

}