package test3.enums;

enum Days {

    MONDAY("MONDAY", "LUNI"), TUESDAY("TUESDAY", "MARTI"), WEDNESDAY("WEDNESDAY", "MIERCURI"),
    THURSDAY("THURSDAY", "JOI"), FRIDAY("FRIDAY", "VINERI"),
    SATURDAY("SATURDAY", "SAMBATA"), SUNDAY("SUNDAY", "DUMINICA");

    String english;
    String romanian;

    Days(String english, String romanian) {
        this.english = english;
        this.romanian = romanian;
    }


    public void printDayOfWeek(Days day) {
        switch (day) {

            case MONDAY:
                System.out.println("It's MONDAY!");
                break;
            case TUESDAY:
                System.out.println("It's TUESDAY!");
                break;
            case WEDNESDAY:
                System.out.println("It's WEDNESDAY!");
                break;
            case THURSDAY:
                System.out.println("It's THURSDAY!");
                break;
            case FRIDAY:
                System.out.println("It's FRIDAY!");
                break;
            case SATURDAY:
                System.out.println("It's SATURDAY!");
                break;
            case SUNDAY:
                System.out.println("It's SUNDAY!");
                break;
            default:
                System.out.println("End of the days!!!!!!");
        }

    }

    public String getLangauge(String langauge) {
        String requestedLanguage = null;
        if (langauge.equals("romanian")) {
            requestedLanguage = romanian;
        } else if (langauge.equals("english")) {
            requestedLanguage = english;
        } else {
            System.out.println("Please provide english or romanian");
        }
        return requestedLanguage;
    }

    public void printDayOfWeek(Days day, String language) {
        switch (day) {
            case MONDAY:
                System.out.println("It's " + MONDAY.getLangauge(language));
                break;
            case TUESDAY:
                System.out.println("It's " + TUESDAY.getLangauge(language));
                break;
            case WEDNESDAY:
                System.out.println("It's " + WEDNESDAY.getLangauge(language));
                break;
            case THURSDAY:
                System.out.println("It's " + THURSDAY.getLangauge(language));
                break;
            case FRIDAY:
                System.out.println("It's " + FRIDAY.getLangauge(language));
                break;
            case SATURDAY:
                System.out.println("It's " + SATURDAY.getLangauge(language));
                break;
            case SUNDAY:
                System.out.println("It's " + SUNDAY.getLangauge(language));
                break;
            default:
                System.out.println("End of the days!!!!!!");
        }
    }

}




