package Lessons.Lesson_30.comparator_usage;

import java.util.Comparator;

public class HouseYearOfBuildComparator implements Comparator<House30> {
    @Override
    public int compare(House30 house1, House30 house2) {
        return house1.getYearOfBuild() - house2.getYearOfBuild();
    }
}
