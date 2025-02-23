package Practice.Practice_26.veterinary_clinic;

/**
 * Перечисление, представляющее цвета для консольного вывода.
 */
public enum Color {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    CYAN("\u001B[36m"),
    PURPLE("\u001B[35m"),
    BLUE("\u001B[34m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
