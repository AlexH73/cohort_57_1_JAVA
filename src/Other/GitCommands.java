package Other;

public class GitCommands {

    public static void main(String[] args) {
        System.out.println("\nПолный список команд для Git:");

        // Основные команды Git
        print("\ngit init");
        printDescription("Инициализирует новый репозиторий Git.");

        print("\ngit clone <repository>");
        printDescription("Клонирует удаленный репозиторий.");

        print("\ngit status");
        printDescription("Показывает состояние рабочего каталога и индекса.");

        print("\ngit add <file>");
        printDescription("Добавляет файл в индекс (стадию).");

        print("\ngit commit -m \"message\"");
        printDescription("Фиксирует изменения с сообщением о коммите.");

        print("\ngit push");
        printDescription("Отправляет изменения в удаленный репозиторий.");

        print("\ngit pull");
        printDescription("Получает изменения из удаленного репозитория и сливает их с текущей веткой.");

        print("\ngit fetch");
        printDescription("Получает изменения из удаленного репозитория, но не сливает их.");

        print("\ngit merge <branch>");
        printDescription("Сливает указанную ветку с текущей веткой.");

        print("\ngit branch");
        printDescription("Выводит список локальных веток.");

        print("\ngit branch <branch>");
        printDescription("Создает новую ветку.");

        print("\ngit checkout <branch>");
        printDescription("Переключается на указанную ветку.");

        print("\ngit checkout -b <branch>");
        printDescription("Создает новую ветку и переключается на нее.");

        print("\ngit log");
        printDescription("Выводит историю коммитов.");

        print("\ngit diff");
        printDescription("Показывает изменения, которые не были зафиксированы.");

        print("\ngit stash");
        printDescription("Временно сохраняет незавершенные изменения для очистки рабочего каталога.");

        print("\ngit stash pop");
        printDescription("Применяет временно сохраненные изменения и удаляет их из хранилища.");

        print("\ngit reset --hard <commit>");
        printDescription("Сбрасывает индекс и рабочий каталог до указанного коммита.");

        print("\ngit remote add <name> <url>");
        printDescription("Добавляет удаленный репозиторий под указанным именем.");

        print("\ngit remote -v");
        printDescription("Выводит список удаленных репозиториев и их URL.");

        print("\ngit tag <tagname>");
        printDescription("Создает тег с указанным именем.");

        print("\ngit rebase <branch>");
        printDescription("Перемещает или объединяет серию коммитов на новую базу.");

        print("\ngit cherry-pick <commit>");
        printDescription("Применяет изменения, внесенные в один коммит, к другой ветке.");
    }

    // Метод для вывода строки в консоль
    private static void print(String message) {
        System.out.println(message);
    }

    // Метод для вывода описания в консоль
    private static void printDescription(String description) {
        System.out.println("  └─ " + description);
    }
}
