package lesson1.java;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Number exists? - " + getNumber(array, 7));
    }

    private static boolean getNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}