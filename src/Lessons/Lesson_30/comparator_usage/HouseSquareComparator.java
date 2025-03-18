package Lessons.Lesson_30.comparator_usage;

import java.util.Comparator;

public class HouseSquareComparator implements Comparator<House> {

    @Override
    public int compare(House o1, House o2) {
        if (o1.getSquare() > o2.getSquare()) {
            return 1;
        } else if (o1.getSquare() < o2.getSquare()) {
            return -1;
        } else {
            return 0;
        }
    }
}
