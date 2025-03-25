package EigenesProjeckt;

public class A_03TeilenDurch3und5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 70; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Durch Beide: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Durch Drei: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Durch Fünf: " + i);
            } else {
                System.out.println(i);
            }
        }

    }
}

