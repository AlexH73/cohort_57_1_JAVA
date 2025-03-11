package Lessons.Lesson_30.comparator_usage;

import java.util.Comparator;

public class HouseRoomCountComparator implements Comparator<House> {
    @Override
    public int compare(House house1, House house2) {
        return house1.getRoomCount() - house2.getRoomCount();
    }
}
