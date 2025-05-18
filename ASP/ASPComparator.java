

import java.util.Comparator;

public class ASPComparator implements Comparator<activityproblem> {
    @Override
    public int compare(activityproblem o1, activityproblem o2) {
        return Integer.compare(o1.getFinish(), o2.getFinish());
    }
}
