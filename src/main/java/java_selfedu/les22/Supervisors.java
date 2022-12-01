package java_selfedu.les22;

class Supervisors extends Person {
// руководители
    public Supervisors(String fio, Integer yearBorn, String subdivision, String phone, String adress) {
        super(fio, yearBorn, subdivision, phone, adress);
        setCountEmploy(getCountEmploy() + 1); // приращиваем счетчик сотрудников при создании класса
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
