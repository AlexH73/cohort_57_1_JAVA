package Homework.lesson_27.OldVersion;


public  class SmartSpeaker extends SmartDevice {
    private String playingTrack;
    private int volumeLevel;

    public void playMusic(String track) {
        playingTrack = track;
        System.out.println(getDeviceName() + "воспроизведение трека: " + playingTrack);
    }

    public void adjustVolume(int level) {
        volumeLevel = level;
        System.out.println(getDeviceName() + "громкость установлена на " + volumeLevel);
    }

    @Override
    public String getDeviceName() {
        return "Умная колонка ";
    }
}
