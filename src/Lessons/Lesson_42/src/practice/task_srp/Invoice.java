package Lessons.Lesson_42.src.practice.task_srp;

// — Распишите, как вы разделите этот класс на несколько, чтобы каждый отвечал только за одно действие.
class Invoice {
    private int summeAmount;
    private int konto;
    private String description;

    public Invoice(int summeAmount, int konto, String description) {
        this.summeAmount = summeAmount;
        this.konto = konto;
        this.description = description;
    }

    double calculateTotal() {
        return  ((double) summeAmount) / 100;
    }

    private void printInvoice() {
        System.out.println(" Wurde überwiesen: " + summeAmount + " " + konto + " " + description);
    }

    void saveToFile(String path) {
        System.out.println(" Information wurde gespeichert in File .....");
    }
}
