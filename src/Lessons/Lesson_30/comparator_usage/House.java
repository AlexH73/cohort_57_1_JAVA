package Lessons.Lesson_30.comparator_usage;

public class House {
    private double square;
    private double pricePerM;
    private int yearOfBuild;
    private int roomCount;
    private int floor;

    public House(int floor, int roomCount, int yearOfBuild, double square) {
        this.floor = floor;
        this.roomCount = roomCount;
        this.yearOfBuild = yearOfBuild;
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPricePerM() {
        return pricePerM;
    }

    public void setPricePerM(double pricePerM) {
        this.pricePerM = pricePerM;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "square=" + square +
                ", pricePerM=" + pricePerM +
                ", yearOfBuild=" + yearOfBuild +
                ", roomCount=" + roomCount +
                ", floor=" + floor +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;

        return Double.compare(getSquare(), house.getSquare()) == 0 && getYearOfBuild() == house.getYearOfBuild()  && getFloor() == house.getFloor();
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(getSquare());
        // result = 31 * result + Double.hashCode(getPricePerM());
        result = 31 * result + getYearOfBuild();
        // result = 31 * result + getRoomCount();
        result = 31 * result + getFloor();
        return result;
    }
}
