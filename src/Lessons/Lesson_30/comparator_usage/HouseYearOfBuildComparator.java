package Lessons.Lesson_30.comparator_usage;

import java.util.Comparator;

public class HouseYearOfBuildComparator implements Comparator<House> {
    @Override
    public int compare(House house1, House house2) {
        return house1.getYearOfBuild() - house2.getYearOfBuild();
    }
}
