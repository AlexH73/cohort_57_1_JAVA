package Lessons.Lesson_21.teachers_code;

// класс может называться как угодно,
// назван он так, только потому что мы хотим тут посмотреть использование класса Pen
public class PenUsage {
    public static void main(String[] args) {
        Pen iliasPen = new Pen();

        System.out.println(iliasPen.getClass());

        Image red = new Image();
        Image blue = new Image();

        // присвоили значения для полей конкретного экземпляра класса:
        red.heightPixels = 50;
        red.widthPixels = 50;

        blue.widthPixels = 30;
        blue.heightPixels = 70;


        System.out.println("red.widthPixels = " + red.widthPixels);
        System.out.println("red.heightPixels = " + red.heightPixels);

        System.out.println("blue.heightPixels = " + blue.heightPixels);
        System.out.println("blue.widthPixels = " + blue.widthPixels);

        red.fileName = "Red file";
        red.fileType = "jpg";

        blue.fileName = "Blue file";
        blue.fileType = "png";

        System.out.println("red == blue = " + (red == blue));
        System.out.println("red instanceof Image = " + (red instanceof Image));



        // MailUser - тип данных
        // ilias - это конкретный объект
        // alexander - это конкретный объект
        MailUser ilias = new MailUser();
        MailUser alexander = new MailUser();

        // str1 - это конкретный объект
        String str1 = "hello";


    }
}
