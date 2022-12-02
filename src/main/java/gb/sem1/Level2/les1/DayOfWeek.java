package gb.sem1.Level2.les1;

public enum DayOfWeek {
    MONDAY("Понедельник" ,8 ),
    TUESDAY("Вторник" , 8),
    WEDNESDAY("Среда" ,8 ),
    THURSDAY( "Четверг", 8),
    FRIDAY( "Пятница", 7),
    SATURDAY("Суббота" ,0 ),
    SUNDAY( "Воскресенье", 0),
    ;

    private String rusName;
    private int workHour;

    DayOfWeek(String rusName, int workHour) {
        this.rusName = rusName;
        this.workHour = workHour;
    }

    public String getRusName() {
        return rusName;
    }

    public int getWorkHour() {
        return workHour;
    }


}
