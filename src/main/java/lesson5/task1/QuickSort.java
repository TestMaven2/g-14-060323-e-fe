package lesson5.task1;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1, 9, 2, 5, 0, 3, 8, 3, 9, 3, 1, 7};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivotIndex = helperPivot(array, start, end);
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    // Этот метод распределяет в массиве элементы относительно
    // опорной точки налево и направо и возвращает индекс опорной точки
    public static int helperPivot(int[] array, int start, int end) {
        int pivot = array[end];
        int pivotIndex = end;

        for (int i = start; i < pivotIndex - 1; i++) {
            if (array[i] >= pivot) {
                swap(array, pivotIndex, pivotIndex - 1);
                pivotIndex--;
                swap(array, i, pivotIndex + 1);
                i--;
            }
        }
        if (array[pivotIndex - 1] > array[pivotIndex]) {
            swap(array, pivotIndex - 1, pivotIndex);
            pivotIndex--;
        }
        return pivotIndex;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
