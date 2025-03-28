package Lessons.Lesson_25.teachers_code;

public class Code25 {
    public static void main(String[] args) {
        System.out.println("hello lesson 25");
        System.out.println("hello lesson 25.2");

        Image image = new Image(100, 200);
        JpgImage jpg = new JpgImage(200, 300);
        PngImage png = new PngImage(400, 500);
        PdfImage pdf = new PdfImage(800, 1200);

        showImage(image);
        showImage(jpg);
        showImage(png);
        showImage(pdf);

        System.out.println("pdf instanceof Image = " + (pdf instanceof Image));
        System.out.println("pdf instanceof Image = " + (pdf instanceof PdfImage));
    }

    public static void showImage(Image image) {
        System.out.println("Method only for base Image class");
        System.out.println(image.gethPixel());
        System.out.println(image.getwPixel());
    }

//    public static void showImage(PngImage image) {
//        System.out.println("Method only for PngImage class");
//        System.out.println(image.gethPixel());
//        System.out.println(image.getwPixel());
//    }
//
//    public static void showImage(JpgImage image) {
//        System.out.println("Method only for JpgImage class");
//        System.out.println(image.gethPixel());
//        System.out.println(image.getwPixel());
//    }
}
