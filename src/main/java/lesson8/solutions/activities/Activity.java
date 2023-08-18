package lesson8.solutions.activities;

public class Activity {

    String name;
    int start;
    int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return String.format("%s: %d -> %d", name, start, finish);
    }
}