package lesson7.stack;

public class StackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        System.out.println("Пустой ли стек? - " + stack.empty());

        stack.push("A");

        System.out.println("Пустой ли стек? - " + stack.empty());

        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        stack.push("G");
        stack.push("H");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.search("B"));
        System.out.println(stack.search("C"));
        System.out.println(stack.search("X"));
    }
}
