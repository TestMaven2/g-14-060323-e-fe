package lesson8.solutions.activities;

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

        selectActivities(activities);
    }

    public static void selectActivities(List<Activity> activities) {
        System.out.println(activities);
        activities.sort((x, y) -> x.finish - y.finish);
        List<Activity> result = new ArrayList<>();
        Activity firstActivity = activities.get(0);
        result.add(firstActivity);

        int finishTime = firstActivity.finish;

        for (int i = 1; i < activities.size(); i++) {
            Activity current = activities.get(i);
            if (current.start >= finishTime) {
                result.add(current);
                finishTime = current.finish;
            }
        }
        System.out.println(result);
    }
}