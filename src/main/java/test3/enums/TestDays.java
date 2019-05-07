package test3.enums;

public class TestDays {
    public static void main(String[] args) {
        final String RO_LANGUAGE = "romanian";
        final String EN_LANGUAGE = "english";
        Days[] d = Days.values();
        printEnums(d);
        printAlternating(RO_LANGUAGE, EN_LANGUAGE, d);
    }

    private static void printEnums(Days[] d) {
        for (Days day : d) {
            day.printDayOfWeek(day);
        }
    }

    private static void printAlternating(String RO_LANGUAGE, String EN_LANGUAGE, Days[] d) {
        System.out.println("\n\nPrint alternating...");
        for (Days day : d) {
            day.printDayOfWeek(day, RO_LANGUAGE);
            day.printDayOfWeek(day, EN_LANGUAGE);
            System.out.println();
        }
    }
}
