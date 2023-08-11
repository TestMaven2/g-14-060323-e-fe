package lesson7.queue;

public class MyQueue {

    private String[] elements = new String[7];
    private int start = 0;
    private int end = 0;
    private int size = 0;

    public boolean empty() {
        return size == 0;
    }

    public void push(String element) {
        if (end == elements.length - 1) {
            System.out.println("Очередь переполнена!");
            return;
        }
        if (!empty()) {
            end++;
        }
        elements[end] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public String pop() {
        if (empty()) {
            System.out.println("Очередь пуста!");
            return null;
        }
        size--;
        String element = elements[start];
        if (start != end) {
            start++;
        }
        return element;
    }
}