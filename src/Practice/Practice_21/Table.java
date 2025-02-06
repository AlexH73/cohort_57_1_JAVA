package Practice.Practice_21;

public class Table {
    String typ ;
    String material ;
    int height;
    int preis;
    String color;

    @Override
    public String toString() {
        return "Table{" +
                "typ='" + typ + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                ", preis=" + preis +
                ", color='" + color + '\'' +
                '}';
    }
}
