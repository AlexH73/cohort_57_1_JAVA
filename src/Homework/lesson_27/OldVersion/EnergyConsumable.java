package Homework.lesson_27.OldVersion;
//4.Интерфейс нужен для того, чтобы учитывать расход энергии каждого умного устройства
public interface EnergyConsumable {
    void updateEnergyConcumption(double amount); //увеличивает расход энергии, если устройство включено
    double getEnergyConsumption();  //возвращает текущее потребление энергии
}
