package java_selfedu.les22;

abstract class Person implements PersonInterface {
    //base abstract class
    public static Integer countClients = 0; // подсчет количества клиентов
    public static Integer countEmploy = 0; //  подсчет количества сотрудников
    private String fio;
    private Integer yearBorn;
    private String subdivision = null;
    private String phone;
    private String adress;

    public  Integer getCountClients() {
        return countClients;
    }

    public  void setCountClients(Integer countClients) {
        Person.countClients = countClients;
    }

    public  Integer getCountEmploy() {
        return countEmploy;
    }

    public void setCountEmploy(Integer count) {
        Person.countEmploy = count;
    }

    public Person(String fio, Integer yearBorn, String subdivision, String phone, String adress) {
        this.fio = fio;
        this.yearBorn = yearBorn;
        this.subdivision = subdivision;
        this.phone = phone;
        this.adress = adress;
    }

    public Integer getYearBorn() {
        return yearBorn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}