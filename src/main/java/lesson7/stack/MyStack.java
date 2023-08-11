package lesson7.stack;

public class MyStack {

    private String[] elements = new String[7];
    private int index = -1;

    public boolean empty() {
        return index == -1;
    }

    public void push(String element) {
        if (index < elements.length - 1) {
            elements[++index] = element;
        } else {
            System.out.println("Стек переполнен!");
        }
    }

    public String pop() {
        if (empty()) {
            System.out.println("Стек пуст!");
            return null;
        }
        return elements[index--];
    }

    public String peek() {
        if (empty()) {
            System.out.println("Стек пуст!");
            return null;
        }
        return elements[index];
    }

    public int search(String element) {
        for (int i = 0; i <= index; i++) {
            if (elements[i].equals(element)) {
                return index - i + 1;
            }
        }
        return -1;
    }
}