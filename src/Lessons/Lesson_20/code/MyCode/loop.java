package Lessons.Lesson_20.code.MyCode;

public class loop {
    public static void main(String[] args) {
        int[] num = new int[10];
        for(int i = 0; i < num.length; i++){
            num[i] = i;
            //num[i] = (int) (Math.random() * 100;
            //System.out.println("num[i] = "+ num[i]);
        }
        for(int i : num) {
            System.out.println("i = " + i);
        }
        for(int i =num.length -1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
