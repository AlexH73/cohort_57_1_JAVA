package Lessons.Lesson_47.example;

// ===================== MAIN (UI/Entry Point) =====================
class MainApp {
    public static void main(String[] args) {
        ContactRepository repository = new InMemoryContactRepository();
        ContactService service = new ContactServiceImpl(repository);

        service.addContact(new Contact(1L, "Alice", "+123456789"));
        service.addContact(new Contact(2L, "Bob", "+987654321"));

        System.out.println("All contacts:");
        service.listContacts().forEach(System.out::println);

        System.out.println("\nContact with ID 1:");
        System.out.println(service.getContact(1L));

        service.deleteContact(2L);

        System.out.println("\nContacts after deleting Bob:");
        service.listContacts().forEach(System.out::println);
    }
}
