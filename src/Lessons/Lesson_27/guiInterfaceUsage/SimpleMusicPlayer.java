package Lessons.Lesson_27.guiInterfaceUsage;


import javax.swing.*;

class SimpleMusicPlayer implements MusicPlayer {
    private final JLabel statusLabel;

    public SimpleMusicPlayer(JLabel statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public void play() {
        statusLabel.setText("Status: Music playing...");
    }

    @Override
    public void pause() {
        statusLabel.setText("Status: Music paused.");
    }

    @Override
    public void stop() {
        statusLabel.setText("Status: Music stopped.");
    }
}
