package java_selfedu.les22;

public class Jobs extends Person{
// работники
    public Jobs(String fio, Integer yearBorn, String subdivision, String phone, String adress) {
        super(fio, yearBorn, subdivision, phone, adress);
        setCountEmploy(getCountEmploy() + 1);
    }

    @Override
    public String getInfo() {
        return "FIO "+getFIO() + " born=" + getYearBorn() + " подразделение= "+ getSubdivision() + " telephone= " + getPhone()
                + " adress= "+ getAdress();
    }

    @Override
    public String getStatus() {
        return getSubdivision();
    }

    @Override
    public String getFIO() {
        return getFio();
    }
}