package gb.sem1.Level2.les1;

public class DayOFWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));

    }

    public static String getWorkingHours(DayOfWeek day) {
        int curIndexDay = day.ordinal();
        int hoursToWork = 0;
        if (curIndexDay > 4 ){
            return "Today is weekend";
        }
        for (DayOfWeek curDay : DayOfWeek.values()) {
            if (curDay.ordinal() >= curIndexDay) {
                hoursToWork += curDay.getWorkHour();
            }
        }
        return Integer.toString(hoursToWork);
    }

}
