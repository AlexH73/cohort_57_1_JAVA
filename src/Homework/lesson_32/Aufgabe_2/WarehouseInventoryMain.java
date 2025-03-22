package Homework.lesson_32.Aufgabe_2;

public class WarehouseInventoryMain {
    public static void main(String[] args) {
        WarehouseInventory ware = new WarehouseInventoryImpl();

        ware.addItem("Monitor",25);
        ware.addItem("Tastatur", 40);
        ware.addItem("Maus", 30);

        System.out.println("Monitor menge: " + ware.getQuantity("Monitor"));
        System.out.println("Kamera: " + ware.getQuantity("Kamera"));

        ware.updateQuantity("Monitor", 20);
        System.out.println("Monitor menge hat sich geendert: " + ware.getQuantity("Monitor"));

        ware.removeItem("Tastatur");
        System.out.println("Vorhanden Tastatur: " + ware.getQuantity("Tastatur"));

        System.out.println("Alle Items am Lager: " + ware.getAllItems());

        ware.clearInventory();
        System.out.println("Alle Items Leer " + ware.isInventoryEmpty());
    }
}
