package Practice.Practice_21;

public class BookUsage {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.tittle = "1984";
        book1.autor = "George Orwell";
        book1.pages = 328;

        System.out.println("book1.title = " + book1.tittle);
        System.out.println("book1.autor = " + book1.autor);
        System.out.println("book1.pages = " + book1.pages);
        System.out.println("book1 = " + book1);

        Book book2 = new Book();

        book2.tittle = "Brave New World";
        book2.autor = "Aldous Huxley";
        book2.pages = 311;

        System.out.println("book2.tittle = " + book2.tittle);
        System.out.println("book2.autor = " + book2.autor);
        System.out.println("book2.pages = " + book2.pages);
        System.out.println("book2 = " + book2);

    }
}
