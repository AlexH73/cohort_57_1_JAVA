package Practice.ThirdParty;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-7890", "ModelA", 150.5);
        Phone phone2 = new Phone("098-765-4321", "ModelB", 160.2);
        Phone phone3 = new Phone("555-555-5555", "ModelC");

        // Вывод значений переменных
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // Вызов методов receiveCall и getNumber
        phone1.receiveCall("Алексей");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Мария");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Владимир");
        System.out.println("Номер телефона: " + phone3.getNumber());

        // Вызов перегруженного метода receiveCall
        phone1.receiveCall("Алексей", "123-456-7890");
        phone2.receiveCall("Мария", "098-765-4321");
        phone3.receiveCall("Владимир", "555-555-5555");

        // Вызов метода sendMessage
        phone1.sendMessage("111-111-1111", "222-222-2222", "333-333-3333");
    }
}
