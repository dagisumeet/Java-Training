package Java.Training.Practice.Day18;

public enum WeekDays {

    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private String abbr;

    WeekDays(String abbr) {
        this.abbr = abbr;

    }

    public String getAbbr() {
        return abbr;
    }
}
