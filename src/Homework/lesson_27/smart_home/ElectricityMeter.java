package Homework.lesson_27.smart_home;

/**
 * Интерфейс для учёта энергопотребления.
 */
public interface ElectricityMeter {
    String measurement = "kWh";
    double energyConsumption();
}
