package Other;

public class IntelliJIDEAKeyBindings {

    public static void main(String[] args) {
        System.out.println("\nПолный список команд и сочетаний клавиш для IntelliJ IDEA:");

        // Основные команды и сочетания клавиш для написания кода
        print("\nСоздание метода main: 'psvm' + Tab");
        printDescription("Ввод 'psvm' и нажатие Tab автоматически создает метод public static void main(String[] args) { }.");

        print("\nСоздание метода: 'main' + Tab");
        printDescription("Ввод 'main' и нажатие Tab создает метод main с сигнатурой public static void main(String[] args).");

        print("\nСоздание логгера: 'log' + Tab");
        printDescription("Ввод 'log' и нажатие Tab создает строку для логгирования private static final Logger log = Logger.getLogger(ClassName.class.getName());.");

        print("\nСоздание тестового метода JUnit: 'test' + Tab");
        printDescription("Ввод 'test' и нажатие Tab создает шаблон для тестового метода JUnit @Test public void testName() { }.");

        print("\nСоздание sout: 'sout' + Tab");
        printDescription("Ввод 'sout' и нажатие Tab создает строку System.out.println();.");

        print("\nСоздание fori: 'fori' + Tab");
        printDescription("Ввод 'fori' и нажатие Tab создает стандартный цикл for.");

        print("\nСоздание foreach: 'foreach' + Tab");
        printDescription("Ввод 'foreach' и нажатие Tab создает цикл for-each.");

        print("\nСоздание ifn: 'ifn' + Tab");
        printDescription("Ввод 'ifn' и нажатие Tab создает условие if (variable == null).");

        print("\nСоздание inn: 'inn' + Tab");
        printDescription("Ввод 'inn' и нажатие Tab создает условие if (variable != null).");

        print("\nСоздание inst: 'inst' + Tab");
        printDescription("Ввод 'inst' и нажатие Tab создает оператор if (variable instanceof Type).");

        // Полезные сочетания клавиш
        print("\nАвтодополнение кода: Ctrl+Space (Windows/Linux) или Cmd+Space (Mac)");
        printDescription("Вызов автодополнения кода для текущего контекста.");

        print("\nУмное автодополнение: Ctrl+Shift+Space (Windows/Linux) или Cmd+Shift+Space (Mac)");
        printDescription("Вызов умного автодополнения кода, которое учитывает типы данных.");

        print("\nГенерация кода: Alt+Insert (Windows/Linux) или Cmd+N (Mac)");
        printDescription("Генерация кода, такого как конструкторы, геттеры и сеттеры.");

        print("\nШаблоны живого кода (Live Templates): Ctrl+J (Windows/Linux) или Cmd+J (Mac)");
        printDescription("Вставка шаблонов живого кода, которые могут ускорить написание часто используемых конструкций.");

        print("\nПереключение между открытыми файлами: Ctrl+Tab (Windows/Linux) или Cmd+Tab (Mac)");
        printDescription("Быстрое переключение между открытыми файлами в редакторе.");

        print("\nНавигация по классу: Ctrl+N (Windows/Linux) или Cmd+O (Mac)");
        printDescription("Перейти к классу по его имени.");

        print("\nНавигация по методу: Ctrl+Shift+Alt+N (Windows/Linux) или Cmd+Option+O (Mac)");
        printDescription("Перейти к методу или символу по его имени.");

        print("\nФорматирование кода: Ctrl+Alt+L (Windows/Linux) или Cmd+Option+L (Mac)");
        printDescription("Форматирование кода в соответствии с настройками стиля кода.");

        print("\nОптимизация импортов: Ctrl+Alt+O (Windows/Linux) или Ctrl+Option+O (Mac)");
        printDescription("Оптимизация импортов, удаление неиспользуемых и упорядочивание оставшихся.");

        print("\nКомментарий строки: Ctrl+/ (Windows/Linux) или Cmd+/ (Mac)");
        printDescription("Комментирование или раскомментирование текущей строки или выделенного блока кода.");

        print("\nКомментарий блока: Ctrl+Shift+/ (Windows/Linux) или Cmd+Shift+/ (Mac)");
        printDescription("Комментирование или раскомментирование блока кода.");

        // Навигация
        print("\nПерейти к классу: Ctrl+N (Windows/Linux) или Cmd+O (Mac)");
        printDescription("Быстрое открытие класса по его имени.");

        print("\nПерейти к файлу: Ctrl+Shift+N (Windows/Linux) или Cmd+Shift+O (Mac)");
        printDescription("Быстрое открытие файла по его имени.");

        print("\nПерейти к символу: Ctrl+Shift+Alt+N (Windows/Linux) или Cmd+Option+O (Mac)");
        printDescription("Быстрое открытие символа (метода, переменной) по его имени.");

        print("\nНедавние файлы: Ctrl+E (Windows/Linux) или Cmd+E (Mac)");
        printDescription("Открытие списка недавно открытых файлов.");

        print("\nНазад/вперед: Ctrl+Alt+Left/Right (Windows/Linux) или Cmd+Option+Left/Right (Mac)");
        printDescription("Навигация назад или вперед по истории редактирования.");

        print("\nПерейти к строке: Ctrl+G (Windows/Linux) или Cmd+L (Mac)");
        printDescription("Быстрый переход к указанной строке в текущем файле.");

        // Рефакторинг
        print("\nПереименование: Shift+F6");
        printDescription("Переименование переменной, метода, класса и т.д. с автоматическим обновлением всех ссылок на него.");

        print("\nВыделение метода: Ctrl+Alt+M (Windows/Linux) или Cmd+Option+M (Mac)");
        printDescription("Выделение выбранного кода в новый метод.");

        print("\nВыделение переменной: Ctrl+Alt+V (Windows/Linux) или Cmd+Option+V (Mac)");
        printDescription("Выделение выражения в новую переменную.");

        print("\nВыделение поля: Ctrl+Alt+F (Windows/Linux) или Cmd+Option+F (Mac)");
        printDescription("Выделение выражения в новое поле класса.");

        print("\nВыделение константы: Ctrl+Alt+C (Windows/Linux) или Cmd+Option+C (Mac)");
        printDescription("Выделение выражения в новую константу.");

        // Редактирование
        print("\nКопировать строку вверх/вниз: Ctrl+D / Ctrl+Shift+D (Windows/Linux) или Cmd+D / Cmd+Shift+D (Mac)");
        printDescription("Копирование текущей строки вверх или вниз.");

        print("\nУдалить строку: Ctrl+Y (Windows/Linux) или Cmd+Backspace (Mac)");
        printDescription("Удаление текущей строки.");

        print("\nВставка кода: Ctrl+Shift+Enter");
        printDescription("Автоматическое завершение текущей конструкции кода и переход к следующей строке.");

        // Отладка
        print("\nШаг внутрь: F7");
        printDescription("Шаг внутрь метода при отладке.");

        print("\nШаг через: F8");
        printDescription("Шаг через текущую строку кода при отладке.");

        print("\nШаг из: Shift+F8");
        printDescription("Шаг из текущего метода при отладке.");

        print("\nПродолжить: F9");
        printDescription("Продолжение выполнения программы до следующей точки останова при отладке.");

        print("\nОстановить: Ctrl+F2 (Windows/Linux) или Cmd+F2 (Mac)");
        printDescription("Остановка выполнения программы при отладке.");

        print("\nДобавить точку останова: Ctrl+F8 (Windows/Linux) или Cmd+F8 (Mac)");
        printDescription("Добавление или удаление точки останова на текущей строке.");

        // Общие
        print("\nЗапуск: Shift+F10");
        printDescription("Запуск текущей конфигурации выполнения.");

        print("\nСборка проекта: Ctrl+F9 (Windows/Linux) или Cmd+F9 (Mac)");
        printDescription("Сборка всего проекта.");

        print("\nОткрыть настройки: Ctrl+Alt+S (Windows/Linux) или Cmd+, (Mac)");
        printDescription("Открытие окна настроек IntelliJ IDEA.");

        print("\nПоиск действий: Ctrl+Shift+A (Windows/Linux) или Cmd+Shift+A (Mac)");
        printDescription("Поиск и выполнение любой команды или настройки в IntelliJ IDEA.");

        // Панели инструментов
        print("\nОткрыть/закрыть панель проекта: Alt+1 (Windows/Linux) или Cmd+1 (Mac)");
        printDescription("Открытие или закрытие панели проекта.");

        print("\nОткрыть/закрыть панель структуры: Alt+7 (Windows/Linux) или Cmd+7 (Mac)");
        printDescription("Открытие или закрытие панели структуры.");

        print("\nОткрыть терминал: Alt+F12 (Windows/Linux) или Cmd+Option+T (Mac)");
        printDescription("Открытие встроенного терминала.");

        print("\nОткрыть окно сообщений: Alt+0 (Windows/Linux) или Cmd+0 (Mac)");
        printDescription("Открытие окна сообщений.");

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
