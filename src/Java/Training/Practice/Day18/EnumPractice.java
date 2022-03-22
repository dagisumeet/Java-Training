package Java.Training.Practice.Day18;

import java.util.EnumSet;

public class EnumPractice {

    public static void main(String[] args) {

        System.out.println(WeekDays.FRIDAY.getAbbr());
        System.out.println(WeekDays.SATURDAY.getAbbr());

        //More method practice for Enum
        EnumSet<WeekDays> always = EnumSet.allOf(WeekDays.class); // This .allof method will print all of Enum list elements.
        EnumSet<WeekDays> never = EnumSet.noneOf(WeekDays.class);// This .noneof mehtod will print no element.
        EnumSet<WeekDays> workingDays = EnumSet.range(WeekDays.MONDAY, WeekDays.FRIDAY); // This .range method will print the range of element from one point to another.
        EnumSet<WeekDays> selectedDays = EnumSet.of(WeekDays.MONDAY, WeekDays.TUESDAY, WeekDays.THURSDAY); //This .of method will print the particular element as we selected by us.

        System.out.println(always);
        System.out.println(never);
        System.out.println(workingDays);
        System.out.println(selectedDays);

        /* Thus, Enum class basically have two of the usages here. At first, we use it to get the abbreviation value of the Enum element,
        and later we used as a Enum list to get those elements in a particular manner.
         */
    }
}
