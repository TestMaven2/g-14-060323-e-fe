package lesson6;

public class DynamicArray {

    private int[] array;
    private int defaultSize = 10;
    private int size = 0;

    public DynamicArray() {
        array = new int[defaultSize];
    }

    public DynamicArray(int size) {
        array = new int[size];
    }

    // Добавляем элемент в конец массива
    public void add(int data) {
        array[size] = data;
        size = size + 1;
    }

    // Удаляем последний элемент
    public void remove() {

    }

    // Удаляем элемент по указанному индексу
    public void removeAt(int index) {

    }

    // Увеличиваем размер массива
    // (создаём новый и копируем элементы в него из старого)
    private void growSize() {

    }

    // Заменяет данные в элементе по переданному индексу
    public void set(int index, int data) {

    }

    // Очищаем весь массив
    public void clean() {

    }

    // Проверяем, есть ли такой элемент в массиве, true - если есть
    public boolean contains(int data) {
        return false;
    }

    // Проверяем, пустой ли массив
    public boolean isEmpty() {
//        return size == 0; // альтернативный сокращённый способ
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
