package Lessons.Lesson_30.comparator_usage;

import java.util.Comparator;

public class HouseSquareComparator implements Comparator<House30> {

    @Override
    public int compare(House30 o1, House30 o2) {
        if (o1.getSquare() > o2.getSquare()) {
            return 1;
        } else if (o1.getSquare() < o2.getSquare()) {
            return -1;
        } else {
            return 0;
        }
    }
}
