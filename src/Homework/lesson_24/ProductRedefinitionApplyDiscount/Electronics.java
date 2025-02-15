package Homework.lesson_24.ProductRedefinitionApplyDiscount;
// 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.

//Подкласс Electronics, наследуется от Product
public class Electronics extends Product {

    //Конструктор
    public Electronics(String name, double price) {
        super(name, price);

    }
    //Переопределенный метод applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();      //Вызывает метод из родительского класса
        price *=  0.9;              //снижаем цену на 10%
        System.out.println("Скидка на электронику: 10 %.");
    }
}
