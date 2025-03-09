package Lessons.Lesson_27.guiInterfaceUsage;

import javax.swing.*;
import java.awt.*;

public class MusicPlayerGUI {
    public static void main(String[] args) {
        // Создаем фрейм
        JFrame frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);

        // Создаем панель
        JPanel panel = new JPanel();

        // Создаем метку для отображения состояния
        JLabel statusLabel = new JLabel("Status: Ready");
        statusLabel.setPreferredSize(new Dimension(280, 30));

        // Создаем кнопки
        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton stopButton = new JButton("Stop");

        // Создаем экземпляр MusicPlayer
        MusicPlayer player = new SimpleMusicPlayer(statusLabel);

        // Добавляем слушателей событий к кнопкам
        playButton.addActionListener(e -> player.play());
        pauseButton.addActionListener(e -> player.pause());
        stopButton.addActionListener(e -> player.stop());

        // Добавляем компоненты на панель
        panel.add(playButton);
        panel.add(pauseButton);
        panel.add(stopButton);
        panel.add(statusLabel);

        // Добавляем панель в фрейм
        frame.add(panel);

        // Отображаем фрейм
        frame.setVisible(true);
    }
}
