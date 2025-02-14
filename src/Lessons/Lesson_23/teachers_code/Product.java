package Lessons.Lesson_23.teachers_code;

public class Product {
    private String name;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    // вопросик: менять или нет?
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (new Validator().validate()) {
            this.price = price;
            System.out.println("Цена была изменена");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            return;
        }
        this.stock = stock;
    }
}
