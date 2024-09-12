package Challenge.WeekDaysAndWeekend;

public class EnumsTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        for(Days day:Days.values()){
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}
