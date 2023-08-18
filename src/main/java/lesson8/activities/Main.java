package lesson8.activities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity("a", 1, 3));
        activities.add(new Activity("b", 1, 7));
        activities.add(new Activity("c", 2, 4));
        activities.add(new Activity("d", 5, 9));
        activities.add(new Activity("e", 4, 6));
        activities.add(new Activity("f", 7, 8));

        printActivities(activities);
    }

    public static void printActivities(List<Activity> activities) {
        System.out.println("Исходный список активностей: " + activities);
        activities.sort((x, y) -> x.finish - y.finish);
        System.out.println("Отсортированный список активностей: " + activities);

        List<Activity> result = new ArrayList<>();
        Activity firstActivity = activities.get(0);
        int finish = firstActivity.finish;
        result.add(firstActivity);

        for (int i = 1; i < activities.size(); i++) {
            Activity currentActivity = activities.get(i);
            if (currentActivity.start >= finish) {
                result.add(currentActivity);
                finish = currentActivity.finish;
            }
        }

        // 1 -> 3    4 -> 6    7 -> 8
        System.out.println("Результат: " + result);
    }
}
