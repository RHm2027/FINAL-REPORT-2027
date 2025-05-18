

import java.util.ArrayList;
import java.util.Collections;

public class mainASP {
    public static void main(String[] args) {
        ArrayList<activityproblem> list = new ArrayList<>();

        list.add(new activityproblem("B1", 1, 3));
        list.add(new activityproblem("B2", 2, 5));
        list.add(new activityproblem("B3", 4, 6));
        list.add(new activityproblem("B4", 6, 7));
        list.add(new activityproblem("B5", 5, 9));
        list.add(new activityproblem("B6", 8, 10));

        Collections.sort(list, new ASPComparator());

        System.out.println("Selected Activities:");
        selectActivities(list); 
    }

    public static void selectActivities(ArrayList<activityproblem> list) {
        if (list.isEmpty()) return;

        activityproblem lastSelected = list.get(0);
        System.out.println(lastSelected);

        for (int i = 1; i < list.size(); i++) {
            activityproblem current = list.get(i);
            if (current.getStart() >= lastSelected.getFinish()) {
                System.out.println(current);
                lastSelected = current;
            }
        }
    }
}
