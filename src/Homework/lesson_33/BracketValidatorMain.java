package Homework.lesson_33;

public class BracketValidatorMain {
    public static void main(String[] args) {
        BracketValidator validator = new BracketValidatorImpl();

        // Beispiel 1: Validierung der Klammersequenz
        String input1 = "( [ ] { } )";
        System.out.println("Input: " + input1);
        System.out.println("Is valid: " + validator.isValidBracketSequence(input1));

        // Beispiel 2: Ungültige Sequenz
        String input2 = "[(])";
        System.out.println("\nInput: " + input2);
        System.out.println("Is valid: " + validator.isValidBracketSequence(input2));
        System.out.println("Invalid indexes: " + validator.getInvalidBracketIndexes(input2));

        // Beispiel 3: Fehlerhafte Klammerfolge reparieren
        String input3 = "{[}";
        System.out.println("\nInput: " + input3);
        System.out.println("Is valid: " + validator.isValidBracketSequence(input3));
        System.out.println("Invalid indexes: " + validator.getInvalidBracketIndexes(input3));
        System.out.println("Fixed sequence: " + validator.fixBracketSequence(input3));

        // Beispiel 4: Bereits korrekte Klammerfolge
        String input4 = "{[( )]}";
        System.out.println("\nInput: " + input4);
        System.out.println("Is valid: " + validator.isValidBracketSequence(input4));
        System.out.println("Invalid indexes: " + validator.getInvalidBracketIndexes(input4));
        System.out.println("Fixed sequence: " + validator.fixBracketSequence(input4));
    }
}


