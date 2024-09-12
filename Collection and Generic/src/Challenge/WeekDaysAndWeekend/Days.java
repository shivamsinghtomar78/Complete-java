package Challenge.WeekDaysAndWeekend;

public enum Days {
    MONDAY(true),TUESDAY(true),
    WEDSDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false), SUNDAY(false);
    private final boolean isWeekday;

    Days(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return  isWeekday?" Weekday":"Weekend";
    }
}
