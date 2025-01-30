package Other;

import java.util.Properties;

public class GetPropertyExample {
    public static void main(String[] args) {
        // Получаем все системные свойства
        Properties properties = System.getProperties();

        // Вывод всех свойств в заданном формате
        properties.forEach((key, value) -> System.out.println(key + " (" + getPropertyDescription(key.toString()) + "): " + value));
    }

    // Метод для описания ключей свойств
    private static String getPropertyDescription(String key) {
        return switch (key) {
            case "os.name" -> "Операционная система";
            case "os.version" -> "Версия ОС";
            case "java.version" -> "Версия Java";
            case "user.name" -> "Имя пользователя";
            case "user.home" -> "Домашний каталог";
            case "java.vm.specification.vendor" -> "Производитель спецификации виртуальной машины Java";
            case "java.specification.name" -> "Название спецификации Java";
            case "user.script" -> "Пользовательский скрипт";
            case "sun.management.compiler" -> "Компилятор управления Sun";
            case "java.runtime.version" -> "Версия среды выполнения Java";
            case "stdout.encoding" -> "Кодировка стандартного вывода";
            case "path.separator" -> "Разделитель пути";
            case "java.runtime.name" -> "Имя среды выполнения Java";
            case "file.encoding" -> "Кодировка файла";
            case "java.vm.name" -> "Имя виртуальной машины Java";
            case "java.vendor.url.bug" -> "URL для сообщения об ошибках поставщика Java";
            case "java.io.tmpdir" -> "Временный каталог Java";
            case "user.dir" -> "Текущий каталог пользователя";
            case "os.arch" -> "Архитектура операционной системы";
            case "java.vm.specification.name" -> "Название спецификации виртуальной машины Java";
            case "sun.os.patch.level" -> "Уровень патча операционной системы Sun";
            case "native.encoding" -> "Родная кодировка";
            case "java.library.path" -> "Путь к библиотекам Java";
            case "java.vm.info" -> "Информация о виртуальной машине Java";
            case "stderr.encoding" -> "Кодировка стандартного потока ошибок";
            case "java.vendor" -> "Поставщик Java";
            case "java.vm.version" -> "Версия виртуальной машины Java";
            case "sun.io.unicode.encoding" -> "Кодировка Unicode в Sun IO";
            case "java.class.version" -> "Версия класса Java";
            default -> "Нет описания";
        };
    }
}
