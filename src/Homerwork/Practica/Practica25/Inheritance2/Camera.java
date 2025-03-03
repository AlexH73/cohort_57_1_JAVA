package Homerwork.Practica.Practica25.Inheritance2;

//2. Класс Camera, наследуется от MusicPlayer
//🔹 Добавляет метод takePhoto().
public class Camera extends MusicPlayer {
    protected void takePhoto() {    //Теперь все потомки Camera смогут делать фото и воспроизводить музыку.
        System.out.println("Снимок сделан!");
    }
}
