package java1.lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
//        replacingNumbers();
//        fillArray();
//        changeArray();
        fillDiagonal();


    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
// цикла и условия заменить 0 на 1, 1 на 0;
    public static void replacingNumbers() {
        int[] arr = {1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.print(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
// одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        // System.out.println(Arrays.deepToString(arr));
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
// длиной len, каждая ячейка которого равна initialValue;
    public static int[] acceptArgument(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void search(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > i) {
                min = 1;
            }
            if (max < i) {
                max = i;
            }
        }
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если
// в массиве есть место, в котором сумма левой и правой части массива равны.
//    public static boolean checkBalance(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += arr[i];
//        }
//        if (sum % 2 != 0) return false;
//        for (int i : arr) {
//
//        }
//    }

}

