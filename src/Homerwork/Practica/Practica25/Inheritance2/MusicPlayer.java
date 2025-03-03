package Homerwork.Practica.Practica25.Inheritance2;
//Шаг 3: Реализация цепочки наследования
//1. Класс MusicPlayer – базовый класс
//🔹 Содержит метод playMusic().
public class MusicPlayer {
    protected void playMusic() { //Все устройства, которые будут наследовать этот класс (через промежуточные классы), смогут играть музыку.
        System.out.println("Воспроизведение музыки...");
    }
}
