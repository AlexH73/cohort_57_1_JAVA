package Lessons.Lesson_31.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * Создайте коллекцию типа Set<Song> (например, HashSet<Song>), чтобы хранить песни.
 *
 * Добавьте несколько песен в плейлист, в том числе попытайтесь
 * добавить дубликаты, и убедитесь, что они не сохраняются.
 */
public class Playlist {
    public static void main(String[] args) {
        Set<Song> playList = new HashSet<Song>();

        Song song1 = new Song("Звездное лето", "Пугачева");
        Song song2 = new Song("Белые розы", "Ласковый май");
        Song song3 = new Song("Звездное лето", "Пугачева");

        playList.add(song1);
        playList.add(song2);
        playList.add(song3);

        System.out.println(playList.size());

        System.out.println(playList);


    }
}
