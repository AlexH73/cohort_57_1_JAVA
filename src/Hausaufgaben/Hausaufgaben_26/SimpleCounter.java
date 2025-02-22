package Hausaufgaben.Hausaufgaben_26;

public class SimpleCounter {
    public void count() {
        for(int i = 1;
            i <= 10;
            i++) {
            if(i%2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }
    public static void main(String args[]){
        SimpleCounter sc = new SimpleCounter();
        sc.count();
    }
}

