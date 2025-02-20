package Lessons.Lesson_25.teachers_code;

public class Image {
    private int hPixel;
    private int wPixel;

    public Image(int hPixel, int wPixel) {
        this.hPixel = hPixel;
        this.wPixel = wPixel;
    }

    public int gethPixel() {
        return hPixel;
    }

    public void sethPixel(int hPixel) {
        this.hPixel = hPixel;
    }

    public int getwPixel() {
        return wPixel;
    }

    public void setwPixel(int wPixel) {
        this.wPixel = wPixel;
    }
}
