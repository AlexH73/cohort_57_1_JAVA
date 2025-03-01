package Homework.lesson_27;

/**
 * Интерфейс для учёта энергопотребления.
 */
public interface ElectricityMeter {
    String measurement = "kWh";
    double energyConsumption();
}
