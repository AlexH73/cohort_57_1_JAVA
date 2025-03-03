package Homerwork.Practica.Practica25.Inheritance2;

// void makeCall(String number);
public class Smartphone extends SmartDevice {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    protected void makeCall(String number) {
        System.out.println("Звоним на " + number);
    }

    @Override
    protected void takePhoto() {
        super.takePhoto();  //Вызывает родительский метод super.takePhoto(), чтобы сначала сделать снимок.
        System.out.println("Фильтр применен к фото!");  //Затем добавляет фильтр (дополнительное поведение).
    }
}
//Теперь Smartphone умеет:
//✅ Воспроизводить музыку
//✅ Делать фото (с фильтром)
//✅ Включаться
//✅ Звонить